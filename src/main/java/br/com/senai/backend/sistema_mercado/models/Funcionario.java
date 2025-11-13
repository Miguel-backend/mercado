package br.com.senai.backend.sistema_mercado.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="funcionario")
public class Funcionario {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    @Column(name="nome")
    private String nome;

    @Column(name="cpf")
    private String cpf;

    @Column(name="cargo")
    private String cargo;

    @Column(name="data_nascimento")
    private LocalDate dataNascimento;

    @ManyToMany
    @JoinTable(
        name="funcionario_mercadoria",
        joinColumns=@JoinColumn(name="id+funcionario", referencedColumnName= "id"),
        inverseJoinColumns=@JoinColumn(name="id_mercadoria", referencedColumnName="id")
    )
    private List<Mercadoria> mercadoria;

    public Funcionario() {
    }

    public Funcionario(Integer id, String nome, String cpf, String cargo, LocalDate dataNascimento,
            List<Mercadoria> mercadoria) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.dataNascimento = dataNascimento;
        this.mercadoria = mercadoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Mercadoria> getMercadoria() {
        return mercadoria;
    }

    public void setMercadoria(List<Mercadoria> mercadoria) {
        this.mercadoria = mercadoria;
    }

    
}
