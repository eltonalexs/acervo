package br.com.biblioteca.acervo.delegation;

import br.com.biblioteca.acervo.interfaces.Conversao;

public class ConversaoLibra implements Conversao {

    @Override
    public Double converter(Double valor) {
        return valor / 7.23; //27-08-2024
    }
}
