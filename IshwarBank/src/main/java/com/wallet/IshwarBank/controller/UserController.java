package com.wallet.IshwarBank.controller;


import com.wallet.IshwarBank.dto.*;
import com.wallet.IshwarBank.service.impl.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Tag(name = "User Account Management APIs")
public class UserController {

    @Autowired
    UserService userService;

    @Operation(
            summary = "Create New User Account",
            description = "Creating a new user account and assigning an account ID"
    )
    @ApiResponse(
            responseCode = "201",
            description = "http Status 201 CREATED"
    )
    @PostMapping("/user")
    public BankResponse createAccount(@RequestBody UserRequest userRequest){
        return userService.createAccount(userRequest);
    }


    @Operation(
            summary = "Balance Enquiry",
            description = "Checking Balance for the given account number"
    )
    @ApiResponse(
            responseCode = "200",
            description = "http Status 200 SUCCESS"
    )
    @GetMapping("balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest request){
        return userService.balanceEnquiry(request);
    }


    @Operation(
            summary = "Checking user Name",
            description = "Checking the Name for given Account"
    )
    @ApiResponse(
            responseCode = "203",
            description = "http Status 203 SUCCESS"
    )
    @GetMapping("nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest request){
        return userService.nameEnquiry(request);
    }

    @PostMapping("credit")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest request){
        return userService.creditAccount(request);
    }

    @PostMapping("debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest request){
        return userService.debitAccount(request);
    }

    @PostMapping("transfer")
    public BankResponse transfer(@RequestBody TransferRequest request){
        return userService.transfer(request);
    }

}
