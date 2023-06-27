package kaspper.com.bancomysql.services;

import java.util.List;

import kaspper.com.bancomysql.models.Usuario;

public interface UsuarioService {

Usuario salvar(Usuario usuario);
	
	Usuario atualizar(Usuario usuario);
	
	List<Usuario> listarUsuarios();
	
	Usuario listarUsuario(Long id);
	
	void remover(Long id);
}
