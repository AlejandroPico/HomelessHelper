package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Hablan;
import model.HablanPK;

@Repository

public class HablanDaoImpl implements HablanDao {
	@Autowired
	HablanJpaSpring hablanDao;

	@Override
	public void addHablan(Hablan hablan) {
		// TODO Auto-generated method stub
		hablanDao.save(hablan);		
	}

	@Override
	public void removeHablan(Hablan hablan) {
		// TODO Auto-generated method stub
		hablanDao.delete(hablan);
	}

	@Override
	public List<Hablan> getHablans() {
		// TODO Auto-generated method stub
		return hablanDao.findAll();
	}

	@Override
	public void removeHablan(HablanPK hablanPK) {
		// TODO Auto-generated method stub
		hablanDao.deleteById(hablanPK.getEmail());
	}

	@Override
	public Hablan retrieveHablan(HablanPK hablanPK) {
		// TODO Auto-generated method stub
		return hablanDao.findById(hablanPK.getEmail()).orElse(null);
	}

	@Override
	public void updateHablan(Hablan hablan) {
		// TODO Auto-generated method stub
		hablanDao.save(hablan);
	}

	
}
