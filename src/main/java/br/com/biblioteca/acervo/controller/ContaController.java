package br.com.biblioteca.acervo.controller;

import br.com.biblioteca.acervo.delegation.ConversaoDolar;
import br.com.biblioteca.acervo.delegation.ConversaoEuro;
import br.com.biblioteca.acervo.delegation.ConversaoLibra;
import br.com.biblioteca.acervo.entity.Conta;
import br.com.biblioteca.acervo.interfaces.Conversao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ContaController {

    @ResponseBody
    @RequestMapping("/conta/balanco")
    public void balanco(){
        Conta conta = new Conta();
        conta.setId(1);
        conta.setValor(100.0);

        System.out.println("Saldo (R$):" +conta.getValor());
        System.out.println("Conversao em Dolar:" + conta.getBalanco(new ConversaoDolar()));
        System.out.println("Conversao em Euro:" + conta.getBalanco(new ConversaoEuro()));
        System.out.println("Conversao em Libra:" + conta.getBalanco(new ConversaoLibra()));


    }
}
