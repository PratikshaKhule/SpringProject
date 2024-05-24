package com.SpHibernate.SpHibernateTask.Dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.SpHibernate.SpHibernateTask.Entity.Staff;



@Repository
public class UserDao {
    
	@Autowired
	SessionFactory factory;
	
	
	public List<Staff> getAllstaff() {
		
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Criteria c = session.createCriteria(Staff.class);
		List<Staff> list = c.list();
		
		tr.commit();
		return list ;
	}

	public Staff getstaffmember() {
		
		Session session = factory.openSession();
		return session.get(Staff.class,3);
		
	}

	public boolean insertStaff(Staff member) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(member);
		tr.commit();
		return true;
	}

	public List<Staff> salarymore(int salary) {
		
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.gt("salary", salary));
		List<Staff> list = criteria.list();
		return list;
	}

	
	
}
