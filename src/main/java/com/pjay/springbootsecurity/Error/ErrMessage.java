package com.pjay.springbootsecurity.Error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ErrMessage {
    private HttpStatus httpStatus;
    private String message;

    public ErrMessage(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message =message;
    }
}