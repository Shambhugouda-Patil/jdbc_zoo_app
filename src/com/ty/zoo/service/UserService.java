package com.ty.zoo.service;

import com.ty.zoo.dao.UserDao;
import com.ty.zoo.dto.User;
import com.ty.zoo.util.AES;
import static com.ty.zoo.util.AppConstants.SECRET_KEY;

public class UserService {
	UserDao dao=null;
	
	public int saveUserService(User user)
	{
	    UserDao	da0 =new UserDao();
		String encPassword=AES.encrypt(user.getPassword(),SECRET_KEY);
		String encName=AES.encrypt(user.getName(), SECRET_KEY);
		String encEmail=AES.encrypt(user.getEmail(), SECRET_KEY);
		String encPhone=AES.encrypt(user.getPhone(), SECRET_KEY);
		user.setName(encName);
		user.setEmail(encEmail);
		user.setPhone(encPhone);
		
		return dao.saveUser(user);
		
	}
	

}
