package com.example.commute.member.domain;

import com.example.commute.team.domain.Team;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@NoArgsConstructor
@Getter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;
    private String name;
    private Role role;
    private LocalDate workStartDate;
    private LocalDate birthday;
    @ManyToOne
    private Team team;


}
