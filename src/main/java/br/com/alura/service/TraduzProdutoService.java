package br.com.alura.service;

import br.com.alura.model.Produto;

import javax.swing.*;


public class TraduzProdutoService {
    public void traduzir(Produto produto) {
        String nome = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, produto.getName());
    }
}
