package samumene.taskList.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter @Setter
@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario usuario;

    @Column(nullable = false)
    private String nomeCategoria;

    private String descricao;

    @OneToMany(mappedBy = "categoria")
    private List<Tarefa> tarefas;
}
