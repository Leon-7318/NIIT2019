package com.Leon.controller;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UploadController {
  @RequestMapping("/upload")
  public String UploadHandler() {
    return "redirect:/hello.jsp";
  }

  @RequestMapping("/upload/static")
  public String wriToStatic(HttpServletRequest request,
                          RedirectAttributes redirectAttributes,
                          @RequestParam("uploadFile") MultipartFile file) throws IllegalStateException, IOException {
    if(!file.isEmpty()) {
      //获取目标文件夹
//      String path = request.getServletContext().getRealPath("/") + "resource/test/";
      
      String path = "D:/project/CMS_2.0/WebContent/resource/test";
      
      //获取用户上传的源文件名
      String fileName = file.getOriginalFilename();
      
      System.out.println(path+" "+fileName);
      
      //新建文件
      File file1 = new File(path, fileName);
      //将文件写入
      file.transferTo(file1);

      redirectAttributes.addFlashAttribute("message","upload to static success");
      return "redirect:/upload";
    } else {
      redirectAttributes.addFlashAttribute("message","upload file can not be empty");
      return "redirect:/upload";
    }

  }
}