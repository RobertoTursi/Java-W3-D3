package controller;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import model.Evento;
import model.tipoEvento;
import utils.JpaUtil;

public class MainProject {

	public static void main(String[] args) {
		Evento e1 = new Evento();
		e1.setTitolo("Party1");
		e1.setDataEvento(2023-04-03);
		e1.setDescrizione("Serata a base di alcol e droghe");
		e1.setTipoEvento("PUBBLICO");
		e1.setNum_max_partecipanti(600);
		
		try {
			EventoDAO.save(e1);
		}catch(Exception ex) {
			
		}finally {  //ATTENZIONE qui potrebbe esserci un errore
			EventoDAO.em.close();
			EventoDAO.emf.close();
			JpaUtil.getEntityManagerFactory().close();
		}
	}

}
