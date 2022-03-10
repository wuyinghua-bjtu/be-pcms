package com.bepcms.pcms.Controller.Account;

import com.bepcms.pcms.model.dto.ResultDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserInfoController {

    @PostMapping("/account/user/info")
    @ResponseBody
    public ResultDto getUserInfo(HttpServletRequest request, HttpServletResponse response) {
        Map map = new HashMap();
        map.put("username", "吴英华");
        map.put("userTypeCode", "0");
        map.put("userId", "18281220");
        map.put("parentId", "");
        return new ResultDto().ok(map);
    }
}
