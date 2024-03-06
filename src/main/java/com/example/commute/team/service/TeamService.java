package com.example.commute.team.service;

import com.example.commute.team.domain.Team;
import com.example.commute.team.dto.GetTeamsInfoResponseDto;
import com.example.commute.team.dto.TeamRegisterRequestDto;
import com.example.commute.team.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public void registerTeam(TeamRegisterRequestDto request){
        teamRepository.save(new Team(request.getName()));
    }

    public List<GetTeamsInfoResponseDto> getTeamsInfo() {
        List<Team> teams = teamRepository.findAll();

        List<GetTeamsInfoResponseDto> response = new ArrayList<>();
        for (Team team : teams) {
            response.add(new GetTeamsInfoResponseDto(team.getName(), team.getManager(), teamRepository.count()));
        }

        return response;
    }
}
