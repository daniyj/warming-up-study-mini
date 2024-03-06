package com.example.commute.member.dto;

import com.example.commute.member.domain.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class MemberRegisterRequestDto {
    private String name;
    private Role role;
    private LocalDate workStartDate;
    private LocalDate birthday;
    private Long teamId;

    public MemberRegisterRequestDto(String name, Role role, LocalDate workStartDate, LocalDate birthday,Long teamId) {
        this.name = name;
        this.role = role;
        this.workStartDate = workStartDate;
        this.birthday = birthday;
        this.teamId = teamId;
    }
}
