package com.company.classes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Teams {
    private ArrayList<Team> teams;

    public Teams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public Teams() {
        teams = new ArrayList<>();
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void add(Team team) {
        this.teams.add(team);
    }

    public ArrayList getList() {
        return teams;
    }

    @Override
    public String toString() {
        String result = "";
        for (Team c : teams) {
            result += c + System.lineSeparator();
        }
        return result;
    }
}