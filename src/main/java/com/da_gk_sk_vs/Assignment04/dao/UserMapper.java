package com.da_gk_sk_vs.Assignment04.dao;
/*
 *  Author: Dwarkesh Ahuja Gurleen Kaur Sukhmeet Kaur Virender Singh
 *  Date: July 16th 2021 
 *  Desc : this is the userMapper class to get the details from the select query and set to the 
 *  user object and return the user object
 */
import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

import com.da_gk_sk_vs.Assignment04.bean.Userclass;

class UserMapper implements RowMapper<Userclass> {

	  public Userclass mapRow(ResultSet rs, int arg1) throws SQLException {
		  Userclass user = new Userclass();
		  user.setUserName(rs.getString("username"));
		  user.setPassword(rs.getString("password"));
		  user.setFirstName(rs.getString("firstname"));
		  user.setLastName(rs.getString("lastname"));
		  user.setEmail(rs.getString("email"));
		  user.setAddress(rs.getString("address"));
		  user.setPhone(rs.getString("phone"));
		  return user;
	  }
}
