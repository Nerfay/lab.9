package com.company;

import com.company.classes.JSONGetter;
import com.company.classes.Team;
import com.company.classes.Teams;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {

    public static void main(String[] args) throws JsonProcessingException {
        JSONGetter jsonGetter = new JSONGetter();
        JSONGetter.url = "https://api.squiggle.com.au/?q=teams";
        jsonGetter.run();

        System.out.println("Waiting for data...");
        String jsonString = jsonGetter.jsonIn;
        System.out.println(jsonString);
        System.out.println("\n------------------------------------------------------\n");
        Teams teams = new ObjectMapper().readValue(jsonGetter.jsonIn, Teams.class);
        System.out.println(teams);

        System.out.println("\n--------------------------Sorting----------------------------\n");

        teams.getTeams().sort(Team.byName_);
        System.out.println("After sorting by name ascending:\n" + teams);

        teams.getTeams().sort(Team.byName);
        System.out.println("After sorting by name descending:\n" + teams);

        teams.getTeams().sort(Team.byDebut);
        System.out.println("After sorting by Debut ascending:\n" + teams);

        teams.getTeams().sort(Team.byDebut_);
        System.out.println("After sorting by Debut_ descending:\n" + teams);
    }
}
