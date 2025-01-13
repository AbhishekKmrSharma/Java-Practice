package com.app.mapper;

import com.app.dto.AccountDto;
import com.app.entity.Accounts;
import lombok.Data;

public class Accountmapper
{
	public static Accounts mapToAccount(AccountDto accountDto)
	{
		Accounts acc = new Accounts(accountDto.getId(), accountDto.getAccountHolderName(), accountDto.getBalance());
		
		return acc;
	}
	
	public static AccountDto mapToAccountDto(Accounts account)
	{
		AccountDto accountDto = new AccountDto(account.getId(), account.getAccountHolderName(), account.getBalance());
		
		return accountDto;
	}
}
