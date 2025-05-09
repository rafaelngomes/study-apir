package com.github.rafaelngomes.study_apir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.rafaelngomes.study_apir.model.Produto;

@Repository
public interface ProdutoRepository 
        extends JpaRepository<Produto, Long> {
}