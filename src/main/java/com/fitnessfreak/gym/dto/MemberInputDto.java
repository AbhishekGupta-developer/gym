package com.fitnessfreak.gym.dto;

import com.fitnessfreak.gym.enums.Membership;
import com.fitnessfreak.gym.enums.Gender;
import lombok.Data;

import java.util.Date;

@Data
public class MemberInputDto {
    private String name;
    private Gender gender;
    private String phone;
    private String email;
    private Membership membership;
    private Date dob;
}
