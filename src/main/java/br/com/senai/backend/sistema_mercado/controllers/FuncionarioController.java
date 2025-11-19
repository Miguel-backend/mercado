package br.com.senai.backend.sistema_mercado.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.backend.sistema_mercado.models.Funcionario;

import br.com.senai.backend.sistema_mercado.services.FuncionarioService;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping("/cadastrar")
    public Funcionario cadastrar(@RequestBody Funcionario funcionario) {
        return funcionarioService.cadastrar(funcionario); 
    }

    @GetMapping("/recuperar-por-id/{id}")
    public Funcionario recuperarPorID(@PathVariable Integer id) {
        return funcionarioService.recuperarPorId(id); 
    }

    @GetMapping("/listar-todos")
    public List<Funcionario> listarTodos() {
        return funcionarioService.listarTodos();
    }

    @PutMapping("/atualizar/{id}")
    public Funcionario atualizar(@PathVariable Integer id, @RequestBody Funcionario funcionario) {
        return funcionarioService.atualizar(id, funcionario);
    }

    @DeleteMapping("/deletar/{id}")
    public String removerPorId(@PathVariable Integer id) {
        if(funcionarioService.removerPorId(id) == true) {
            return "Funcionario removido com sucesso!";
        }
        return "Falha ao remover o funcionario.";
    }
}
