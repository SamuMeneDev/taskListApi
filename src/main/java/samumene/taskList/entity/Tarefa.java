package samumene.taskList.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter @Setter
@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @ManyToOne
    private Usuario usuario;

    private String descricao;

    private LocalDateTime dataCriacao = LocalDateTime.now();

    private LocalDateTime dataInicio;

    private LocalDateTime dataTermino;

    @ManyToOne
    private Categoria categoria;

    @OneToOne
    private StatusTarefa statusTarefa;

}
