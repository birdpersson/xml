package informatika.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import informatika.model.Advert;

public interface Advertrepository extends JpaRepository<Advert, Long> { 
	List<Advert> findAll();
	
}
