package com.yyf.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Author: yyf
 * Version: 1.0
 * Create Date Time: 2023/4/2 10:29.
 */
@RestController
@RequestMapping("/api")
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "yyf is login";
    }
}