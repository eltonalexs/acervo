package br.com.biblioteca.acervo.controller;

import br.com.biblioteca.acervo.entity.Categoria;
import br.com.biblioteca.acervo.entity.Livro;
import br.com.biblioteca.acervo.entity.Modelo;
import br.com.biblioteca.acervo.repository.LivroRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
@Controller
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @ResponseBody
    @RequestMapping("/livrosTeste")
    public List<Livro> listaTeste(){
        Livro livro_adm = new Livro(121L,123455L, "Administração", "2", "Eduardo Souza", Categoria.ADMINISTRACAO, Modelo.FISICO);
        Livro livro_med = new Livro(122L,223454L, "Medicina", "1", "Aline Silva", Categoria.MEDICINA, Modelo.EBOOK);
        Livro livro_inf = new Livro(123L,323453L, "Informática", "3", "Maria Santos", Categoria.INFORMATICA, Modelo.FISICO);
        Livro livro_mat = new Livro(124L,423452L, "Matemática", "5", "José Madereira", Categoria.MATEMATICA, Modelo.EBOOK);
        Livro livro_eco = new Livro(125L,523451L, "Economia", "4", "Alex Gomes", Categoria.ECONOMIA, Modelo.EBOOK);

        return Arrays.asList(livro_adm, livro_med, livro_inf,livro_mat,livro_eco);
    }

    @ResponseBody
    @RequestMapping("/livros")
    public List<Livro> listar() {
        return livroRepository.findAll();
    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/livros", method = RequestMethod.POST)
    public void salvar(@RequestBody Livro livro) {

        livroRepository.save(livro);
    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/livros", method = RequestMethod.PUT)
    public void atualizar(@RequestBody Livro livro) {
        livroRepository.save(livro);
    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/livros/{id}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable Long id){

        livroRepository.deleteById(id);

    }
}
