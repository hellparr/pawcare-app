package co.pawcare.api.dto;

import java.time.LocalDate;


public class PetDto {
    private Long id;
    private String name;
    private LocalDate date;
    private String type;
    private String race;
    private String primaryColour;
    private String secondColour;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getPrimaryColour() {
        return primaryColour;
    }

    public void setPrimaryColour(String primaryColour) {
        this.primaryColour = primaryColour;
    }

    public String getSecondColour() {
        return secondColour;
    }

    public void setSecondColour(String secondColour) {
        this.secondColour = secondColour;
    }
}
