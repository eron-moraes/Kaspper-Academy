package com.kaspper.exercicio.Praticando.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "enderecos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
	
	@jakarta.persistence.Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "ruao", nullable = false, length = 100)
	private String rua;
	
	@Column(name = "numero", nullable = true)
	private String numero;
	
	@Column(name = "bairro", nullable = true)
	private String bairro;
	
	@Column(name = "cidade", nullable = true)
	private String cidade;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false, updatable = false)
	private Cliente cliente;
	

}
