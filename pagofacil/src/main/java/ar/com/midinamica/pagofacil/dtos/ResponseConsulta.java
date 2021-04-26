package ar.com.midinamica.pagofacil.dtos;

import java.util.List;

import ar.com.midinamica.pagofacil.model.Deudas;

public class ResponseConsulta {
	
	private String tipo_operacion;
	
	private String cod_cliente;
	
	private String nom_cliente;
	
	private String cod_severidad;
	
	private String utility;
	
	private String terminal;
	
	private String fecha;
	
	private String hora;
	
	private String cod_operacion;

	private String cod_respuesta;
	
	private String msg_respuesta;
	
	private String token;
	
	private List<Deudas> items;

	public String getTipo_operacion() {
		return tipo_operacion;
	}

	public void setTipo_operacion(String tipo_operacion) {
		this.tipo_operacion = tipo_operacion;
	}

	public String getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(String cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public String getNom_cliente() {
		return nom_cliente;
	}

	public void setNom_cliente(String nom_cliente) {
		this.nom_cliente = nom_cliente;
	}

	public String getCod_severidad() {
		return cod_severidad;
	}

	public void setCod_severidad(String cod_severidad) {
		this.cod_severidad = cod_severidad;
	}

	public String getUtility() {
		return utility;
	}

	public void setUtility(String utility) {
		this.utility = utility;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
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

	public String getCod_respuesta() {
		return cod_respuesta;
	}

	public void setCod_respuesta(String cod_respuesta) {
		this.cod_respuesta = cod_respuesta;
	}

	public String getMsg_respuesta() {
		return msg_respuesta;
	}

	public void setMsg_respuesta(String msg_respuesta) {
		this.msg_respuesta = msg_respuesta;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<Deudas> getItems() {
		return items;
	}

	public void setItems(List<Deudas> items) {
		this.items = items;
	}


}
