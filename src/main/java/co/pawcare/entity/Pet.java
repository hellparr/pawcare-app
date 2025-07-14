package co.pawcare.entity;

import jakarta.persistence.*;


import java.time.LocalDate;

@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate date;
    private String type;
    private String race;
    private String primaryColour;
    private String secondColour;

    @ManyToOne
    private User owner;

}
