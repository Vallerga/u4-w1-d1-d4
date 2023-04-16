package com.prenotazione.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prenotazione.model.Utente;

@Repository
public interface Utente_Dao extends CrudRepository<Utente, Long> {
	public List<Utente> findByCognome(String cognome);

    public List<Utente> findByEmail(String email);

    public List<Utente> findByNome(String nome);
}
