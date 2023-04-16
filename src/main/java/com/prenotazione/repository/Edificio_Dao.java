package com.prenotazione.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prenotazione.model.Edificio;

@Repository
public interface Edificio_Dao extends CrudRepository<Edificio, Long> {
	public List<Edificio> findByCittà(String città);

    public List<Edificio> findByIndirizzo(String indirizzo);

    public List<Edificio> findBynome(String nome);
}
