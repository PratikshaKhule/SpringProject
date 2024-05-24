package com.SpHibernate.SpHibernateTask.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpHibernate.SpHibernateTask.Dao.UserDao;
import com.SpHibernate.SpHibernateTask.Entity.Staff;

@Service
public class UserService {
    @Autowired
	UserDao dao;
	
	public List<Staff> getAllstaff() 
	{
		return dao.getAllstaff();
		
	}

	public Staff getstaffmember() {
		
		return dao.getstaffmember();
	}

	public String insertStaff(Staff member) {
		
		if (dao.insertStaff(member)) 
		{
			return "User Inserted...";
			
		}else {
			
			return "User Not Inserted...";
		}
	}

	public List<Staff> salarymore(int salary) {
		
		return dao.salarymore(salary);
	}

}
