package com.demo.spring.dao;

import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Emp;

@Repository
public class EmpDaoImpl2 implements EmpDao {

	@Override
	public String save(Emp e) {
		return "JPA: Emp Saved with id " + e.getEmpId();
	}

}
