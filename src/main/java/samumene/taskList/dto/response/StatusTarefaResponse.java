package samumene.taskList.dto.response;

import lombok.Builder;
import samumene.taskList.enumerated.Status;

import java.time.LocalDateTime;

@Builder
public record StatusTarefaResponse(
        Long id,
        Status status,
        LocalDateTime dataModificacao
) {
}
