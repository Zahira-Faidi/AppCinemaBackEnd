package ma.emsi.appcinema.entities;

import java.util.Collection;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Ville {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
@NotNull
@Size(min = 3, max = 30 , message="Taille entre 3 et 30")
private String name;
private double longitude,latitude,altitude;
@OneToMany(mappedBy="ville")
private Collection<Cinema> cinemas;
}