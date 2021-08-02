package com.da_gk_sk_vs.Assignment04.dao;

/*
 *  Author: Dwarkesh Ahuja Gurleen Kaur Sukhmeet Kaur Virender Singh
 *  Date: July 16th 2021 
 *  Desc : this is the user dao interface to give the 4 layer architecture of the application
 */

import com.da_gk_sk_vs.Assignment04.bean.Login;
import com.da_gk_sk_vs.Assignment04.bean.Userclass;

public interface UserDao {

	  public int register(Userclass user);

	  public Userclass validateUser(Login login);
	}
