package br.com.senai.backend.sistema_mercado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.backend.sistema_mercado.models.Funcionario;


@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
    
}
