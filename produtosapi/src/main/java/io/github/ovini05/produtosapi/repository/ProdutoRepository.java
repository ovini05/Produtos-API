package io.github.ovini05.produtosapi.repository;

import io.github.ovini05.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,String> {
}
