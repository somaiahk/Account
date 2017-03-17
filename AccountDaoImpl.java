package com.account.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.account.bean.Account;
import com.account.dao.AccountDAO;

@Repository
public class AccountDaoImpl implements AccountDAO {

	@Autowired
	private HibernateTemplate template;
	
	
	public Account getAccount(Integer accountId) {
		
		return template.get(Account.class,accountId);
	}

	@SuppressWarnings({ })
	
	public void createAccount( Account account) {
		/*Account acc = template.execute(new HibernateCallback() {

			@Override
			public Account doInHibernate(Session session) throws HibernateException {
				Account a = new Account();
				a.setId(account.getId());
				a.setName(account.getName());
				a.setBalance(account.getBalance());
				return a;
			}
		});*/
		
		//return account;
	}

	
	public void deleteAccount(Integer accountId) {
		
		template.delete(getAccount(accountId));
	}

	
	public void updateAccount(Account account) {

		/*Account a = getAccount(account.getId());
		a.setName(account.getName());
		a.setBalance(account.getBalance());
		a.setCreatedTime(account.getCreatedTime());
		a.setUpdatedTime(account.getUpdatedTime());
		template.update(a);*/
	}

	
	public void addAccount(Account account) {
		template.save(account);
	}

}
