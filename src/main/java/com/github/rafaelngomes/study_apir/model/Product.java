package com.github.rafaelngomes.study_apir.model;

import java.math.BigDecimal;

public class Product {
    private Long id;
    private String nome;
    private BigDecimal valor;
    
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
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }    

}
