package com.dy.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dy.produtos.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
