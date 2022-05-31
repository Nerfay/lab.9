package com.company.classes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Comparator;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {

    private String name;
    private int retirement;
    private String logo;
    private int debut;
    private int id;
    private String abbrev;


    public Team() {
    }


    public Team(String name, int retirement, String logo, int debut, int id, String abbrev) {
        super();
        this.name = name;
        this.retirement = retirement;
        this.logo = logo;
        this.debut = debut;
        this.id = id;
        this.abbrev = abbrev;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRetirement() {
        return retirement;
    }

    public void setRetirement(int retirement) {
        this.retirement = retirement;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getDebut() {
        return debut;
    }

    public void setDebut(int debut) {
        this.debut = debut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("retirement");
        sb.append('=');
        sb.append(this.retirement);
        sb.append(',');
        sb.append("logo");
        sb.append('=');
        sb.append(((this.logo == null)?"<null>":this.logo));
        sb.append(',');
        sb.append("debut");
        sb.append('=');
        sb.append(this.debut);
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(this.id);
        sb.append(',');
        sb.append("abbrev");
        sb.append('=');
        sb.append(((this.abbrev == null)?"<null>":this.abbrev));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }
    public static Comparator<Team> byName_ = Comparator.comparing(o -> o.name);
    public static Comparator<Team> byName = (o1, o2) -> o2.name.compareTo(o1.name);
    public static Comparator<Team> byDebut = (o1, o2) -> o1.debut > o2.debut ? 1 : o1.debut < o2.debut ? -1 : 0;
    public static Comparator<Team> byDebut_ = (o1, o2) -> o1.debut < o2.debut ? 1 : o1.debut > o2.debut ? -1 : 0;

}


