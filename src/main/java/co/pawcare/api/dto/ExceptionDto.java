package co.pawcare.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ExceptionDto {
    private String message;
    private LocalDateTime timestamp;
}

