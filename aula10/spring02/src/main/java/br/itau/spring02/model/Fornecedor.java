package br.itau.spring02.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_fornecedor")
public class Fornecedor {

    @Id //indica que é a chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment 1, 2, 3...
    @Column(name = "cod")
    private long codigo;

    @Column(name = "nome", length = 200, nullable = false )
    private String nome;
    
    @Column(name = "telefone", length = 15)
    private String telefone;

    @OneToMany(mappedBy = "fornecedor")
    @JsonIgnoreProperties("fornecedor")
    private List<Produto> produtos;


    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelfone(String telefone) {
        this.telefone = telefone;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }


    
}
