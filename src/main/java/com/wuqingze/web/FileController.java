package com.wuqingze.web;

import com.wuqingze.dao.FileDao;
import com.wuqingze.entity.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Base64;

/**
 * Created by wuqingze on 2018/7/1.
 */
@Controller
@RequestMapping("/file")
public class FileController {

    @Autowired
    FileDao fileDao ;

//    @RequestMapping(value = "/upload", method = RequestMethod.POST)
//    @RequestMapping("/upload")
//    public void upload(HttpServletRequest request, @RequestParam("file") MultipartFile file, ModelMap model, PrintWriter printWriter) {
//        System.out.println("开始");
//        String path = request.getSession().getServletContext().getRealPath("upload");
//        String fileName = file.getOriginalFilename();
//        // String fileName = new Date().getTime()+".jpg";
//        System.out.println(path);
//        java.io.File targetFile = new java.io.File(path, fileName);
//        if (!targetFile.exists()) {
//            targetFile.mkdirs();
//        }
//
//        // 保存
//        try {
//            file.transferTo(targetFile);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        model.addAttribute("fileUrl", request.getContextPath() + "/upload/" + fileName);
//        printWriter.write("success");
//    }

    @RequestMapping("/upload")
    public void upload(PrintWriter pw,HttpServletRequest request) throws Exception {
        System.out.println("file upload start");
        String fileName = request.getParameter("fileName");
        String fileContent = request.getParameter("fileContent");

        String path = "d:/qlgFiles/";
        java.io.File f = new java.io.File(path,fileContent.hashCode()+"");
        f.createNewFile();
        FileOutputStream out = new FileOutputStream(f);

        fileContent = fileContent.split("base64,")[1];
        out.write(Base64.getDecoder().decode(fileContent));
        out.close();
        pw.write("success");
    }


}
