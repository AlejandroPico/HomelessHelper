package dao;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Hablan;
import model.HablanPK;

@Service
public interface HablanDao {
	
	void addHablan(Hablan hablan);

	void removeHablan(Hablan hablan);

	List<Hablan> getHablans();

	void removeHablan(HablanPK hablanPK);

	Hablan retrieveHablan(HablanPK hablanPK);

	void updateHablan(Hablan hablan);
}