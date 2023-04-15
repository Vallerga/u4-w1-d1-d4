package com.prenotazione.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.prenotazione.model.Edificio;
import com.prenotazione.model.Postazione;
import com.prenotazione.model.Tipo;
import com.prenotazione.model.Utente;
import com.prenotazione.service.Prenotazione_Service;

//import com.jpac_project.service.UserService;

@Component
public class Prenotazione_Runner implements ApplicationRunner {

	@Autowired
	Prenotazione_Service prenotazione;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Run...");
		prenotazione.FakePostazione();
	}
	
}