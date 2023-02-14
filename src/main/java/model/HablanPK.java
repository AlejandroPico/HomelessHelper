package model;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the hablan database table.
 * 
 */
@Embeddable
public class HablanPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private String email;

	@Column(name="email_oferta", insertable=false, updatable=false)
	private String emailOferta;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_conversacion")
	private java.util.Date fechaConversacion;

	public HablanPK() {
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailOferta() {
		return this.emailOferta;
	}
	public void setEmailOferta(String emailOferta) {
		this.emailOferta = emailOferta;
	}
	public java.util.Date getFechaConversacion() {
		return this.fechaConversacion;
	}
	public void setFechaConversacion(java.util.Date fechaConversacion) {
		this.fechaConversacion = fechaConversacion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof HablanPK)) {
			return false;
		}
		HablanPK castOther = (HablanPK)other;
		return 
			this.email.equals(castOther.email)
			&& this.emailOferta.equals(castOther.emailOferta)
			&& this.fechaConversacion.equals(castOther.fechaConversacion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.email.hashCode();
		hash = hash * prime + this.emailOferta.hashCode();
		hash = hash * prime + this.fechaConversacion.hashCode();
		
		return hash;
	}
}