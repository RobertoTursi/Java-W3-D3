package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "gestioneventi")
public class Evento implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String titolo;
	@Column(name = "data_evento", nullable = false)
	private int dataEvento;
	@Column(nullable = false)
	private String descrizione;
	@Column(name = "tipo_evento", nullable = false)
	private String tipoEvento;
	@Column(nullable = false)
	private Integer num_max_partecipanti;
	
	
	//GETTER E SETTER
	public Long getId() {
		return id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getDataEvento() {
		return dataEvento;
	}
	public void setDataEvento(int dataEvento) {
		this.dataEvento = dataEvento;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getTipoEvento() {
		return tipoEvento;
	}
	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	public Integer getNum_max_partecipanti() {
		return num_max_partecipanti;
	}
	public void setNum_max_partecipanti(Integer num_max_partecipanti) {
		this.num_max_partecipanti = num_max_partecipanti;
	}
	
	//TOSTRING
	@Override
	public String toString() {
		return "Evento [id=" + id + ", titolo=" + titolo + ", dataEvento=" + dataEvento + ", descrizione=" + descrizione
				+ ", tipoEvento=" + tipoEvento + ", num_max_partecipanti=" + num_max_partecipanti + "]";
	}
	
	
}
