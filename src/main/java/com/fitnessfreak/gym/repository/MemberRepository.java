package com.fitnessfreak.gym.repository;

import com.fitnessfreak.gym.entity.Member;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
@Data
public class MemberRepository {

    //dummy db
    private Map<Long, Member> members = new HashMap<>();

    //dummy id generator
    private Long id = 0L;

    public Long generateId() {
        return ++id;
    }
}
