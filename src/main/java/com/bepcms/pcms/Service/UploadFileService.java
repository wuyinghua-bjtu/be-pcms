package com.bepcms.pcms.Service;

import com.bepcms.pcms.model.dto.ResultDto;
import org.springframework.web.multipart.MultipartFile;

public interface UploadFileService {

    public ResultDto uploadFile(MultipartFile file);

}
