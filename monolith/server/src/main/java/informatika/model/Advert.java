package informatika.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
		
		@Column(name = "user_id")
		private Long user_id;
		
		@ManyToOne
		@JoinColumn(name="user_id")		
		public Long getOwner() {
			return user_id;
		}

		public void setOwner(Long owner) {
			this.user_id = owner;
		}


	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

}
