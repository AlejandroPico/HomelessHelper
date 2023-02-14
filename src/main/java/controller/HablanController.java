package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import service.HablanService;
import model.Hablan;
import model.HablanPK;

@RestController
public class HablanController {
	@Autowired
	HablanService hablanservice;

	@GetMapping(value = "hablan", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Hablan> retrieveHablans() {
		return hablanservice.retrieveHablan();
	}

	@GetMapping(value = "hablan/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Hablan retrieveHablan(@PathVariable("email") HablanPK hablanpk) {
		return hablanservice.retrieveHablan(hablanpk);
	}

	@PostMapping(value = "hablan", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saveHablan(@RequestBody Hablan hablan) {
		return String.valueOf(hablanservice.addHablan(hablan));
	}

	@PutMapping(value = "hablan", produces = MediaType.APPLICATION_JSON_VALUE)
	public String updateHablan(@RequestBody Hablan hablan) {
		return String.valueOf(hablanservice.updateHablan(hablan));
	}

	@DeleteMapping(value = "hablan/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteHablan(@PathVariable("email") HablanPK hablanpk) {
		return String.valueOf(hablanservice.deleteHablan(hablanpk));
	}
}
