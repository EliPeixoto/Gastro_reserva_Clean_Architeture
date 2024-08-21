package br.com.fiap.gastroreserva.interfaces;

import br.com.fiap.gastroreserva.entities.Restaurante;

import java.util.List;
import java.util.Optional;

public interface RestauranteRepository {

    void salvar(Restaurante restaurante);
    boolean existsByNome(String nome);
    Optional<Restaurante>buscarPorId(Long id);
    List<Restaurante>buscarTodos();
}
