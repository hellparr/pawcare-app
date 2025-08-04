package co.pawcare.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private String name;
    @JsonProperty("last_name")
    private String lastName;
    private String email;
    private String phone;
    private String site;
    private String password;
    private String role;
}
