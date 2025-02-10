package br.com.criandoapi.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.criandoapi.backend.DAO.IUsuario;
import br.com.criandoapi.backend.model.Usuario;
import br.com.criandoapi.backend.service.UsuarioService;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;




@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController{
	
	@Autowired
	private IUsuario dao;
	private UsuarioService usuarioService;
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@GetMapping
	public ResponseEntity<List<Usuario>> listaUsuarios() {
        return ResponseEntity.status(200).body(usuarioService.listarUsuario());
	}

    @PostMapping
    public ResponseEntity<Usuario> criarUsuarios(@Valid @RequestBody Usuario usuario) {
        return ResponseEntity.status(201).body(usuarioService.criarUsuario(usuario));
    }
    
    @PutMapping
    public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioNovo = dao.save(usuario);
        return ResponseEntity.status(202).body(usuarioNovo);
    }
	@DeleteMapping("/{id}")
	public ResponseEntity<Optional<Usuario>> excluirUsuario(@PathVariable Integer id){
		Optional<Usuario> deleteUsuario = dao.findById(id);
		dao.deleteById(id);
        return ResponseEntity.status(204).body(deleteUsuario);
	}
}
