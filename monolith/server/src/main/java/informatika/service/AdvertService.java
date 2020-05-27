package rs.ac.uns.ftn.informatika.spring.security.service;

import java.nio.file.AccessDeniedException;
import java.util.List;
import java.util.Optional;

import rs.ac.uns.ftn.informatika.spring.security.model.Advert;

public interface AdvertService {
		List<Advert> findAll() throws AccessDeniedException;
		Optional<Advert> getAdById(Long id);
		void save(Advert ad);
}
