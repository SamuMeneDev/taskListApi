package samumene.taskList.dto.response;

import lombok.Builder;
import samumene.taskList.entity.Categoria;
import samumene.taskList.entity.Tarefa;

import java.util.List;

@Builder
public record UsuarioResponse(
        Long id,
        String nome,
        String email,
        List<Tarefa> tarefas,
        List<Categoria> categorias
) {
}
