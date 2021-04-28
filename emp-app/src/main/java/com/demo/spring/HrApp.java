package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demo.spring.dao.EmpDao;
import com.demo.spring.entity.Emp;

@Service
public class HrApp {

	@Autowired
	@Qualifier("empDaoImpl2")
	private EmpDao dao;
	
	public String registerEmployee(int id, String name, String loc,double salary) {
		String resp=dao.save(new Emp(id, name, loc, salary));
		return resp;
	}
}
