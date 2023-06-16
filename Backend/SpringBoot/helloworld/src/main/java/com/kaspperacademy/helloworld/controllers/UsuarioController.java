package com.kaspperacademy.helloworld.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaspperacademy.helloworld.models.Usuario;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@GetMapping
	public ArrayList<Usuario> getUsuarios(){
		ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();
		listaUsuario.add(new Usuario("User1", "user1@user.com"));
		listaUsuario.add(new Usuario("User2", "user2@user.com"));
		listaUsuario.add(new Usuario("User3", "user3@user.com"));
		return listaUsuario;
	}
	
	@GetMapping("/usuario")
	public Usuario getUsuarioTest() {
		Usuario usuario = new Usuario("Edu Falaschi", "edu@falaschi.com");
		return usuario;
		
	}

}
