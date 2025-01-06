package com.fitnesfreak.gym.entity;

import com.fitnesfreak.gym.enums.Gender;
import lombok.Data;

import java.util.Date;

@Data
public class Member {
    private Long id;
    private String name;
    private Gender gender;
    private String phone;
    private String email;
    private Membership membership;
    private Date dob;
}
