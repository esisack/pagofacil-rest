package ar.com.midinamica.pagofacil.dtos;

public class ResponseReversa {

	private String tipo_operacion;
	
	private String cod_operacion;
	
	private String utility;
	
	private String terminal;
	
	private String fecha;
	
	private String hora;
	
	private String secuencia;

	private String cod_trx;
	
	private String cod_severidad;
	
	private String cod_respuesta;
	
	private String cod_descripcion;

	public String getTipo_operacion() {
		return tipo_operacion;
	}

	public void setTipo_operacion(String tipo_operacion) {
		this.tipo_operacion = tipo_operacion;
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

	public String getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(String secuencia) {
		this.secuencia = secuencia;
	}

	public String getCod_trx() {
		return cod_trx;
	}

	public void setCod_trx(String cod_trx) {
		this.cod_trx = cod_trx;
	}

	public String getCod_operacion() {
		return cod_operacion;
	}

	public void setCod_operacion(String cod_operacion) {
		this.cod_operacion = cod_operacion;
	}

	public String getCod_severidad() {
		return cod_severidad;
	}

	public void setCod_severidad(String cod_severidad) {
		this.cod_severidad = cod_severidad;
	}

	public String getCod_respuesta() {
		return cod_respuesta;
	}

	public void setCod_respuesta(String cod_respuesta) {
		this.cod_respuesta = cod_respuesta;
	}

	public String getCod_descripcion() {
		return cod_descripcion;
	}

	public void setCod_descripcion(String cod_descripcion) {
		this.cod_descripcion = cod_descripcion;
	}
	
}
