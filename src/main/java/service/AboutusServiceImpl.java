package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AboutusDao;
import model.Aboutus;

@Service
public class AboutusServiceImpl implements AboutusService {

	@Autowired
	AboutusDao aboutusDao;

	@Override
	public boolean addAboutus(Aboutus aboutus) {
		// TODO Auto-generated method stub
		if (aboutusDao.retrieveAboutus(aboutus.getId()) == null) {
			aboutusDao.addAboutus(aboutus);
			return true;
		}
		return false;
	}

	@Override
	public List<Aboutus> retrieveAboutus() {
		// TODO Auto-generated method stub
		return aboutusDao.getAboutus();
	}

	@Override
	public boolean updateAboutus(Aboutus aboutus) {
		// TODO Auto-generated method stub
		if (aboutusDao.retrieveAboutus(aboutus.getId()) != null) {
			aboutusDao.updateAboutus(aboutus);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteAboutus(int id) {
		// TODO Auto-generated method stub
		if (aboutusDao.retrieveAboutus(id) != null) {
			aboutusDao.removeAboutus(id);
			return true;
		}
		return false;
	}

	@Override
	public Aboutus retrieveAboutus(int id) {
		// TODO Auto-generated method stub
		return aboutusDao.retrieveAboutus(id);
	}

}
