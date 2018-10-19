
package com.dda.transactions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dda.transactions.ampq.SimpleRpcProducerRabbitApplication;
import com.dda.transactions.exception.AccountNotFoundException;
import com.dda.transactions.exception.BadRequestException;
import com.dda.transactions.exception.CustomizedResponseEntityExceptionHandler;
import com.dda.transactions.model.Transaction;
import com.dda.transactions.service.TransactionService;


/**
 * No description
 * (Generated with springmvc-raml-parser v.2.0.0)
 * 
 */
@RestController
@RequestMapping(value = "/api/account/{accountId}/transaction/{status}", produces = "application/json")
@Validated
public class StatusController {


	@Autowired
	private TransactionService transactionService;
	
	@Autowired
	private SimpleRpcProducerRabbitApplication rmpq;

	/**
	 * No description
	 * 
	 */


	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<?> getTransactionsByAccountId(
			@PathVariable
			String accountId,@PathVariable
			String status) {

		//int checkId= transactionService.isAccountIdExists(accountId);
		List<Transaction> transactionDetails=transactionService.fetchList1(accountId, status);

		int checkId=transactionDetails.size();
		
		
		String special = "[!@#$%&*()_+=|<>?{}\\[\\]~-]";
		try
		{
			if ((!(accountId.matches("[0-9]{10}"))) || accountId.matches(special)) 
				throw new BadRequestException("Invalid Account ID");



			else if(checkId==0)
				throw new AccountNotFoundException("Account not found");

			else

				//List<Transaction> transactionDetails=transactionService.fetchList1(accountId, status);
				//rmpq.sendMessage(transactionService.fetchList1(accountId, status));
				rmpq.sendMessage(transactionDetails);
				return ResponseEntity.ok(transactionService.fetchList1(accountId, status));

		}
		catch (BadRequestException bd) 
		{

			return new CustomizedResponseEntityExceptionHandler().handleBadRequest(bd);

		}
		catch(AccountNotFoundException ae)
		{
			return new CustomizedResponseEntityExceptionHandler().handleLoanAccountNotFoundException(ae);
		}
		
		catch (Exception ec) 
		{

			return new CustomizedResponseEntityExceptionHandler().handleAllExceptions(ec);

		} 


	}
}















