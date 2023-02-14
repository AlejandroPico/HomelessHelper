package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the hablan database table.
 * 
 */
@Entity
@NamedQuery(name="Hablan.findAll", query="SELECT h FROM Hablan h")
public class Hablan implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HablanPK id;

	@Lob
	private String mensaje;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="email_oferta", insertable=false, updatable=false)
	private Usuario usuario1;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="email", insertable=false, updatable=false)
	private Usuario usuario2;

	public Hablan() {
	}

	public HablanPK getId() {
		return this.id;
	}

	public void setId(HablanPK id) {
		this.id = id;
	}

	public String getMensaje() {
		return this.mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Usuario getUsuario1() {
		return this.usuario1;
	}

	public void setUsuario1(Usuario usuario1) {
		this.usuario1 = usuario1;
	}

	public Usuario getUsuario2() {
		return this.usuario2;
	}

	public void setUsuario2(Usuario usuario2) {
		this.usuario2 = usuario2;
	}

}