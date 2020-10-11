package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *********************************************************************
 * TODO
 * *********************************************************************
 *
 * @author huangfu
 * @date 2020/10/11 23:27
 */
@RestController
public class TestController {
    @RequestMapping("test")
    public void test(){
        System.out.println("------------------------");
    }
}
