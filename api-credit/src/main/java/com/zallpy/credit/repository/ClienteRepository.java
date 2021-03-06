package com.zallpy.credit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zallpy.credit.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	Object findByCpf(Long cpf);


	/**
	 * Author: Damianos Sotirakis 
	 * Repository: Cliente
	 */

}
