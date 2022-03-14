package com.bepcms.pcms.Service.impl;

import com.bepcms.pcms.Service.UploadFileService;
import com.bepcms.pcms.model.dto.ResultDto;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import sun.nio.ch.IOUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

@Service("UploadFileService")
public class UploadFileServiceImpl implements UploadFileService {

    @Override
    public ResultDto uploadFile(MultipartFile file) {

        String filePath = "D://pcms//uploadFile";

        String fileName = UUID.randomUUID().toString().replace("-", "");

        File targetFile = new File(filePath + File.separator + fileName);

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(targetFile);
            IOUtils.copy(file.getInputStream(), fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            return new ResultDto().error("文件上传失败！");
        } finally {
            try {
                fileOutputStream.close();
                return new ResultDto().ok(null);
            } catch (IOException e) {
                e.printStackTrace();
                return new ResultDto().error("文件上传失败！");
            }
        }

    }
}
