package kaspper.com.bancomysql.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kaspper.com.bancomysql.models.Usuario;
import kaspper.com.bancomysql.repositories.UsuarioRepository;


@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario salvar(Usuario usuario) {
		return this.usuarioRepository.save(usuario);
	}

	@Override
	public Usuario atualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listarUsuarios() {
		return this.usuarioRepository.findAll();
	}
	
	

	@Override
	public Usuario listarUsuario(Long id) {
		Optional<Usuario> usuario = this.usuarioRepository.findById(id);
		return usuario.orElseThrow();
	}

	@Override
	public void remover(Long id) {
		this.usuarioRepository.deleteById(id);
	}

}