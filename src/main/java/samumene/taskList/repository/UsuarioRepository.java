package samumene.taskList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import samumene.taskList.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
