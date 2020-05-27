package informatika.service;

import java.nio.file.AccessDeniedException;
import java.util.List;
import java.util.Optional;

import informatika.model.Advert;

public interface AdvertService {
		List<Advert> findAll() throws AccessDeniedException;
		Optional<Advert> getAdById(Long id);
		void save(Advert ad);
}
