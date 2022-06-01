package com.ty.zoo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.zoo.dto.Visitor;
import com.ty.zoo.util.ConnectionObject;

public class VisitorDao {
	public int saveVisitor(Visitor visitor) {
		Connection connection=ConnectionObject.getConnection();
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement("insert into visitor values(?,?,?,?,?,?)");
			preparedStatement.setInt(1, visitor.getId());
			preparedStatement.setString(2,visitor.getName());
			preparedStatement.setString(3,visitor.getEmail());
			preparedStatement.setString(4,visitor.getPhone());
			preparedStatement.setString(5,visitor.getGender());
			preparedStatement.setInt(6,visitor.getAge());
			
			return preparedStatement.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
		
	}
}
