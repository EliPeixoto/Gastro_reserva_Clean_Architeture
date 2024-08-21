package br.com.fiap.gastroreserva.controllers;

import java.util.List;

public class NovoRestauranteDTO {
    private String nome;
    private String endereco;
    private String telefone;
    private String tipoCulinaria;
    private String horarioFuncionamento;
    private String descricao;
    private List<String> fotos;

    // Construtores
    public NovoRestauranteDTO() {}

    public NovoRestauranteDTO(String nome, String endereco, String telefone,
                              String tipoCulinaria, String horarioFuncionamento,
                              String descricao, List<String> fotos) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipoCulinaria = tipoCulinaria;
        this.horarioFuncionamento = horarioFuncionamento;
        this.descricao = descricao;
        this.fotos = fotos;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipoCulinaria() {
        return tipoCulinaria;
    }

    public void setTipoCulinaria(String tipoCulinaria) {
        this.tipoCulinaria = tipoCulinaria;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getFotos() {
        return fotos;
    }

    public void setFotos(List<String> fotos) {
        this.fotos = fotos;
    }

    @Override
    public String toString() {
        return "NovoRestauranteDTO{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", tipoCulinaria='" + tipoCulinaria + '\'' +
                ", horarioFuncionamento='" + horarioFuncionamento + '\'' +
                ", descricao='" + descricao + '\'' +
                ", fotos=" + fotos +
                '}';
    }
}
