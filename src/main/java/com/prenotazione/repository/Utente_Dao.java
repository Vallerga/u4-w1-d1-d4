package com.prenotazione.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prenotazione.model.Utente;

@Repository
public interface Utente_Dao extends CrudRepository<Utente, Long> {

}
