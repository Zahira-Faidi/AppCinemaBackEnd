package ma.emsi.appcinema.entities;

import java.util.Collection;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Cinema{
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private double longitude,latitude,altitude;
private int nombreSalles;
@OneToMany(mappedBy="cinema")
private Collection<Salle> salles;
@ManyToOne
private Ville ville;

}
