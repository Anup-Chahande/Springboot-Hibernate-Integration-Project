package com.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Entity.Crickstaff;

@Repository
public class wcworldcupdao {
	
	@Autowired
	SessionFactory sf;

	public List<Crickstaff> allcrickstaff() {
		
		System.err.println("fac >>>"+ sf);
		Session session = sf.openSession();
		Criteria Criteria = session.createCriteria(Crickstaff.class);

		List<Crickstaff> allstaff = Criteria.list();
         System.out.println(allstaff);
		return allstaff;

	}

}
