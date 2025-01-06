package com.fitnesfreak.gym.repository;

import com.fitnesfreak.gym.entity.Member;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemberRepository {

    //dummy db
    private Map<Long, Member> members = new HashMap<>();

    //dummy id generator
    private Long id = 0L;
}
