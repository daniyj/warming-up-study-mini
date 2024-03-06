package com.example.commute.team.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetTeamsInfoResponseDto {
    private String name;
    private String manager;
    private Long memberCount;
}
