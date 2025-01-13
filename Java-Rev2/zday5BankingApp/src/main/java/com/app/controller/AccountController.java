package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.AccountDto;
import com.app.service.AccountService;

@RestController
@RequestMapping("/insert")
public class AccountController 
{
	private AccountService accService;
	
	public AccountController(AccountService accService)
	{
		this.accService = accService;
	}
	
	@PostMapping
	public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accDto)
	{
		return new ResponseEntity<>(accService.createAccount(accDto), HttpStatus.CREATED);
	}
}
