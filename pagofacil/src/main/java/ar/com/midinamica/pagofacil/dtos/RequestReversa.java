package ar.com.midinamica.pagofacil.dtos;

public class RequestReversa {

	private String tipo_operacion;
	
	private String utility;
	
	private String terminal;
		
	private String fecha;
	
	private String hora;
	
	private String secuencia;

	private String cod_trx;
	
	private String cod_operacion;
	
	private Integer importe;
	
	private String user;
	
	private String password;

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

	public Integer getImporte() {
		return importe;
	}

	public void setImporte(Integer importe) {
		this.importe = importe;
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
