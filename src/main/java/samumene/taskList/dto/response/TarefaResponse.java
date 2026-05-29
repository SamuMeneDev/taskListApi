package samumene.taskList.dto.response;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record TarefaResponse(
        Long id,
        String titulo,
        String descricao,
        LocalDateTime dataCriacao,
        LocalDateTime dataInicio,
        LocalDateTime dataTermino,
        CategoriaResponse categoria,
        StatusTarefaResponse statusTarefaResponse
) {
}
