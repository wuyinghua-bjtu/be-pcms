package com.bepcms.pcms.Controller.AdminController;


import com.alibaba.excel.EasyExcel;
import com.bepcms.pcms.Entity.StudentList;
import com.bepcms.pcms.Service.UploadFileService;
import com.bepcms.pcms.Service.impl.ModelExcelListener;
import com.bepcms.pcms.model.dto.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class UploadFileController {

    @Resource
    UploadFileService uploadFileService;

    @PostMapping("/admin/upload/file")
    @ResponseBody
    public ResultDto consoleUploadFile(@RequestParam("file") MultipartFile file) {

        List<StudentList> lists = new ArrayList<>();
        try {
            lists = EasyExcel.read(file.getInputStream(), StudentList.class, new ModelExcelListener()).sheet().doReadSync();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResultDto().ok(lists);
    }

}
