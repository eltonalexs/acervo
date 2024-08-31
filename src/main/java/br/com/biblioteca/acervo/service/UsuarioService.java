package br.com.biblioteca.acervo.service;

import br.com.biblioteca.acervo.entity.Endereco;
import br.com.biblioteca.acervo.entity.Usuario;
import br.com.biblioteca.acervo.repository.EnderecoRepository;
import br.com.biblioteca.acervo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Endereco salvarEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public Usuario encontrarUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Endereco encontrarEnderecoPorId(Long id) {
        return enderecoRepository.findById(id).orElse(null);
    }
}
