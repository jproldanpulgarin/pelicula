package co.edu.iudigital.app.model.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.iudigital.app.model.entity.Gender;

/*extends herencia interfaz
 * implements implementar clase*/
public interface GenderRepository extends /*herencia*/ CrudRepository<Gender/*modelo entidad*/, Integer/*tipo dato*/>{
/*Metodos abstractos, implementarlos en otra clase para que implemente esa interfaz*/
	
	
}
