package com.moonstone.loans.controller;

import com.moonstone.loans.dto.ResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@AllArgsConstructor
@RestController
@RequestMapping(path="/api",produces = {MediaType.APPLICATION_JSON_VALUE})
@Validated
public class LoansController {

//    @GetMapping("hello")
//    public String sayHello() {
//        return "Hei World!";
//    }


    public ResponseEntity<ResponseDto> createLoan(@RequestParam String mobileNo ){

        return ;
    }



}
