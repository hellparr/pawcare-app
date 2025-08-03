package co.pawcare.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String site;

    @OneToMany
    private List<Pet> pets;

}
