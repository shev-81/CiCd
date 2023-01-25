package com.project.CiCd.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CiCdController {

    @GetMapping
    public String ping(){
        return "Привет я работаю";
    }

    @GetMapping("/test")
    public String work(){
        return "test test test test test";
    }
}
