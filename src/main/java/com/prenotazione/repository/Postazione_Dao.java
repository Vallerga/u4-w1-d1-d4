package com.prenotazione.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prenotazione.model.Postazione;



@Repository
public interface Postazione_Dao extends CrudRepository<Postazione, Long> {

}
