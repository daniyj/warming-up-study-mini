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

    @Enumerated(EnumType.STRING)
    private Role role;

    private LocalDate workStartDate;
    private LocalDate birthday;
    @ManyToOne
    private Team team;

    public Member(String name, Role role, LocalDate workStartDate, LocalDate birthday, Team team) {
        this.name = name;
        this.role = role;
        this.workStartDate = workStartDate;
        this.birthday = birthday;
        this.team = team;
    }
}
