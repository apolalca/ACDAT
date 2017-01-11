package es.iesnervion.model;

import java.sql.Date;

public class Visita {
	private int id;
	private Date fecha;
	private int peso;
	private Mascota mascota;
	
	public Visita(){}
	
	public Visita(int id, Date fecha, int peso, Mascota mascota) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.peso = peso;
		this.mascota = mascota;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	
	
}