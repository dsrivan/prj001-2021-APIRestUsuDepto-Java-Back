package br.com.dsrivan.usuariodepartamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dsrivan.usuariodepartamento.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
