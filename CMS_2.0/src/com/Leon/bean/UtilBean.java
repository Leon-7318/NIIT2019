package com.Leon.bean;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component()
public class UtilBean implements Serializable {
	private Integer k = 0;

	public UtilBean() {
	}

	public String getDateTime() {
		SimpleDateFormat sdf = new SimpleDateFormat(" yyyy . MM.dd . E");
		return sdf.format(new Date());
	}

	public String getResourceUrl(String location) {
		String[] str = location.split("\\/");
		String page = str[str.length - 1].split("\\.")[0];
		System.out.println("liang : " + page);
		if (page != null && "front_index".equals(page))
			return "assets";
		else
			return "../assets";
	}

	public void uploadFile(MultipartFile file, String path, String fileName) {
		try {
			// 新建文件
			File file1 = new File(path, fileName);
			// 将文件写入
			file.transferTo(file1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Integer getK() {
		return k;
	}

	public void setK(Integer k) {
		this.k = k;
	}

}
