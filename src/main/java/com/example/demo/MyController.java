package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * MVC Controller
 * @author PoChin Cheng
 * @version 11.01.2023
 */

@RestController
public class MyController {

    @RequestMapping("greeting")
    public String doGreeting(@RequestParam (name = "name", required = false) String name) {
        if (name != null && !name.isEmpty()) {
            return "Hi there, " + name + "!  I hope you have a nice day.";
        }
        return "Hi There!  I hope you have a nice day.";
    }
}
