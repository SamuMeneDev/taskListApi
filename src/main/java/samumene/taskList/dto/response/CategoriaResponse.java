package samumene.taskList.dto.response;

import lombok.Builder;

@Builder
public record CategoriaResponse(
        Long id,
        String nomeCategoria,
        String descricao
) {
}
