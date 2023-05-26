package ma.emsi.appcinema.entities;

import java.util.Collection;
import java.util.Date;

import jakarta.persistence.*;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Projection {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Date dateProjection;
	private String sdateProjection;
	private double prix;
	@ManyToOne
	private Salle salle;
	@ManyToOne
	private Film film;
	@OneToMany(mappedBy="projection")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Collection<Ticket> tickets;
	@ManyToOne
	private Sceance sceance;
	
	
}
