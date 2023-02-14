package dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.Lugar;


@Service
public interface LugarJpaSpring extends JpaRepository<Lugar, Integer> { // El segundo campo es el tipo de la clave primaria 
	@Transactional
	@Modifying
	@Query("delete from Lugar l Where l.idLugar=?1") // Lugar no es el nombre de la tabla es el Objeto Lugar 
	void removeById(int idLugar);
}
