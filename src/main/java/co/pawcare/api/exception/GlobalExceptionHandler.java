package co.pawcare.api.exception;


import co.pawcare.api.dto.ExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ExceptionDto> badRequestException(BadRequestException badRequestException) {
        ExceptionDto exceptionDto = new ExceptionDto();
        exceptionDto.setMessage(badRequestException.getMessage());
        exceptionDto.setTimestamp(LocalDateTime.now());

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(exceptionDto);
    }

}