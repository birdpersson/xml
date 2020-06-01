package informatika.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "ADVERT")
public class Advert {
		@Override
	public String toString() {
		return "Advert [id=" + id + ", title=" + title + ", user_id=" + user_id + "]";
	}

		@Id
	    @Column(name = "id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 
		@Column(name = "title")
	    private String title;
		
		@Column(name = "user_id")
		private Long user_id;
		
		@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	    public Pricelist priceList;

		@ManyToOne
		@JoinColumn(name="user_id")		
		public Long getUser_id() {
			return user_id;
		}

		public void setUser_id(Long user_id) {
			this.user_id = user_id;
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
