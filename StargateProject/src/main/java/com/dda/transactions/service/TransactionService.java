package com.dda.transactions.service;

import java.util.List;

import com.dda.transactions.model.Transaction;

public interface TransactionService
{
	public List<Transaction> fetchList1(String accountId,String status);
	
	public int isAccountIdExists(String accountId);
	
}
