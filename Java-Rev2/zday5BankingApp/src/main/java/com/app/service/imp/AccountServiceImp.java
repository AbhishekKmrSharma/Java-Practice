package com.app.service.imp;

import org.springframework.stereotype.Service;

import com.app.dto.AccountDto;
import com.app.entity.Accounts;
import com.app.mapper.Accountmapper;
import com.app.repository.AccountRepository;
import com.app.service.AccountService;

@Service
public class AccountServiceImp implements AccountService
{
	private AccountRepository accountRepo;
	
	public AccountServiceImp(AccountRepository accountRepo) 
	{
		this.accountRepo = accountRepo;
	}

	@Override
	public AccountDto createAccount(AccountDto accountDto) 
	{
		Accounts acc = Accountmapper.mapToAccount(accountDto);
		Accounts acccDto = accountRepo.save(acc);
		return Accountmapper.mapToAccountDto(acccDto);
	}

}
