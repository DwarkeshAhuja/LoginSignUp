package com.da_gk_sk_vs.Assignment04.dao;
/*
 *  Author: Dwarkesh Ahuja Gurleen Kaur Sukhmeet Kaur Virender Singh
 *  Date: July 16th 2021 
 *  Desc : this is the user dao class implementation to register the user 
 *  and to validate the login of the user in the database
 */
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.da_gk_sk_vs.Assignment04.bean.Login;
import com.da_gk_sk_vs.Assignment04.bean.Userclass;

public class UserDaoImpl implements UserDao {

	@Autowired
	DataSource datasource;

	@Autowired
	JdbcTemplate jdbcTemplate;
	// JDBS connections are set
	
	public int register(Userclass user) {
		// SQL query is being set to create a new user
		String sql = "insert into loginUser.users values(?,?,?,?,?,?,?)";
		// New record for the user is being entered in the database
		return jdbcTemplate.update(sql, new Object[] { user.getUserName(), 
													   user.getPassword(), 
													   user.getFirstName(),
												       user.getLastName(), 
													   user.getEmail(), 
													   user.getAddress(), 
													   user.getPhone() });
	}

	public Userclass validateUser(Login login) {
		// SQL Query is being set to fetch all the data from the backend
		String sql = "select * from loginUser.users where username='" + login.getuName() + 
				"' and password='" + login.getuPass() + "'";
		// Array list is being created to get the user details
		ArrayList<Userclass> users = (ArrayList<Userclass>) jdbcTemplate.query(sql, new UserMapper());
		// user mapper class is created to set the data of the user in the user object
		return users.size() > 0 ? users.get(0) : null;
	}
}