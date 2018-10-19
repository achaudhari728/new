package com.dda.transactions.dao;

import java.util.List;

import com.dda.transactions.model.Transaction;

public interface TransactionDao 
{
	public List<Transaction> fetchList1(String accountId,String status);
	
	public int isAccountIdExists(String accountId);
}
