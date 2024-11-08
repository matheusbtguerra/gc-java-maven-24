package aula12.exercicio28.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class AutorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer autorId;
    private String nome;
    private LocalDate dataNascimento;
}
