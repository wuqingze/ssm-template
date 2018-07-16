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
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.Base64;

import static javax.xml.transform.OutputKeys.ENCODING;

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

        File file = new File();
        file.setPath(path);
        file.setFile_name(fileName);
        file.setFile_id(fileContent.hashCode());

        fileDao.insert(file);

        fileContent = fileContent.split("base64,")[1];
        out.write(Base64.getDecoder().decode(fileContent));
        out.close();

        pw.write("success");
    }

    @RequestMapping("/download")
    public void download(String path, HttpServletResponse response){
        java.io.File file = new java.io.File(   "d:/wqz/test.png");
        InputStream fis = null;
        OutputStream os = null;
        try {
            if (!file.exists()) {
                response.getWriter().print("文件不存在");
            }
            // 以流的形式下载文件
            fis = new BufferedInputStream(new FileInputStream(file));
            // 设置响应报头
            response.reset();
            response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(file.getName(),"UTF-8"));
            response.addHeader("Content-Length", "" + file.length());
            response.setContentType("image/png");
            response.setCharacterEncoding("UTF-8");

            // 写入响应流数据
            os = new BufferedOutputStream(response.getOutputStream());
            byte[] bytes = new byte[1024];
            while (fis.read(bytes) != -1) {
                os.write(bytes);
            }
        } catch (Throwable e) {
            if (e instanceof Exception) {
                // 浏览器点击取消
                System.out.println("用户取消下载!");
            } else {
                e.printStackTrace();
            }
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
