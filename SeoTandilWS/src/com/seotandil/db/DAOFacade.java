package com.seotandil.db;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.seotandil.dto.Edge;
import com.seotandil.dto.Node;
import com.seotandil.dto.Segmento;

public class DAOFacade {
	
	private SessionFactory sessionFactory;
	
	public DAOFacade(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	private static String SEGMENTOxEDGExLADO = "FROM Segmento WHERE edge = %d AND lado = %b";
	
	@SuppressWarnings("unchecked")
	public List<Segmento> obtenerSegmentos(){ 
		Session session = this.sessionFactory.openSession();
		 
	    session.beginTransaction();	    	   	
	    Query q = session.createQuery("From Segmento ");	            
	    List<Segmento> resultList = q.list();
	    session.close();
	    
	    return resultList;
	}

	@SuppressWarnings("unchecked")
	public List<Node> obtenerNodes() {
		Session session = this.sessionFactory.openSession();
		 
	    session.beginTransaction();	    	   	
	    Query q = session.createQuery("From Node ");	            
	    List<Node> resultList = q.list();
	    session.close();
	    
	    return resultList;
	}

	@SuppressWarnings("unchecked")
	public List<Edge> obtenerEdges() {
		Session session = this.sessionFactory.openSession();
		 
	    session.beginTransaction();	    	   	
	    Query q = session.createQuery("From Edge ");	            
	    List<Edge> resultList = q.list();
	    session.close();
	    
	    return resultList;
	}
	
	
	public Segmento obtenerSegmento(int idEdge, boolean lado){ 
		Session session = this.sessionFactory.openSession();
		 
	    session.beginTransaction();	    	   	
	    Query q = session.createQuery(String.format(DAOFacade.SEGMENTOxEDGExLADO,idEdge,lado));
	    Object queryObject =q.uniqueResult(); 
	    Segmento result;
	    if(queryObject == null)
	    	result = null;
	    else
	    	result = (Segmento)queryObject;	    
	    session.close();
	    
	    return result;
		
	}
	
	public void guardarSegmento(Segmento segmento) {
		Session session = this.sessionFactory.openSession();
		 
	    org.hibernate.Transaction t = session.beginTransaction();
	    session.save(segmento);
	    t.commit();

	    session.close();

	}
	
	public void eliminarSegmento(Segmento segmento) {
		Session session = this.sessionFactory.openSession();
		 
	    org.hibernate.Transaction t = session.beginTransaction();
	    session.delete(segmento);
	    t.commit();

	    session.close();

	}
	public static void main(String[] args){
		DAOFacade dao = new DAOFacade(ConnectionPool.getSessionFactory());
		List<Edge> obtenerEdges = dao.obtenerEdges();
	}
		
}
