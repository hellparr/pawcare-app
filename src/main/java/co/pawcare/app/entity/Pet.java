package co.pawcare.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;

@Entity
@Getter
@Setter
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
