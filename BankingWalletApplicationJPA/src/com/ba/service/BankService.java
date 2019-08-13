package com.ba.service;

import com.ba.dao.BankDAO;
import com.ba.pojo.Bank;

public class BankService {
	
	BankDAO bankDAO = new BankDAO();

	public void addAccount(Bank bank) {
		bankDAO.beginTransaction();
		bankDAO.addUserAccount(bank);
		bankDAO.commitTransaction();
	}

}
