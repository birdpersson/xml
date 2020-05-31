package informatika.service;

import java.util.List;

import informatika.model.Codebook;
import informatika.model.Fuel;
import informatika.model.Manufacturer;
import informatika.model.Model;

public interface CodebookService {
	public List<Manufacturer> getManufacturers();
	public List<Model> getModels();
	public List<Fuel> getFuels();
	public Codebook getAll();
}
