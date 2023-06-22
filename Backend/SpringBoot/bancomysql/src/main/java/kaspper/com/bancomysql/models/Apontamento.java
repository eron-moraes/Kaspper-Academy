package kaspper.com.bancomysql.models;

import java.sql.Date;

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
@Table (name = "apontamentos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apontamento {
	
	@jakarta.persistence.Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "descricao", nullable = false, length = 100)
	private String descricao;
	
	@Column(name = "data_lancamento", nullable = true)
	private Date dataLAncamento;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false, updatable = false)
	private Usuario usuario;
	
	

}
