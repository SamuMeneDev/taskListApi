package samumene.taskList.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import samumene.taskList.enumerated.Status;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter @Setter
@Entity
public class StatusTarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDateTime dataModificacao;

    @OneToOne
    private Tarefa tarefas;

}