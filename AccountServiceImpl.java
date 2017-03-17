package com.account.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.bean.Account;
import com.account.dao.impl.AccountDaoImpl;
import com.account.dto.response.AccountDTO;
import com.account.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountDaoImpl accountDaoImpl;

	@Override
	public Account getAccount(Integer accountId) {
		
		return accountDaoImpl.getAccount(accountId);
	}

	@Override
	public boolean addAccount(Account account) {
		return false;
	}

	@Override
	public Integer createAccount(AccountDTO account) {
		return null;
	}

	@Override
	public void deleteAccount(Integer accountId) {
		accountDaoImpl.deleteAccount(accountId);
	}

	@Override
	public void updateAccount(AccountDTO account) {

	}

}