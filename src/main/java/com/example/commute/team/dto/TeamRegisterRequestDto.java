package com.example.commute.team.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@Getter
public class TeamRegisterRequestDto {
    private String name;
    public TeamRegisterRequestDto(){}
    public TeamRegisterRequestDto(String name) {
        this.name = name;
    }
}
