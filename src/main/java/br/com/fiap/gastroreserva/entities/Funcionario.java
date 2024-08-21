package br.com.fiap.gastroreserva.entities;

import java.util.List;

public class Funcionario {
    private Long id;
    private String nome;
    private String cargo;
    private List<String> permissoes;

    public Funcionario(Long id, String nome, String cargo, List<String> permissoes) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.permissoes = permissoes;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public List<String> getPermissoes() {
        return permissoes;
    }

    public boolean temPermissao(String permissao) {
        return permissoes != null && permissoes.contains(permissao);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", permissoes=" + permissoes +
                '}';
    }
}
