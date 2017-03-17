package com.account.dao;

import com.account.bean.Account;

public interface AccountDAO {
	
	Account getAccount(Integer accountId);
	void createAccount(Account account);
	void deleteAccount(Integer accountId);
	void updateAccount(Account account);
	void addAccount(Account account);

}
