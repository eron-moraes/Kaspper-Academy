package kaspper.com.bancomysql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import kaspper.com.bancomysql.models.Usuario;
import kaspper.com.bancomysql.services.UsuarioServiceImpl;

@RestController
@RequestMapping("/usuarios")
@Validated
public class UsuarioController {
	
	@Autowired
	private UsuarioServiceImpl usuarioService;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> listarUsuarios() {
		List<Usuario> usuarios = this.usuarioService.listarUsuarios();
		return new ResponseEntity<>(usuarios, HttpStatus.OK);	
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> listarUsuario(@PathVariable Long id){
		Usuario usuario = this.usuarioService.listarUsuario(id);
		return ResponseEntity.ok().body(usuario);
		
	}
	@PostMapping
	public ResponseEntity<Usuario> salvar(@Valid @RequestBody Usuario usuario){
		this.usuarioService.salvar(usuario);
		return ResponseEntity.ok(this.usuarioService.salvar(usuario));	
	}
	
	public ResponseEntity<Usuario> atualizar(@RequestBody Usuario usuario){
		this.usuarioService.atualizar(usuario);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> remover(@PathVariable Long Id){
		this.usuarioService.remover(Id);
		return ResponseEntity.ok("Usuario removido");
	}
	

}