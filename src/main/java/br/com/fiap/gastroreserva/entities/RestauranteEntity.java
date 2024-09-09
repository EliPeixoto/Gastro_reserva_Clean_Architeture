package br.com.fiap.gastroreserva.entities;

import java.util.List;

public class RestauranteEntity {
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String tipoCulinaria;
    private String horarioFuncionamento;
    private String descricao;
    private List<String> fotos;

    public RestauranteEntity(Long id, String nome, String endereco, String telefone, String tipoCulinaria, String horarioFuncionamento, String descricao, List<String> fotos) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipoCulinaria = tipoCulinaria;
        this.horarioFuncionamento = horarioFuncionamento;
        this.descricao = descricao;
        this.fotos = fotos;
    }

    public RestauranteEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public boolean isInformacoesBasicasPreenchidas() {
        return nome != null && !nome.isEmpty() &&
                endereco != null && !endereco.isEmpty() &&
                telefone != null && !telefone.isEmpty() &&
                tipoCulinaria != null && !tipoCulinaria.isEmpty() &&
                horarioFuncionamento != null && !horarioFuncionamento.isEmpty();
    }

}