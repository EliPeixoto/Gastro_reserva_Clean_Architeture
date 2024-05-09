package br.com.fiap.gastroreserva.controller;

import br.com.fiap.gastroreserva.dto.UsuarioDTO;
import br.com.fiap.gastroreserva.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioDTO> save(@RequestBody UsuarioDTO usuarioDTO) {
        return ResponseEntity.status(201).body(usuarioService.salvarUsuario(usuarioDTO));
    }
}
