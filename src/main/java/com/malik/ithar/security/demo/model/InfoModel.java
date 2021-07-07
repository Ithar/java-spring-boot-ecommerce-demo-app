package com.malik.ithar.security.demo.model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class InfoModel {

    private LocalDateTime localDateTime;
    private String msg;
    private int userCount;

}
