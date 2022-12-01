package com.sistemaescolar.sistemaEscolar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sistemaescolar.sistemaEscolar.entidades.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
