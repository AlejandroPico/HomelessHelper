package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Usuario;

@Repository

public class UsuarioDaoImpl implements UsuarioDao {
	@Autowired
	UsuarioJpaSpring usuarioDao;

	@Override
	public void addUsuario(Usuario usuario) {
		usuarioDao.save(usuario);
	}

	@Override
	public void removeUsuario(Usuario usuario) {
		usuarioDao.delete(usuario);
	}

	@Override
	public List<Usuario> getUsuarios() {
		return usuarioDao.findAll();
	}

	@Override
	public void removeUsuario(String email) {
		usuarioDao.deleteById(email);
	}

	@Override
	public Usuario retrieveUsuario(String email) {
		return usuarioDao.findById(email).orElse(null);
	}

	@Override
	public void updateUsuario(Usuario usuario) {
		usuarioDao.save(usuario);
	}

	@Override
	public Usuario checkameUsuario(String email, String clave) {
		return usuarioDao.checkUserExists(email, clave);
	}

	@Override
	public void changePwd(String email, String clave, String new_clave) {
		Usuario usuario = usuarioDao.checkUserExists(email, clave);
		usuario.setClave(new_clave);
		usuarioDao.save(usuario);
	}
}
