package com.fastcampus.snsproject.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    DUPLICATED_USER_NAME(HttpStatus.CONFLICT, "User name is duplicated"),
    WRONG_PASSWORD(HttpStatus.CONFLICT, "password is wrong"),
    ;

    private HttpStatus status;
    private String message;
}
