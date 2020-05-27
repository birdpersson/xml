package informatika.service.impl;
import java.nio.file.AccessDeniedException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import informatika.model.Advert;
import informatika.repository.Advertrepository;
import informatika.service.AdvertService;

@Service
public class AdvertServiceImpl implements AdvertService {
	@Autowired
	private Advertrepository repo;
	

	public List<Advert> findAll() throws AccessDeniedException {
		List<Advert> result = repo.findAll();
		return result;
	}


	@Override
	public Optional<Advert> getAdById(Long id) {
		
		return repo.findById(id);
	}


	@Override
	public void save(Advert ad) {
		repo.save(ad);
	}

}
