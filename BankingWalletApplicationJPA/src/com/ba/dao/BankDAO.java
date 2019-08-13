package com.ba.dao;

import javax.persistence.EntityManager;

import com.ba.pojo.Bank;

public class BankDAO {

	private EntityManager entityManager;
	
	public BankDAO() {
		entityManager=JPAUtil.getEntityManager();
	}

	public void addUserAccount(Bank bank) {
		entityManager.persist(bank);
	}
	

	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}


	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}
	
}
