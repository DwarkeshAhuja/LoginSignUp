package com.da_gk_sk_vs.Assignment04.service;


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
