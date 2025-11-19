package br.com.senai.backend.sistema_mercado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.backend.sistema_mercado.models.Mercadoria;
import br.com.senai.backend.sistema_mercado.repositories.MercadoriaRepository;

@Service
public class MercadoriaService {
    
    @Autowired
    private MercadoriaRepository mercadoriaRepository;

    public Mercadoria cadastrar(Mercadoria mercadoria) {
        return mercadoriaRepository.save(mercadoria);
    }

    public Mercadoria recuperarPorId(Integer id) {
        return mercadoriaRepository.findById(id).get();
    }

    public List<Mercadoria> listarTodos() {
        return mercadoriaRepository.findAll();
    }

    public Mercadoria atualizar(Integer id, Mercadoria mercadoria) { //informando os dados para att
        Mercadoria merc = mercadoriaRepository.findById(id).get(); //indo no banco de dados procurar ids
        if(merc != null) { //identificou que esse objeto existe
        mercadoria.setId(merc.getId()); //setar o id com um id existente
        return mercadoriaRepository.save(mercadoria); //retorna 
        }
        return null; //se tiver algum id retornara nulo
    }

    public boolean removerPorId(Integer id) {
        Mercadoria merc = mercadoriaRepository.findById(id).get();
        if(merc != null) {
            mercadoriaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
