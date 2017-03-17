package com.account.service;

import com.account.bean.Account;
import com.account.dto.response.AccountDTO;
 
public interface AccountService {
 
	Account getAccount(Integer accountId);
	Integer createAccount(AccountDTO account);
	void deleteAccount(Integer accountId);
	void updateAccount(AccountDTO account);
	boolean addAccount(Account account);
	
}