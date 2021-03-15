package com.fernando.msstore.shared.model;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiSimpleResponse {
    private String message;
    private Integer statusCode;

    public ApiSimpleResponse(String message) {
        this.message = message;
        this.statusCode = HttpStatus.OK.value();
    }
}
