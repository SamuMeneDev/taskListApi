package samumene.taskList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import samumene.taskList.entity.StatusTarefa;

public interface StatusTarefaRepository extends JpaRepository<StatusTarefa, Long> {
}
