package samumene.taskList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import samumene.taskList.entity.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
