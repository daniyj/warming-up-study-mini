package com.example.commute.team.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class TeamRegisterRequestDto {
    private String name;
    public TeamRegisterRequestDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
