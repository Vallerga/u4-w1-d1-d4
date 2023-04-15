package com.prenotazione.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prenotazione.model.Edificio;

@Repository
public interface Edificio_Dao extends CrudRepository<Edificio, Long> {

}
