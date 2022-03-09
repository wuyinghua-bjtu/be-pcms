package com.bepcms.pcms.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class ResultDto<T> {

    private boolean success;

    private String errorMsg;

    private T module;

    public ResultDto(T module,boolean success, String errorMsg) {
        this.module = module;
        this.success = success;
        this.errorMsg = errorMsg;
    }

    public ResultDto ok(T result) {
        return new ResultDto<>(result, true, null);
    }

    public ResultDto error(String errorMsg) {
        return new ResultDto(null, false, errorMsg);
    }

}
