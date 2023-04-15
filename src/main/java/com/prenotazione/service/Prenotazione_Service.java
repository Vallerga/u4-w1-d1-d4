package com.prenotazione.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.prenotazione.model.Edificio;
import com.prenotazione.model.Postazione;
import com.prenotazione.model.Utente;
import com.prenotazione.repository.Edificio_Dao;
import com.prenotazione.repository.Postazione_Dao;
import com.prenotazione.repository.Utente_Dao;

@Service
public class Prenotazione_Service {

	@Autowired
	private Edificio_Dao edificio_dao;
	@Autowired
	private Postazione_Dao postazione_dao;
	@Autowired
	private Utente_Dao utente_dao;

	@Autowired
	@Qualifier("FakePostazione")
	private ObjectProvider<Postazione> FakePostazione;
	@Autowired
	@Qualifier("FakeEdificio")
	private ObjectProvider<Edificio> FakeEdificio;
	@Autowired
	@Qualifier("FakeUtente")
	private ObjectProvider<Utente> FakeUtente;

	public void FakePostazione() {
		insertPostazione(FakePostazione.getObject());
		//insertUtente(FakeUtente.getObject());
		//insertEdificio(FakeEdificio.getObject());
	}
	
	public void insertPostazione(Postazione p) {
		postazione_dao.save(p);
    }
	
	public void insertUtente(Utente u) {
		utente_dao.save(u);
    }
	
	public void insertEdificio(Edificio e) {
		edificio_dao.save(e);
    }
}
