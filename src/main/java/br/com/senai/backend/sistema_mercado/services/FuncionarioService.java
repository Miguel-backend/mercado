package br.com.senai.backend.sistema_mercado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.backend.sistema_mercado.models.Funcionario;

import br.com.senai.backend.sistema_mercado.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
    
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario cadastrar(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario recuperarPorId(Integer id) {
        return funcionarioRepository.findById(id).get();
    }

    public List<Funcionario> listarTodos() {
        return funcionarioRepository.findAll();
    }

    public Funcionario atualizar(Integer id, Funcionario funcionario) { //informando os dados para att
        Funcionario merc = funcionarioRepository.findById(id).get(); //indo no banco de dados procurar ids
        if(merc != null) { //identificou que esse objeto existe
        funcionario.setId(merc.getId()); //setar o id com um id existente
        return funcionarioRepository.save(funcionario); //retorna 
        }
        return null; //se tiver algum id retornara nulo
    }

    public boolean removerPorId(Integer id) {
        Funcionario merc = funcionarioRepository.findById(id).get();
        if(merc != null) {
            funcionarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
