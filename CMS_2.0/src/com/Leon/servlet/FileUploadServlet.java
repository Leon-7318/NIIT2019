/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.servlet;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.tomcat.util.http.fileupload.FileItem;
//import org.apache.tomcat.util.http.fileupload.RequestContext;
//import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
//import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author mi
 */
@WebServlet("/fileUp")
public class FileUploadServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fileName = (String) request.getSession().getAttribute("fileName");
		System.out.println("拿到的fileName值为" + fileName);

		String path = this.getServletContext().getRealPath("/") + "userFile";
		System.out.println("WebRoot的根路径:" + path);

		File file = new File(path);
		if (!file.exists()) {
			file.mkdir();
		}

		DiskFileItemFactory factory = new DiskFileItemFactory();

		ServletFileUpload upload = new ServletFileUpload(factory);

		upload.setHeaderEncoding("utf-8");

		// 判断提交的数据是否是表单数据
		if (!ServletFileUpload.isMultipartContent(request)) {
			System.out.println("提交的不是表单数据");
			return;
		}
		try {
			List<FileItem> items = upload.parseRequest(request);

			for (FileItem item : items) {

				if (item.isFormField()) {
					String name = item.getString();
					String value = new String(name.getBytes("ISO-8859-1"), "utf-8");
					System.out.println("文本框中的值:" + value);
				} else {
					System.out.println("提交的是文件");
					// item.getFieldName();
					String filename = item.getName();
					System.out.println("获取到的上传文件名:" + filename);

					String prefix = filename.substring(filename.lastIndexOf(".") + 1);

					String fName = fileName + "." + prefix;

					InputStream is = item.getInputStream();
					FileOutputStream fos = new FileOutputStream(path + "/" + fName);
					int index = 0;

					while ((index = is.read()) != -1) {
						fos.write(index);
					}
					is.close();
					fos.close();
					item.delete();

					// Connection conn=ConnDB.getConn();
					// String sql="update user set photo=? where id=?";
					// PreparedStatement psta;
					// psta = conn.prepareStatement(sql);
					//
					// psta.setString(1, "userFile/"+fName);
					// psta.setInt(2, id);
					// psta.executeUpdate();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// response.sendRedirect("showOne.jsp?id="+id);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.doGet(request, response);
	}

}
