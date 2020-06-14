package com.malik.ithar.ecommercedemoapp.controller;

import com.malik.ithar.ecommercedemoapp.model.InfoModel;
import com.malik.ithar.ecommercedemoapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
public class InfoRestController {

   private final UserService userService;

   @Autowired
    public InfoRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/info")
    @ResponseBody
    public InfoModel pingInfo() {

        InfoModel info = new InfoModel();
        info.setLocalDateTime(LocalDateTime.now());
        info.setMsg("The Battle of Kursk occurred in July 1943 around the Soviet city of Kursk in western Russia, as Germany launched Operation Citadel, Hitler's response to his devastating defeat by the Soviet Red Army at the Battle of Stalingrad.");
        info.setUserCount(userService.findTotalUsers());

        return info;
    }

}
