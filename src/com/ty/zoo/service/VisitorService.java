package com.ty.zoo.service;

import com.ty.zoo.dao.VisitorDao;
import com.ty.zoo.dto.Visitor;
import com.ty.zoo.util.AES;
import static com.ty.zoo.util.AppConstants.SECRET_KEY;

public class VisitorService {
	VisitorDao dao=new VisitorDao();
	
	public int saveVisitorService(Visitor visitor)
	{
		String encName=AES.encrypt(visitor.getName(), SECRET_KEY);
		String encEmail=AES.encrypt(visitor.getEmail(), SECRET_KEY);
		String encPhone=AES.encrypt(visitor.getPhone(), SECRET_KEY);
		visitor.setName(encName);
		visitor.setEmail(encEmail);
		visitor.setPhone(encPhone);
		
		return dao.saveVisitor(visitor);
		
	}

}
