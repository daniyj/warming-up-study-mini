package com.example.commute.team.service;

import com.example.commute.team.domain.Team;
import com.example.commute.team.dto.TeamRegisterRequestDto;
import com.example.commute.team.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class TeamService {
    private final TeamRepository teamRepository;
    public void registerTeam(TeamRegisterRequestDto request){
        teamRepository.save(new Team(request.getName()));
    }
}
