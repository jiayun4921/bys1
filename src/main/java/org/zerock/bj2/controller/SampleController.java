package org.zerock.bj2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/sample/")
public class SampleController {

    @GetMapping("/hello")
    public void hello(){
        log.info("hello...");
    }
    @GetMapping("/list")
    public void list(){
        log.info("list...");
    }
}

