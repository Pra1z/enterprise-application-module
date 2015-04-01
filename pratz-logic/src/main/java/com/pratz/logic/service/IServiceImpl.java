package com.pratz.logic.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IServiceImpl implements IService {

	//@Autowired
	//private ProductMapper productMapper;
	@Transactional
	public int method1() {
		//ProductCriteria criteria =new ProductCriteria();
		//criteria.createCriteria();
		//return //productMapper.countByExample(criteria);
		return 0 ;
		
	}

}
