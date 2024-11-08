package aula12.exercicio28.repositories;

import aula12.exercicio28.entities.AutorEntity;
import aula12.exercicio28.entities.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Integer> {
}
