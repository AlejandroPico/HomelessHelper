package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the lugar database table.
 * 
 */
@Entity
@NamedQuery(name="Lugar.findAll", query="SELECT l FROM Lugar l")
public class Lugar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_lugar")
	private int idLugar;

	@Lob
	private String descripcion;

	private int telefono;

	@Column(name="tipo_lugar")
	private String tipoLugar;

	private String ubicacion;

	private int valoracion;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="email_responsable")
	private Usuario usuario;

	public Lugar() {
	}

	public int getIdLugar() {
		return this.idLugar;
	}

	public void setIdLugar(int idLugar) {
		this.idLugar = idLugar;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getTipoLugar() {
		return this.tipoLugar;
	}

	public void setTipoLugar(String tipoLugar) {
		this.tipoLugar = tipoLugar;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getValoracion() {
		return this.valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}