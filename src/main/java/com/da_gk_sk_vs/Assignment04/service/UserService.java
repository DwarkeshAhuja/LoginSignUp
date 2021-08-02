package com.da_gk_sk_vs.Assignment04.service;

/*
 *  Author: Dwarkesh Ahuja Gurleen Kaur Sukhmeet Kaur Virender Singh
 *  Date: July 16th 2021 
 *  Desc : this is the interface of the user service class implementation 
 */

import com.da_gk_sk_vs.Assignment04.bean.Login;
import com.da_gk_sk_vs.Assignment04.bean.Userclass;

public interface UserService {

	public int register(Userclass user);

	public Userclass validateUser(Login login);
}
