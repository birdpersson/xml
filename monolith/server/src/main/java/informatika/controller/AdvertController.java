package informatika.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import informatika.model.Advert;
import informatika.model.User;
import informatika.security.TokenUtils;
import informatika.service.AdvertService;
import informatika.service.impl.CustomUserDetailsService;

@RestController
@RequestMapping(value = "/api/advert", produces = MediaType.APPLICATION_JSON_VALUE)

public class AdvertController {

	@Autowired
	private AdvertService adservice;
	
	@Autowired
	private TokenUtils tokenUtils;

	@Autowired
	private CustomUserDetailsService userDetailsService;

	//@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/all")
	public List<Advert> getAllAds(@RequestHeader("Authorization") String header) throws AccessDeniedException {
		// Jer je header string BEARER + token pa sklanjamo visak
		String token = header.split(" ")[1]; 
		String username = this.tokenUtils.getUsernameFromToken(token);
		System.out.println(username);
		User user = (User) this.userDetailsService.loadUserByUsername(username);
		System.out.println(user);
		return adservice.findAll(user.getId());
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
