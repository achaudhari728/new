package com.dda.transactions.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dda.transactions.dao.TransactionDao;
import com.dda.transactions.model.Transaction;
import com.dda.transactions.repo.TransactionRepository;

@Component
public class TransactionDaoImpl implements TransactionDao 
{
	@Autowired
	TransactionRepository transactionRepository;
	
	@Override
	public List<Transaction> fetchList1(String accountId, String status) 
	{
		return transactionRepository.fetchList1(accountId, status);
	}

	@Override
	public int isAccountIdExists(String accountId) 
	{
		
		return transactionRepository.isAccountIdExists(accountId);
	}

}
