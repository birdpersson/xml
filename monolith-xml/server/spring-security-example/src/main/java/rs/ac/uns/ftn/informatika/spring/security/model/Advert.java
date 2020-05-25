package rs.ac.uns.ftn.informatika.spring.security.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADVERT")
public class Advert {
	 @Id
	    @Column(name = "id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 
	    @Column(name = "title")
	    private String title;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

}
