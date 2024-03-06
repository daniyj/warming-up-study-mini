package com.example.commute.member.service;

import com.example.commute.member.domain.Member;
import com.example.commute.member.domain.Role;
import com.example.commute.member.dto.GetMembersInfoResponseDto;
import com.example.commute.member.dto.MemberRegisterRequestDto;
import com.example.commute.member.repository.MemberRepository;
import com.example.commute.team.domain.Team;
import com.example.commute.team.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;
    private final TeamRepository teamRepository;
    @Transactional
    public void registerMember(MemberRegisterRequestDto request) {
        Team team = teamRepository.findById(request.getTeamId()).orElseThrow(()-> new IllegalArgumentException("잘못된 ID입니다."));
        if (request.getRole() == Role.MANAGER) {
            team.setManager(request.getName());
        }
        memberRepository.save(new Member(request.getName(), request.getRole(), request.getWorkStartDate(), request.getBirthday(),team));
    }

    public List<GetMembersInfoResponseDto> getMembersInfo() {
        List<GetMembersInfoResponseDto> response = new ArrayList<>();

        List<Member> members = memberRepository.findAll();
        for (Member member : members) {
            response.add(new GetMembersInfoResponseDto(member.getName(),
                    member.getTeam().getName(), member.getRole(), member.getBirthday(), member.getWorkStartDate()));
        }

        return response;
    }
}
