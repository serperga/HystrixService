package com.sanuk.histrix.histryxPOC.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {

    @GetMapping(value = "/testcall")
    public String getTestCall(){
        return "Reading an external endpoint";
    }

    @GetMapping(value = "/testcalltimeout")
    public String getTestCallTimeOut(){
        return "Reading an external endpoint with timeout";
    }
}
