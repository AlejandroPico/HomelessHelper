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

import service.AboutusService;
import model.Aboutus;

@RestController
public class AboutusController {
	@Autowired
	AboutusService aboutusservice;

	@GetMapping(value = "aboutus", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Aboutus> retrieveAboutuss() {
		return aboutusservice.retrieveAboutus();
	}

	@GetMapping(value = "aboutus/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Aboutus retrieveAboutus(@PathVariable("id") int id) {
		return aboutusservice.retrieveAboutus(id);
	}

	@PostMapping(value = "aboutus", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saveAboutus(@RequestBody Aboutus aboutus) {
		return String.valueOf(aboutusservice.addAboutus(aboutus));
	}

	@PutMapping(value = "aboutus", produces = MediaType.APPLICATION_JSON_VALUE)
	public String updateAboutus(@RequestBody Aboutus aboutus) {
		return String.valueOf(aboutusservice.updateAboutus(aboutus));
	}

	@DeleteMapping(value = "aboutus/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteAboutus(@PathVariable("id") int id) {
		return String.valueOf(aboutusservice.deleteAboutus(id));
	}
}
