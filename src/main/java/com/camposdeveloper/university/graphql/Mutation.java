package com.camposdeveloper.university.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.camposdeveloper.university.UsuarioService;
import com.camposdeveloper.university.entity.Usuario;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class Mutation implements GraphQLMutationResolver {
	
	@Autowired
	UsuarioService usuarioService;
	
	public Usuario salvarUsuario(String nome) {
		return usuarioService.salvarUsuario(nome);
	}

}
