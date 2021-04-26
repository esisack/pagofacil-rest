package ar.com.midinamica.pagofacil.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ENTIDADES")
public class Entidad {
	

	@Id
	@Column(name = "ENTIDAD_ID")
	private Integer entidadId;

	public Integer getEntidadId() {
		return entidadId;
	}

	public void setEntidadId(Integer entidadId) {
		this.entidadId = entidadId;
	}
	
	
}
