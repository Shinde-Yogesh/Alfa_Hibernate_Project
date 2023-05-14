package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.config.Hibernate_Config;
import com.entity.Alfa_Batch;

public class Alfa_Batch_Dao {
	private org.hibernate.SessionFactory sf = Hibernate_Config.getConfig();

	public Alfa_Batch getalfa() {

		Session session = sf.openSession();
		Alfa_Batch alfa = session.load(Alfa_Batch.class, 1);

		return alfa;
	}

// New method to update 
	public boolean updateAlfa_Batch_Record(Alfa_Batch a) {
		Session session = sf.openSession();

		org.hibernate.Transaction tr = session.beginTransaction();
		session.update(a);

		tr.commit();

		return true;

	}

	public boolean insert_Record(Alfa_Batch new_obj) {

		Session new_session = sf.openSession();

		org.hibernate.Transaction tr = new_session.beginTransaction();
		new_session.save(new_obj);

		tr.commit();

		return true;
	}

	// Filter Method for get perticular data

	public List<Alfa_Batch> getFilter_Alfa_Batch() {
		Session filter_session = sf.openSession();

		@SuppressWarnings("deprecation")
		Criteria criteria = filter_session.createCriteria(Alfa_Batch.class);

//								(gt for the greater than and first field for salary and 
//										second for the value)
		// if the field datatype is mot same then it return all data

		criteria.add(Restrictions.eq("id", 1));

		@SuppressWarnings("unchecked")
		List<Alfa_Batch> filter_alfa_batch = criteria.list();

		for (Alfa_Batch alfa_Batch : filter_alfa_batch) {
			
			System.out.println(alfa_Batch);
		}
		
		return filter_alfa_batch;
	}
	
	

	public static void main(String[] args) {
		Alfa_Batch_Dao dd = new Alfa_Batch_Dao();
		dd.getFilter_Alfa_Batch();
	}

}
