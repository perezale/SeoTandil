package com.seotandil.db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class ConnectionPool {
	
	private static final Configuration configuration = new Configuration().configure().setProperty("hibernate.temp.use_jdbc_metadata_defaults","false");; 
	private static final ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();;
	private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(serviceRegistry);	
	
	public ConnectionPool(){
		//configuration = new Configuration().configure().setProperty("hibernate.temp.use_jdbc_metadata_defaults","false");		
		//serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		//sessionFactory =  new Configuration().configure().buildSessionFactory(serviceRegistry);
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
