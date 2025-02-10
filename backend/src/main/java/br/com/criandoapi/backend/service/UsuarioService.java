package br.com.criandoapi.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.criandoapi.backend.DAO.IUsuario;
import br.com.criandoapi.backend.model.Usuario;

@Service
public class UsuarioService {
	private IUsuario repository;
	
	public UsuarioService(IUsuario repository) {
		this.repository = repository;
	}
	
	public List<Usuario> listarUsuario(){
		List<Usuario> lista = repository.findAll();
		return lista;
	}
	public Usuario criarUsuario(Usuario usuario){
		Usuario usuarioNovo = repository.save(usuario);
		return usuarioNovo;
	}
	public Usuario editarUsuario(Usuario usuario){
		Usuario usuarioNovo = repository.save(usuario);
		return usuarioNovo;
	}
	public Boolean deletarUsuario(Integer id) {
		repository.deleteById(id);
		return true;
	}
	
}
