package com.example.commute.member.controller;

import com.example.commute.member.dto.GetMembersInfoResponseDto;
import com.example.commute.member.dto.MemberRegisterRequestDto;
import com.example.commute.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/members")
@RestController
public class MemberController {
    private final MemberService memberService;

    // 직원 등록 API
    @PostMapping("/register")
    public void registerTeam(@RequestBody MemberRegisterRequestDto request){
        memberService.registerMember(request);
    }

//     직원 조회 API
    @GetMapping
    public List<GetMembersInfoResponseDto> getMembersInfo() {
        return memberService.getMembersInfo();
    }
}
