package com.nt.services;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService{

	private StudentDAO dao;

	public StudentServiceImpl(StudentDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public String generateResult(StudentDTO dto) {
		
		float total = dto.getM1()+dto.getM2()+dto.getM3();
		float average = total/3.0f;//bydefault it is taking in double that sy f ke sath
		String result = null;
		
		if(average>35)
		{
			result = "Pass";
		}
		else
		{
			result = "Fail";
		}
		
		 StudentBO bo = new StudentBO();//get dto nad pass to bo
		 
		 bo.setSno(dto.getSno());
		 bo.setSname(dto.getSname() );
		 bo.setAverage(average);
		 bo.setTotal(total);
		 bo.setResult(result);
		 
		 int count = dao.insert(bo);//data acees object database ke sath interect krwa rhe 
		 
		 if(count==0)
		 {
			 return "sno /n"+dto.getSno()+ "sname /n"+dto.getSname()+ "Registation Failed";
		 }
		 else
		 {
			 return "sno /t"+dto.getSno()+"sname /t"+dto.getSname()+ "Registation Succesfully   " +result; 
		 }
		
	}




}
