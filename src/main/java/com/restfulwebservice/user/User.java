package com.restfulwebservice.user;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
public class User {

    private Integer id;

    private String name;

    private Date joinDate;
}
