package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Aboutus;

@Repository

public class AboutusDaoImpl implements AboutusDao {
	@Autowired
	AboutusJpaSpring aboutusDao;

	@Override
	public void addAboutus(Aboutus aboutus) {
		// TODO Auto-generated method stub
		aboutusDao.save(aboutus);
	}

	@Override
	public void removeAboutus(Aboutus aboutus) {
		// TODO Auto-generated method stub
		aboutusDao.delete(aboutus);
	}

	@Override
	public List<Aboutus>getAboutus() {
		// TODO Auto-generated method stub
		return aboutusDao.findAll();
	}

	@Override
	public void removeAboutus(int id) {
		// TODO Auto-generated method stub
		aboutusDao.deleteById(id);
	}

	@Override
	public Aboutus retrieveAboutus(int id) {
		// TODO Auto-generated method stub
		return aboutusDao.findById(id).orElse(null);
	}

	@Override
	public void updateAboutus(Aboutus aboutus) {
		// TODO Auto-generated method stub
		aboutusDao.save(aboutus);
	}
}
