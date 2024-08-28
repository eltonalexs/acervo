package br.com.biblioteca.acervo.controller;

import br.com.biblioteca.acervo.dto.DetalhesPublicacaoDTO;
import br.com.biblioteca.acervo.dto.PublicacaoDTO;
import br.com.biblioteca.acervo.dto.PublicacaoFormDTO;
import br.com.biblioteca.acervo.entity.Publicacao;
import br.com.biblioteca.acervo.repository.PublicacaoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/publicacoes")
public class PublicacaoController {

    @Autowired
    private PublicacaoRepository publicacaoRepository;

    @GetMapping("/lista")
    public List<PublicacaoDTO> lista() {
        List<Publicacao> publicacoes = publicacaoRepository.findAll();
        return PublicacaoDTO.converter(publicacoes);
    }

    @Transactional
    @PostMapping("/novo")
    public PublicacaoDTO salvar(@RequestBody PublicacaoFormDTO formDto) {
        Publicacao publicacao = formDto.converter();
        publicacaoRepository.save(publicacao);
        return new PublicacaoDTO(publicacao);
    }

    @Transactional
    @PutMapping("/atualiza")
    public void atualizar(@RequestBody Publicacao Publicacao) {
        publicacaoRepository.save(Publicacao);
    }

    @Transactional
    @DeleteMapping("/exclui/{isbn}")
    public void deletar(@PathVariable Long id) {
        publicacaoRepository.deleteById(id);
    }

    @Transactional
    @PutMapping("/{isbn}")
    public DetalhesPublicacaoDTO atualizaPublicacao(@PathVariable Long isbn, @RequestBody PublicacaoFormDTO form) {

        final Optional<Publicacao> optPublicacao = publicacaoRepository.findByIsbn(isbn);

        if(optPublicacao.isPresent()){
            Publicacao publicacao = optPublicacao.get();
            form.atualiza(publicacao);
            publicacaoRepository.save(publicacao);
            return new DetalhesPublicacaoDTO(publicacao);
        }

        System.out.println("Publicacao não encontrado");
        return null;
    }

    @Transactional
    @DeleteMapping("/{isbn}")
    public void deletarPorIsbn(@PathVariable Long isbn) {
        final Optional<Publicacao> optPublicacao = publicacaoRepository.findByIsbn(isbn);

        if(optPublicacao.isPresent()){
            publicacaoRepository.deleteByIsbn(isbn);
        }

    }
    
}
