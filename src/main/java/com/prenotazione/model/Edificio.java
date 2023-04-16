package com.prenotazione.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "edificio")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Edificio {
	@Id
    private String nome;
    private String indirizzo;
    private String città;
}
