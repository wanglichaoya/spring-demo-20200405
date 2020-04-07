package com.javacode.spring20200405.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * describe:
 *
 * @author 王立朝
 * @date 2020/04/05
 */
@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {
    @RequestMapping("/index")
    public String index() {
        return "你好";
    }

}
