package cl.generation.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.generation.web.models.Imagen;

@Repository
public interface ImagenRepository extends JpaRepository<Imagen, Long>{

}
