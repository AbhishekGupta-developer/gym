package com.fitnessfreak.gym.entity;

import com.fitnessfreak.gym.enums.Gender;
import com.fitnessfreak.gym.enums.Membership;
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
