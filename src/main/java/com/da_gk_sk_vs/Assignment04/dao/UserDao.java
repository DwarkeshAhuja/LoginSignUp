package com.da_gk_sk_vs.Assignment04.dao;

import com.da_gk_sk_vs.Assignment04.bean.Login;
import com.da_gk_sk_vs.Assignment04.bean.Userclass;

public interface UserDao {

	  int register(Userclass user);

	  Userclass validateUser(Login login);
	}
