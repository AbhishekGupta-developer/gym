package com.fitnessfreak.gym.service;

import com.fitnessfreak.gym.dto.MemberInputDto;
import com.fitnessfreak.gym.dto.MemberOutputDto;

import java.util.List;

public interface MemberService {
    MemberOutputDto getMember(Long id);
    List<MemberOutputDto> getAllMembers();
    MemberOutputDto addMember(MemberInputDto memberInputDto);
    MemberOutputDto updateMember(Long id, MemberInputDto memberInputDto);
    String removeMember(Long id);
}
