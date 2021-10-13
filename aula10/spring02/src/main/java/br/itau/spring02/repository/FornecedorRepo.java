package br.itau.spring02.repository;

import org.springframework.data.repository.CrudRepository;

import br.itau.spring02.model.Fornecedor;

public interface FornecedorRepo extends CrudRepository<Fornecedor, Long>{
    
}
