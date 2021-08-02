package com.da_gk_sk_vs.Assignment04.service;

/*
 *  Author: Dwarkesh Ahuja Gurleen Kaur Sukhmeet Kaur Virender Singh
 *  Date: July 16th 2021 
 *  Desc : this is the user service class to call the service methods
 */

import org.springframework.beans.factory.annotation.Autowired;

import com.da_gk_sk_vs.Assignment04.bean.Login;
import com.da_gk_sk_vs.Assignment04.bean.Userclass;
import com.da_gk_sk_vs.Assignment04.dao.UserDao;

public class UserServiceImpl implements UserService {

	@Autowired
	  public UserDao userDao;

	  public int register(Userclass user) {
	    return userDao.register(user);
	  }

	  public Userclass validateUser(Login login) {
	    return userDao.validateUser(login);
	  }
}
