package com.dda.transactions.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dda.transactions.dao.TransactionDao;
import com.dda.transactions.model.Transaction;
import com.dda.transactions.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService 
{

	@Autowired
	private TransactionDao transactionDao;

	@Override
	public List<Transaction> fetchList1(String accountId, String status) 
	{
		
		return transactionDao.fetchList1(accountId, status);
	}

	@Override
	public int isAccountIdExists(String accountId) 
	{
		
		return transactionDao.isAccountIdExists(accountId);
	}
	
	

}
