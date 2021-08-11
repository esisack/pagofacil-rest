package ar.com.midinamica.pagofacil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.midinamica.pagofacil.model.LogPago;

@Repository
public interface LogPagoRepository extends JpaRepository<LogPago, Integer> {

}
