package com.SpHibernate.SpHibernateTask;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpHibernate.SpHibernateTask.Controller.UserController;
import com.SpHibernate.SpHibernateTask.Entity.Staff;

import antlr.collections.List;

@SpringBootApplication
public class SpHibernateTaskApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpHibernateTaskApplication.class, args);
	    UserController u =  ctx.getBean(UserController.class);
	    u.salarymore(20000);
	}

}
