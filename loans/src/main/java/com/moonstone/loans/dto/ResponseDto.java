package com.moonstone.loans.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class ResponseDto {

    public String statusCode;

    public String statusMsg;
}
