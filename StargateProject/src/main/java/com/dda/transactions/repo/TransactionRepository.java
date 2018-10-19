package com.dda.transactions.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dda.transactions.model.Transaction;

@SuppressWarnings("hiding")
@Repository
public interface TransactionRepository extends CrudRepository<Transaction, String>
{
	
		@Query(value = "SELECT * " + " from transaction t, accountdescriptor a"
				+ " where t.AccountId=a.AccountId and "
				+ "t.AccountId=:accountId and t.Status=:status", nativeQuery = true)
		List<Transaction> fetchList1(@Param("accountId") String accountId,@Param("status") String status);
		
		
		//Transaction findByAccountId(String accountId);
		
		@Query(value = "SELECT EXISTS(SELECT * " + " from transaction t"
				+ " where "
				+ "t.AccountId=:accountId)", nativeQuery = true)
		int isAccountIdExists(@Param("accountId") String accountId);
		
	
}
