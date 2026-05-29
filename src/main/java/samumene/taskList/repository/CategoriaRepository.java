package samumene.taskList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import samumene.taskList.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
