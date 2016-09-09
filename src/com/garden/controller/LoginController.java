package com.garden.controller;

import java.util.List;

import com.garden.login.model.User;
import com.jfinal.core.Controller;

public class LoginController extends Controller {

	public void index() {
		String sql = "select * from user";
		List<User> list = User.dao.find(sql);
		System.out.println(list.get(0).getStr(User.USERNAME));
		render("/index.jsp");
	}
}
