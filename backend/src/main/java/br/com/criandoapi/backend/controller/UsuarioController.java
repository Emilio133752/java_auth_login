package br.com.criandoapi.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.criandoapi.backend.DAO.IUsuario;
import br.com.criandoapi.backend.model.Usuario;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/usuarios")
public class UsuarioController{
	
	@Autowired
	private IUsuario dao;
	
	@GetMapping
	public List<Usuario> listaUsuarios() {
		return (List<Usuario>) dao.findAll();
	}

    @PostMapping
    public ResponseEntity<Usuario> criarUsuarios(@RequestBody Usuario usuario) {
        Usuario usuarioNovo = dao.save(usuario);
        return ResponseEntity.status(200).body(usuarioNovo);
    }
    
    @PutMapping
    public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioNovo = dao.save(usuario);
        return ResponseEntity.status(200).body(usuarioNovo);
    }
	
}
