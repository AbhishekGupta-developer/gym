package com.fitnessfreak.gym.controller;

import com.fitnessfreak.gym.dto.MemberInputDto;
import com.fitnessfreak.gym.dto.MemberOutputDto;
import com.fitnessfreak.gym.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gym/member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping("/{id}")
    public ResponseEntity<MemberOutputDto> getMember(@PathVariable Long id) {
        return new ResponseEntity<>(memberService.getMember(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<MemberOutputDto>> getAllMembers() {
        return new ResponseEntity<>(memberService.getAllMembers(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<MemberOutputDto> addMember(@RequestBody MemberInputDto memberInputDto) {
        return new ResponseEntity<>(memberService.addMember(memberInputDto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MemberOutputDto> updateMember(@PathVariable Long id, @RequestBody MemberInputDto memberInputDto) {
        return new ResponseEntity<>(memberService.updateMember(id, memberInputDto), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> removeMember(@RequestParam Long id) {
        return new ResponseEntity<>(memberService.removeMember(id), HttpStatus.OK);
    }
}
