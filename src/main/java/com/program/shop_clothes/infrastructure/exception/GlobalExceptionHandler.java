package com.program.shop_clothes.infrastructure.exception;


import com.program.shop_clothes.infrastructure.presenter.CommonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<CommonResponse> handleResourceNotFound(ResourceNotFoundException ex) {

        CommonResponse commonResponse = CommonResponse.builder()
                .message(ex.getMessage())
                .status(HttpStatus.NOT_FOUND.value())
                .data(null)
                .build();

        return new ResponseEntity<>(commonResponse, HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<CommonResponse> handleBadRequest(BadRequestException ex) {

        CommonResponse commonResponse = CommonResponse.builder()
                .message(ex.getMessage())
                .status(HttpStatus.BAD_REQUEST.value())
                .data(null)
                .build();

        return new ResponseEntity<>(commonResponse, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<CommonResponse> handleRuntimeException(RuntimeException ex) {
        CommonResponse commonResponse = CommonResponse.builder()
                .message(ex.getMessage())
                .status(HttpStatus.BAD_REQUEST.value())
                .data(null)
                .build();

        return new ResponseEntity<>(commonResponse, HttpStatus.BAD_REQUEST);
    }

}
