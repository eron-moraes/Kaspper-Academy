package kaspper.com.bancomysql.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

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
@Table(name ="usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nome", unique = true, nullable = false, length = 60)
	private String nome;
	
	
	@OneToMany(mappedBy = "usuario")
	@JsonProperty(access = Access.READ_WRITE)
	private List<Apontamento> apontamentos = new ArrayList<Apontamento>();

	

}
