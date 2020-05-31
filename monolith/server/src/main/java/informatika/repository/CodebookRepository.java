package informatika.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import informatika.model.Advert;
import informatika.model.Fuel;
import informatika.model.Manufacturer;
import informatika.model.Model;

public interface CodebookRepository extends JpaRepository<Advert, Long> {
	
	@Query("SELECT m FROM Manufacturer m")
	List<Manufacturer> getManufacturers();
	
	@Query("SELECT m FROM Model m")
	List<Model> getModels();
	
	@Query("SELECT f FROM Fuel f")
	List<Fuel> getFuels();
	
	
	
}
