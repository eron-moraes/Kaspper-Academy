package kaspper.com.bancomysql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kaspper.com.bancomysql.models.Apontamento;

@Repository
public interface ApontamentoRepository extends JpaRepository<Apontamento, Long> {

}
