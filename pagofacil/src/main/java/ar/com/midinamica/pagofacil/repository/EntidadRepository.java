package ar.com.midinamica.pagofacil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.midinamica.pagofacil.model.Entidad;

@Repository
public interface EntidadRepository extends JpaRepository<Entidad, Integer> {

}
