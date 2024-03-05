package com.example.commute.team.controller;

import com.example.commute.team.dto.TeamRegisterRequestDto;
import com.example.commute.team.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/v1/teams")
@RestController
public class TeamController {
    private final TeamService teamService;

    // 팀 등록 API
    @PostMapping("/register")
    public void registerTeam(@RequestBody TeamRegisterRequestDto request){
        teamService.registerTeam(request);
    }
}


