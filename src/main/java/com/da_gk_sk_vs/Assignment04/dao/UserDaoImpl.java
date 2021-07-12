package com.da_gk_sk_vs.Assignment04.dao;

import java.awt.List;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.da_gk_sk_vs.Assignment04.bean.Login;
import com.da_gk_sk_vs.Assignment04.bean.Userclass;

public class UserDaoImpl implements UserDao {

	@Autowired
	DataSource datasource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	public int register(Userclass user) {
		String sql = "insert into users values(?,?,?,?,?,?,?)";

		return jdbcTemplate.update(sql, new Object[] { user.getUserName(), 
													   user.getPassword(), 
													   user.getFirstName(),
												       user.getLastName(), 
													   user.getEmail(), 
													   user.getAddress(), 
													   user.getPhoneNo() });
	}

	public Userclass validateUser(Login login) {
		String sql = "select * from users where username='" + login.getuName() + "' and password='" + login.getuPass()
				+ "'";
		ArrayList<Userclass> users = (ArrayList<Userclass>) jdbcTemplate.query(sql, new UserMapper());

		return users.size() > 0 ? users.get(0) : null;
	}

}
