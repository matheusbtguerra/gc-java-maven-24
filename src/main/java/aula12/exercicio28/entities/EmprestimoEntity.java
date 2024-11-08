package aula12.exercicio28.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class EmprestimoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer emprestimoId;

    @ManyToOne
    @JoinColumn(name = "livroId")
    private LivroEntity livro;

    private String nomePessoa;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
}
