package com.da_gk_sk_vs.Assignment04.service;


import com.da_gk_sk_vs.Assignment04.bean.Login;
import com.da_gk_sk_vs.Assignment04.bean.Userclass;

public interface UserService {

	int register(Userclass user);

	Userclass validateUser(Login login);
}
