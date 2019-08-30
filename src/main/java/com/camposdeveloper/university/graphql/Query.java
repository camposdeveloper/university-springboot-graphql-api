package com.camposdeveloper.university.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.camposdeveloper.university.UsuarioService;
import com.camposdeveloper.university.entity.Usuario;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver{
	
	@Autowired
	UsuarioService usuarioService;
	
	public String getStatus() {
		return "GraphQL em execução!";
	}
	
	public Usuario buscarUsuario(Long id) {
		return usuarioService.buscarUsuario(id);
	}
	
	public List<Usuario> buscarUsuarios() {
		return usuarioService.buscarUsuarios();
	}

}
