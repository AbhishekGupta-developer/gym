package com.fitnessfreak.gym.service;

import com.fitnessfreak.gym.dto.MemberInputDto;
import com.fitnessfreak.gym.dto.MemberOutputDto;
import com.fitnessfreak.gym.entity.Member;
import com.fitnessfreak.gym.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository memberRepository;

    @Override
    public MemberOutputDto getMember(Long id) {
        MemberOutputDto memberOutputDto = new MemberOutputDto();

        Member member = memberRepository.getMembers().get(id);

        memberOutputDto.setId(member.getId());
        memberOutputDto.setName(member.getName());
        memberOutputDto.setGender(member.getGender());
        memberOutputDto.setPhone(member.getPhone());
        memberOutputDto.setEmail(member.getEmail());
        memberOutputDto.setMembership(member.getMembership());
        memberOutputDto.setDob(member.getDob());

        return memberOutputDto;
    }

    @Override
    public List<MemberOutputDto> getAllMembers() {
        List<MemberOutputDto> memberOutputDtoList = new ArrayList<>();

        List<Member> memberList = new ArrayList<>(memberRepository.getMembers().values());

        for(Member member : memberList) {
            MemberOutputDto memberOutputDto = new MemberOutputDto();

            memberOutputDto.setId(member.getId());
            memberOutputDto.setName(member.getName());
            memberOutputDto.setGender(member.getGender());
            memberOutputDto.setPhone(member.getPhone());
            memberOutputDto.setEmail(member.getEmail());
            memberOutputDto.setMembership(member.getMembership());
            memberOutputDto.setDob(member.getDob());

            memberOutputDtoList.add(memberOutputDto);
        }

        return memberOutputDtoList;
    }

    @Override
    public MemberOutputDto addMember(MemberInputDto memberInputDto) {
        Member member = new Member();

        Long id = memberRepository.generateId();
        member.setId(id);
        member.setName(memberInputDto.getName());
        member.setGender(memberInputDto.getGender());
        member.setPhone(memberInputDto.getPhone());
        member.setEmail(memberInputDto.getEmail());
        member.setMembership(memberInputDto.getMembership());
        member.setDob(memberInputDto.getDob());

        memberRepository.getMembers().put(id, member);

        member = null;

        member = memberRepository.getMembers().get(id);

        MemberOutputDto memberOutputDto = new MemberOutputDto();
        memberOutputDto.setId(member.getId());
        memberOutputDto.setName(member.getName());
        memberOutputDto.setGender(member.getGender());
        memberOutputDto.setPhone(member.getPhone());
        memberOutputDto.setEmail(member.getEmail());
        memberOutputDto.setMembership(member.getMembership());
        memberOutputDto.setDob(member.getDob());

        return memberOutputDto;
    }

    @Override
    public MemberOutputDto updateMember(Long id, MemberInputDto memberInputDto) {
        Member member = new Member();

        member.setId(id);
        member.setName(memberInputDto.getName());
        member.setGender(memberInputDto.getGender());
        member.setPhone(memberInputDto.getPhone());
        member.setEmail(memberInputDto.getEmail());
        member.setMembership(memberInputDto.getMembership());
        member.setDob(memberInputDto.getDob());

        memberRepository.getMembers().put(id, member);

        member = null;

        member = memberRepository.getMembers().get(id);

        MemberOutputDto memberOutputDto = new MemberOutputDto();
        memberOutputDto.setId(member.getId());
        memberOutputDto.setName(member.getName());
        memberOutputDto.setGender(member.getGender());
        memberOutputDto.setPhone(member.getPhone());
        memberOutputDto.setEmail(member.getEmail());
        memberOutputDto.setMembership(member.getMembership());
        memberOutputDto.setDob(member.getDob());

        return memberOutputDto;
    }

    @Override
    public String removeMember(Long id) {
        String name = memberRepository.getMembers().get(id).getName();

        memberRepository.getMembers().remove(id);

        Member member = memberRepository.getMembers().get(id);

        if(member == null)
            return name + " (" + id + ") has been removed!";
        else
            return "Please try again later!";


    }
}
