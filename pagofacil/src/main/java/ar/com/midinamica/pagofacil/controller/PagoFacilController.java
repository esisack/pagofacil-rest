package ar.com.midinamica.pagofacil.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
import ar.com.midinamica.pagofacil.services.PagoFacilService;


@CrossOrigin(value = "*",  maxAge = 3600)
@RestController
public class PagoFacilController {
	
	@Autowired
	private PagoFacilService pagoFacilService;
	
	@RequestMapping(value = "/consulta", method = RequestMethod.POST)
	public ResponseConsulta consulta(@RequestBody RequestConsulta consulta) {
		return pagoFacilService.consulta(consulta);	
	}
		
	@RequestMapping(value = "/directa", method = RequestMethod.POST)
	public ResponseDirecta directa(@RequestBody RequestDirecta directa) {		
		return pagoFacilService.directa(directa);	
	}
	
	@RequestMapping(value = "/reversa", method = RequestMethod.POST)
	public ResponseReversa reversa(@RequestBody RequestReversa reversa) {		
		return pagoFacilService.reversa(reversa);		
	}

}
