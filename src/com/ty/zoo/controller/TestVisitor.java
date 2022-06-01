package com.ty.zoo.controller;

import com.ty.zoo.dto.Visitor;
import com.ty.zoo.service.VisitorService;

public class TestVisitor {
	public static void main(String[] args) {
		Visitor visitor=new Visitor();
		visitor.setId(1);
		visitor.setName("raja");
		visitor.setEmail("raja@gmail.com");
		visitor.setGender("M");
		visitor.setAge(24);
		visitor.setPhone("12345678");
		
		VisitorService visitorService=new VisitorService();
		int res=visitorService.saveVisitorService(visitor);
		
		if(res>0)
		{
			System.out.println("added successfully");
		}
		else
		{
			System.out.println("no data exist");
		}
	}

}
