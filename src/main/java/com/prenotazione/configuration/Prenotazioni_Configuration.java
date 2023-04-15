package com.prenotazione.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.prenotazioni.model.Edificio;
import com.prenotazioni.model.Postazione;
import com.prenotazioni.model.Tipo;
import com.prenotazioni.model.Utente;

@Configuration
public class Prenotazioni_Configuration {
	
	@Bean("postazionecrea")
	@Scope("prototype")
	public Postazione postazionecrea(String descrizionePostazione, Tipo tipo, Integer numMaxOccupanti,
			Edificio edificio) {
		return new Postazione(null, descrizionePostazione, tipo, numMaxOccupanti, edificio);
	}
	
	@Bean("edificiocrea")
	@Scope("prototype")
	public Edificio edificiocrea(String nome, String indirizzo, String città) {
		return new Edificio(nome, indirizzo, città);
	}
	
	@Bean("utentecrea")
	@Scope("prototype")
	public Utente utentecrea(String cognome, String nome, String email, Postazione postazione) {
		return new Utente(cognome, nome, email, postazione);
	}
	
	@Bean("FakePostazione")
    @Scope("prototype")
    public Postazione FakePostazione() {
        Faker fake = Faker.instance(new Locale("it-IT"));        
        Postazione p = new Postazione();
        p.setDescrizionePostazione(fake.funnyName().name());
        p.setNumMaxOccupanti(fake.number().numberBetween(100, 180));
        p.setTipo(Tipo.OPENSPACE);
        p.setEdificio(FakeEdificio());
        return p;
    }
	
	@Bean("FakeEdificio")
    @Scope("prototype")
    public Edificio FakeEdificio() {
        Faker fake = Faker.instance(new Locale("it-IT"));        
        Edificio e = new Edificio();
        e.setCittà(fake.address().cityName());
        e.setIndirizzo(fake.address().streetName());
        e.setNome(fake.funnyName().name());;
        return e;
    }
	
	@Bean("FakeUtente")
    @Scope("prototype")
    public Utente FakeUtente() {
		Faker fake = Faker.instance(new Locale("it-IT"));
		Utente u = new Utente();
		u.setCognome(fake.name().lastName());
		u.setNome(fake.name().firstName());
		u.setEmail(u.getNome() + "." + u.getCognome() + "@gmail.com");
		return u;
	}
}