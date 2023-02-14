package service;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Hablan;
import model.HablanPK;

@Service
public interface HablanService {
	boolean addHablan(Hablan hablan);

	List<Hablan> retrieveHablan();

	boolean updateHablan(Hablan hablan);

	boolean deleteHablan(HablanPK hablanPK);

	Hablan retrieveHablan(HablanPK hablanPK);
}