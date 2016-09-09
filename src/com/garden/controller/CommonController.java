package com.garden.controller;

import com.jfinal.core.Controller;

public class CommonController extends Controller{

	public void index(){
		render("/login.jsp");
	}
}
