package kaspper.com.bancomysql.models;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
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
	@NotBlank(message = "Campo [Nome] Obrigatório!")
	@Size(min = 5, max = 60, message = "O [Nome] deve ter entre 5 e 60 caracteres.")
	private String nome;
	
	
	@OneToMany(mappedBy = "usuario")
	@JsonProperty(access = Access.READ_WRITE)
	private List<Apontamento> apontamentos = new ArrayList<Apontamento>();

	@Column(name="email", length = 60)
	@Email(message = "Informe um email válido!")
	private String email;
	
	@Column(name = "data_nascimento")
	@DateTimeFormat(pattern = "dd/mm/aaaa")
	@Past
	private LocalTime dataNascimento;
	

}
