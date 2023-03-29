package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import model.Evento;
import utils.JpaUtil;

public class EventoDAO {
	static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
	static EntityManager em = emf.createEntityManager();
	
	public static void save(Evento e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		
		System.out.println("evento aggiunto al db");
	}
}
