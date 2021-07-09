package com.malik.ithar.security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccessDeniedController {

    @GetMapping("/403")
    public String pingInfo() {

        return "403";
    }

}
