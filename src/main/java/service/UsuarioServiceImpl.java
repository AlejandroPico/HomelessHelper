package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UsuarioDao;
import model.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioDao usuarioDao;

	@Override
	public boolean addUsuario(Usuario usuario) {
		if (usuarioDao.retrieveUsuario(usuario.getEmail()) == null) {
			usuarioDao.addUsuario(usuario);
			return true;
		}
		return false;
	}

	@Override
	public List<Usuario> retrieveUsuarios() {
		return usuarioDao.getUsuarios();
	}

	@Override
	public boolean updateUsuario(Usuario usuario) {
		if (usuarioDao.retrieveUsuario(usuario.getEmail()) != null) {
			usuarioDao.updateUsuario(usuario);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteUsuario(String email) {
		if (usuarioDao.retrieveUsuario(email) != null) {
			usuarioDao.removeUsuario(email);
			return true;
		}
		return false;
	}

	@Override
	public Usuario retrieveUsuario(String email) {
		return usuarioDao.retrieveUsuario(email);
	}

	@Override
	public Usuario checkUserExists(String email, String clave) {
		return usuarioDao.checkameUsuario(email, clave);
	}

	@Override
	public boolean updatePassword(String email, String clave, String new_clave) {
		if (usuarioDao.checkameUsuario(email, clave).getEmail() != null) {
			usuarioDao.updateUsuario(checkUserExists(email, clave));
			return true;
		}
		return false;
	}
}
