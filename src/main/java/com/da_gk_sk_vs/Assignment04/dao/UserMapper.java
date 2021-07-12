package com.da_gk_sk_vs.Assignment04.dao;

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
	    user.setPhoneNo(rs.getString("phone"));

	    return user;
	  }
}
