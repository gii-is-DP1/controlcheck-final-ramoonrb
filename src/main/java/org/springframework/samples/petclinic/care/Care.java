package org.springframework.samples.petclinic.care;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.samples.petclinic.pet.PetType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Care {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@NotEmpty
	@Column(unique=true)
	@Size(min=5,max=50)
    String name;
	
	@NotEmpty
    String description;
	
	@ManyToMany
	@NotEmpty
	@Cascade(CascadeType.ALL)
    Set<PetType> compatiblePetTypes;
}
