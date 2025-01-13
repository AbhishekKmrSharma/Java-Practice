package com.app.service;

import org.springframework.stereotype.Service;

import com.app.dto.AccountDto;

public interface AccountService 
{
	public AccountDto createAccount(AccountDto accountDto);
}
