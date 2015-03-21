package com.pratz.logic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratz.dao.table.mapper.AccountMapper;
import com.pratz.dao.table.model.AccountCriteria;

@Service
public class IService implements Imethod {

	@Autowired
	private AccountMapper accountMapper;
	
	@Override
	public int method1() {
		AccountCriteria criteria =new AccountCriteria();
		criteria.createCriteria();
		return accountMapper.countByExample(criteria);
		
	}

}
