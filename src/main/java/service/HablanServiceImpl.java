package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.HablanDao;
import model.Hablan;
import model.HablanPK;

@Service
public class HablanServiceImpl implements HablanService {

	@Autowired
	HablanDao hablanDao;

	@Override
	public boolean addHablan(Hablan hablan) {
		// TODO Auto-generated method stub
		if (hablanDao.retrieveHablan(hablan.getId()) == null) {
			hablanDao.addHablan(hablan);
			return true;
		}
		return false;
	}

	@Override
	public List<Hablan> retrieveHablan() {
		// TODO Auto-generated method stub
		return hablanDao.getHablans();
	}

	@Override
	public boolean updateHablan(Hablan hablan) {
		// TODO Auto-generated method stub
		if (hablanDao.retrieveHablan(hablan.getId()) != null) {
			hablanDao.updateHablan(hablan);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteHablan(HablanPK hablanPK) {
		// TODO Auto-generated method stub
		if (hablanDao.retrieveHablan(hablanPK) != null) {
			hablanDao.removeHablan(hablanPK);
			return true;
		}
		return false;
	}

	@Override
	public Hablan retrieveHablan(HablanPK hablanPK) {
		// TODO Auto-generated method stub
		return hablanDao.retrieveHablan(hablanPK);
	}

}
