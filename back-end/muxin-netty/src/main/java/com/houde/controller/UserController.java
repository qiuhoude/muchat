package com.houde.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2019-02-06
 * Time: 22:46
 */
@RestController
@RequestMapping("u")
public class UserController {
    @RequestMapping("/hi")
    public String hi() {
        return "hi~~~";
    }
}
