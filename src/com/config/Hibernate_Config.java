package com.config;

import org.hibernate.cfg.Configuration;

import com.entity.Alfa_Batch;

public class Hibernate_Config {

	public static org.hibernate.SessionFactory getConfig() {
		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Alfa_Batch.class);

		org.hibernate.SessionFactory sf = cfg.buildSessionFactory();
		return sf;
	}
}
