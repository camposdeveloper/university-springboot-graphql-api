package com.camposdeveloper.university;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.camposdeveloper.university.entity.Usuario;

@Service
public class UsuarioService {
	
	static List<Usuario> listUsuarios = new ArrayList<>();
	
	public Usuario salvarUsuario(String nome) {
		Usuario usuario = new Usuario();
		usuario.setId(Long.valueOf(listUsuarios.size() + 1));
		usuario.setNome(nome);
		listUsuarios.add(usuario);
		return usuario;
	}
	
	public List<Usuario> buscarUsuarios() {
		return listUsuarios;
	}
	
	public Usuario buscarUsuario(Long id) {
		for(Usuario u: listUsuarios) {
			if(u.getId().equals(id)) return u;
		}
		return null;
	}

}
