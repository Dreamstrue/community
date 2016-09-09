package com.garden.common;


import com.garden.common.action.CommonController;
import com.garden.login.action.LayoutController;
import com.garden.login.action.LoginController;
import com.garden.login.model.User;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.CaseInsensitiveContainerFactory;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;

public class CommonConfig extends JFinalConfig{

	@Override
	public void configConstant(Constants me) {
		me.setDevMode(true);
		me.setViewType(ViewType.JSP);
	}

	@Override
	public void configHandler(Handlers arg0) {
		
	}

	@Override
	public void configInterceptor(Interceptors arg0) {
		
	}

	@Override
	public void configPlugin(Plugins me) {
		loadPropertyFile("config/config.properties");
//        DataSource eomsDS = new 
		System.out.println(getProperty("jdbc_url"));
		C3p0Plugin c3p0Plugin = new C3p0Plugin(getProperty("jdbc_url"), getProperty("jdbc_username"), getProperty("jdbc_password"));
		me.add(c3p0Plugin);
		ActiveRecordPlugin arp = new ActiveRecordPlugin(c3p0Plugin);
		arp.setContainerFactory(new CaseInsensitiveContainerFactory(true));   //配置数据库列大小写不敏感
		me.add(arp);
		arp.addMapping("user", User.class);
	}

	@Override
	public void configRoute(Routes r) {
		r.add("/",CommonController.class);
		r.add("/login",LoginController.class);
		r.add("/layout",LayoutController.class);
	}

}
