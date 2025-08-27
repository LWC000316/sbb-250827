package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  // 보통 웹 요청을 처리하는 클래스에 붙임
public class MainController {

    @GetMapping("/") // HTTP GET 요청을 처리하는 메서드임을 나타내는 어노테이션
                         // 예: @GetMapping("/hello") -> /hello 경로로 들어오는 GET 요청 처리
    @ResponseBody
    public String index() {
        return "sbb";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }
}
