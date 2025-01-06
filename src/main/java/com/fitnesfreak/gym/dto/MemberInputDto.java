package com.fitnesfreak.gym.dto;

import com.fitnesfreak.gym.entity.Membership;
import com.fitnesfreak.gym.enums.Gender;
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
