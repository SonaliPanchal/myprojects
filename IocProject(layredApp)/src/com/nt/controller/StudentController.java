package com.nt.controller;

import com.nt.dto.StudentDTO;
import com.nt.services.StudentService;
import com.nt.vo.StudentVO;

public class StudentController {//taking value from client and process to VO and alo set the values there

	private StudentService service;


	StudentDTO dto = new StudentDTO();

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	public String process(StudentVO vo)
	{

		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setSname(vo.getSname());
		dto.setM1(Float.parseFloat(vo.getM1()));
		dto.setM2(Float.parseFloat(vo.getM2()));
		dto.setM3(Float.parseFloat(vo.getM3()));

		String Result=service.generateResult(dto);

		return Result; 

	}
}
