package informatika.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import informatika.model.Codebook;
import informatika.model.Fuel;
import informatika.model.Manufacturer;
import informatika.model.Model;
import informatika.repository.CodebookRepository;
import informatika.service.CodebookService;

@Service
public class CodebookServiceImpl implements CodebookService {
	@Autowired
	private CodebookRepository repo;
	
	public List<Manufacturer> getManufacturers(){
		return repo.getManufacturers();
	}
	public List<Model> getModels(){
		return repo.getModels();
	}
	public List<Fuel> getFuels(){
		return repo.getFuels();
	}
	@Override
	public Codebook getAll() {
		Codebook cb = new Codebook();
		cb.setFuels(getFuels());
		cb.setManufacturers(getManufacturers());
		cb.setModels(getModels());
		
		return cb;
	}
	}