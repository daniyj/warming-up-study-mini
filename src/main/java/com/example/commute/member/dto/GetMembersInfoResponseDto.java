package com.example.commute.member.dto;

import com.example.commute.member.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetMembersInfoResponseDto {
    private String name;
    private String teamName;
    private Role role;
    private LocalDate birthday;
    private LocalDate workStartDate;
//    private String name;
//    private String manager = null;
//    private Long memberCount;

}
