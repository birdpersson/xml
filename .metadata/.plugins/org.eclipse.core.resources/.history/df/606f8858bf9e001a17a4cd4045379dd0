package rs.ac.uns.ftn.informatika.spring.security.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.uns.ftn.informatika.spring.security.model.Advert;
import rs.ac.uns.ftn.informatika.spring.security.service.AdvertService;

@RestController
@RequestMapping(value = "/api/advert", produces = MediaType.APPLICATION_JSON_VALUE)

public class AdvertController {

	@Autowired
	private AdvertService adservice;
	

	@GetMapping("/all")
	@PreAuthorize("hasRole('ADMIN')")
	public List<Advert> getAllAds() {
		return adservice.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Advert> getAdById(@PathVariable Long id) {
		return adservice.getAdById(id);
	}
	
	@PostMapping(value = "/add",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Advert addAdvert(@RequestBody Advert ad){
		adservice.save(ad);
		return ad;
	}

	
}
