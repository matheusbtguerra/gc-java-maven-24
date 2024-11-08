package aula12.exercicio28.repositories;

import aula12.exercicio28.entities.AutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<AutorEntity, Integer> {
}
