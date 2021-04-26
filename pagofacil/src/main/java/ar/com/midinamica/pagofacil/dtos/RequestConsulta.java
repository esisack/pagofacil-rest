package ar.com.midinamica.pagofacil.dtos;

import java.util.Map;

public class RequestConsulta {

	private String tipo_operacion;
	
	private Map<String, Object> campos_busqueda;
	
	private String utility;
	
	private String fecha;
	
	private String hora;
	
	private String cod_operacion;
	
	private String user;
	
	private String password;

	public String getTipo_operacion() {
		return tipo_operacion;
	}

	public void setTipo_operacion(String tipo_operacion) {
		this.tipo_operacion = tipo_operacion;
	}

	public Map<String, Object> getCampos_busqueda() {
		return campos_busqueda;
	}

	public void setCampos_busqueda(Map<String, Object> campos_busqueda) {
		this.campos_busqueda = campos_busqueda;
	}

	public String getUtility() {
		return utility;
	}

	public void setUtility(String utility) {
		this.utility = utility;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getCod_operacion() {
		return cod_operacion;
	}

	public void setCod_operacion(String cod_operacion) {
		this.cod_operacion = cod_operacion;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
