package com.SpHibernate.SpHibernateTask.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpHibernate.SpHibernateTask.Entity.Staff;
import com.SpHibernate.SpHibernateTask.Service.UserService;
@RestController
@Component
@RequestMapping("dakhav")
public class UserController 
{
	     @Autowired
	     UserService service;
	     
          public void show() {
        	  System.out.println("The Kiran Academy Connected Successfully:-)");
          }
          
          @GetMapping("allstaff")
          public List<Staff> getAllstaff() 
          {
        	  return service.getAllstaff();
          }
          
          @GetMapping("staffthree")
          public Staff getstaffmember() 
          {
        	   return service.getstaffmember();
          }
          
          @GetMapping("insert")
          public String insertStaff(@RequestBody Staff member) 
          {
        	  
        	  return service.insertStaff(member);
          }
          
          @GetMapping("salary")
          public List<Staff> salarymore(int salary) 
          {
        	 return service.salarymore(salary);
          }
         
}

