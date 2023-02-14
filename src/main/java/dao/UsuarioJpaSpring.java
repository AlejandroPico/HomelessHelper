package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import jakarta.transaction.Transactional;
import model.Usuario;

public interface UsuarioJpaSpring extends JpaRepository<Usuario,String>{
	@Transactional
	@Modifying
	@Query("Delete from Usuario u Where u.email=?1")
	void removeByEmail(String email);
	
	@Transactional
	@Query("Select u from Usuario u Where u.email=?1 and u.clave=?2")
	Usuario checkUserExists(String email, String clave);
	}
