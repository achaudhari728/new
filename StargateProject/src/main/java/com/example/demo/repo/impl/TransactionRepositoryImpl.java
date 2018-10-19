package com.example.demo.repo.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.dda.transactions.model.Transaction;
import com.dda.transactions.repo.TransactionRepository;

@SuppressWarnings("rawtypes")
@Repository
@Transactional
public class TransactionRepositoryImpl //implements TransactionRepository
{
	/*@PersistenceContext
    EntityManager entityManager;


	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Transaction> fetchList(String accountId, String status) {
		//System.out.println(accountId+"  "+status);
		Query query = entityManager.createNativeQuery("select * from transaction t,accountdescriptor a where t.AccountId=a.AccountId  and t.AccountId=? and t.Status=?;", Transaction.class);
		query.setParameter(1, accountId);
		query.setParameter(2, status);
		System.out.println(" Result ::: " + query.getResultList());	
		
		
		return query.getResultList();
	}




	@Override
	public List<Transaction> findAll() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public List<Transaction> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public List<Transaction> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public <S extends Transaction> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public <S extends Transaction> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public void deleteInBatch(Iterable<Transaction> entities) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public Transaction getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public <S extends Transaction> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public <S extends Transaction> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public Page<Transaction> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public void delete(Transaction arg0) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void deleteAll(Iterable<? extends Transaction> arg0) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void deleteById(String arg0) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public boolean existsById(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public Optional<Transaction> findById(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public <S extends Transaction> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public <S extends Transaction> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public <S extends Transaction> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public <S extends Transaction> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public <S extends Transaction> Optional<S> findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}




	*/

	
}
