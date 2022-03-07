package com.bepcms.pcms.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HealthCheckController {
    @ResponseBody
    @GetMapping("/health")
    public String healthCheck() {
        System.out.println("健康检查");
        return "Good Good";
    }
}
