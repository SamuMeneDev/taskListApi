package samumene.taskList.service;

import org.springframework.stereotype.Service;
import samumene.taskList.dto.response.TarefaResponse;
import samumene.taskList.dto.response.UsuarioResponse;
import samumene.taskList.entity.Usuario;
import samumene.taskList.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioResponse findById(Long id) {
        Usuario u = this.usuarioRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("Usuario não encontrado"));

        return UsuarioResponse.builder()
                .nome(u.getNome())
                .tarefas(u.getTarefas())
                .email(u.getEmail())
                .id(u.getId())
                .categorias(u.getCategorias())
                .build();
    }

}
