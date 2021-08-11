package ar.com.midinamica.pagofacil.model;

public class Deudas {

	private String id_item;
	
	private String cod_barra;
	
	private Integer importe;
	
	private Boolean monto_abierto;
	
	private String texto_mostrar;
	
	private String prioriza_deuda;
	
	private Integer orden;
	
	private String fecha_vencimiento;

	
	public String getId_item() {
		return id_item;
	}

	public void setId_item(String id_item) {
		this.id_item = id_item;
	}

	public String getCod_barra() {
		return cod_barra;
	}

	public void setCod_barra(String cod_barra) {
		this.cod_barra = cod_barra;
	}

	public Integer getImporte() {
		return importe;
	}

	public void setImporte(Integer importe) {
		this.importe = importe;
	}

	public Boolean getMonto_abierto() {
		return monto_abierto;
	}

	public void setMonto_abierto(Boolean monto_abierto) {
		this.monto_abierto = monto_abierto;
	}

	public String getTexto_mostrar() {
		return texto_mostrar;
	}

	public void setTexto_mostrar(String texto_mostrar) {
		this.texto_mostrar = texto_mostrar;
	}

	public String getPrioriza_deuda() {
		return prioriza_deuda;
	}

	public void setPrioriza_deuda(String prioriza_deuda) {
		this.prioriza_deuda = prioriza_deuda;
	}

	public Integer getOrden() {
		return orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	public String getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	public void setFecha_vencimiento(String fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}
	
}
