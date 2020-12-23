package net.codejava;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

	//specify type of entity domain class and type of ID
	//Spring JPA can generate proxy instance of this implementation of this interface
	//JpaRepository automaticaly comes with SAVE, FINDALL, FINDBYID, DELETEBYID
	//Essentially is like we wrote SAVE, FINDALL, FINDByID, and DELETEBYID methods ourselves
	
	
}
