package es.iesnervion.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Mascota")
public class Mascota {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Raza")
	private String raza;
	
	@Column(name="Especie")
	private String especie;
	
	@Column(name="FechaNacimiento")
	private Date fechaNacimiento;
	
	@Column(name="FechaFallecimiento")
	private Date fechaFallecimiento;
	
	@Column(name="Alias")
	private String alias;
	
	@OneToMany(mappedBy="idVisita", cascade=CascadeType.ALL)
	private Set<Visita> visitas = new HashSet();
	
	@ManyToMany
	@JoinColumn(name="CodigoPropietario")
	private Cliente cliente;
	
	@ManyToMany(mappedBy="mascota", cascade=CascadeType.ALL)
	private Set<EnfermedadMascota> enfermedadesMascotas;
	
	
	public Mascota(){}
	
	public Mascota(int id, String raza, String especie, Date fechaNacimiento, Date fechaFallecimiento, String alias,
			Cliente cliente, Set<Visita> visitas) {
		super();
		this.id = id;
		this.raza = raza;
		this.especie = especie;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaFallecimiento = fechaFallecimiento;
		this.alias = alias;
		this.visitas = visitas;
		this.cliente = cliente;
	}
	
	public Cliente getCliente(){
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

	public Set<EnfermedadMascota> getEnfermedadesMascotas() {
		return enfermedadesMascotas;
	}

	public void setEnfermedadesMascotas(Set<EnfermedadMascota> enfermedadesMascotas) {
		this.enfermedadesMascotas = enfermedadesMascotas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaFallecimiento() {
		return fechaFallecimiento;
	}

	public void setFechaFallecimiento(Date fechaFallecimiento) {
		this.fechaFallecimiento = fechaFallecimiento;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Set<Visita> getVisitas() {
		return visitas;
	}

	public void setVisitas(Set<Visita> visitas) {
		this.visitas = visitas;
	}
	
	
	
}