package com.kaspper.exercicio.Praticando.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Entity
	@Table(name ="clientes")
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public class Cliente {
	
		
		@Id
		@Column(name="id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name="nome", unique = true, nullable = false, length = 60)
		private String nome;
		
		
		@OneToMany(mappedBy = "cliente")
		private List<Endereco> apontamentos = new ArrayList<Endereco>();
		

	}

