package com.springapi.controller.advice;

import com.springapi.entity.ErrorModel;
import com.springapi.exception.RequestedResourceNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalControllerRRNFAdvice {
    @ExceptionHandler(RequestedResourceNotFound.class)
    ResponseEntity<ErrorModel> handleRRNF() {
        return new ResponseEntity(
                ErrorModel
                        .builder()
                        .ErrorMessage("Requested Resource Not Found")
                        .ErrorCode("RESOURCE_NOT_FOUND")
                        .build(), HttpStatus.BAD_REQUEST
        );
    }
}
