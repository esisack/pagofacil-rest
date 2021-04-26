package ar.com.midinamica.pagofacil.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.midinamica.pagofacil.dtos.RequestConsulta;
import ar.com.midinamica.pagofacil.dtos.RequestDirecta;
import ar.com.midinamica.pagofacil.dtos.RequestReversa;
import ar.com.midinamica.pagofacil.dtos.ResponseConsulta;
import ar.com.midinamica.pagofacil.dtos.ResponseDirecta;
import ar.com.midinamica.pagofacil.dtos.ResponseReversa;
import ar.com.midinamica.pagofacil.model.Deudas;


@CrossOrigin(value = "*",  maxAge = 3600)
@RestController
public class PagoFacilController {
	
	
	@RequestMapping(value = "/consulta", method = RequestMethod.POST)
	public ResponseConsulta consulta(@RequestBody RequestConsulta consulta) {
		
		ResponseConsulta response = new ResponseConsulta();
		response.setTipo_operacion("CashOut");
		response.setCod_cliente("18870615");
		response.setNom_cliente("Pablo Arias");
		response.setCod_severidad("0");
		response.setUtility("90061234");
		response.setTerminal("D00561");
		response.setFecha("20190106");
		response.setHora("102015");
		response.setCod_operacion("C");
		response.setCod_respuesta("0");
		response.setMsg_respuesta("Consulta exitosa");
		response.setToken("238950");
		List<Deudas> deudas = new ArrayList<Deudas>();
		Deudas deuda = new Deudas();
		deudas.add(deuda);

		return response;	
	}
		
	@RequestMapping(value = "/directa", method = RequestMethod.POST)
	public ResponseDirecta directa(@RequestBody RequestDirecta directa) {
		ResponseDirecta response = new ResponseDirecta();
		response.setTipo_operacion("CashOut");
		response.setUtility("90061234");
		response.setCod_trx("D00561201901061022100001");
		response.setCod_operacion("D");
		response.setCod_severidad("0");
		response.setCod_respuesta("0");
		response.setCod_descripcion("Consulta exitosa");
		response.setCodAutentic("123456");

		return response;	
	}
	
	@RequestMapping(value = "/reversa", method = RequestMethod.POST)
	public ResponseReversa reversa(@RequestBody RequestReversa reversa) {
		ResponseReversa response = new ResponseReversa();
		response.setTipo_operacion("CashOut");
		response.setCod_operacion("R");
		response.setUtility("90061234");;
		response.setTerminal("D00561");
		response.setFecha("20190106");
		response.setHora("102015");
		response.setSecuencia("");
		response.setCod_trx("D00561201901061022100001");
		response.setCod_severidad("0");
		response.setCod_respuesta("0");
		response.setCod_descripcion("Transaccion reversada con exito");

		return response;		
	}

}
