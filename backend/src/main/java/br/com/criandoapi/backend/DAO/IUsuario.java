package br.com.criandoapi.backend.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.criandoapi.backend.model.Usuario;

public interface IUsuario extends JpaRepository<Usuario, Integer>{

}
