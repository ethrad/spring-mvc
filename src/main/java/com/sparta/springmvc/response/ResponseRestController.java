package com.sparta.springmvc.response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Controller + ResponseBody
@RequestMapping("/response/rest")
public class ResponseRestController {
    // Content-Type: text/html
    @GetMapping("/json/string")
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":18}";
    }

    // Content-Type: application/json
    @GetMapping("/json/class")
    public Star helloClassJson() {
        return new Star("Daun", 25);
    }
}
