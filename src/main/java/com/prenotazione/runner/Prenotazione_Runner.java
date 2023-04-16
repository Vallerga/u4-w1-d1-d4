package com.prenotazione.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.prenotazione.service.Prenotazione_Service;

@Component
public class Prenotazione_Runner implements ApplicationRunner {

	@Autowired
	Prenotazione_Service prenotazione;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Run...");
		prenotazione.creaUtente();
		//prenotazione.FakePostazione();
		test();
	}
	
	public void test() {
		System.out.println("cosacazzofai");
	}
	
}