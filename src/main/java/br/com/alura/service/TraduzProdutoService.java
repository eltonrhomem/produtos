package br.com.alura.service;

import br.com.alura.model.Produto;
import javax.swing.*;

public class TraduzProdutoService {
    public void traduzir(Produto produto) {
        String novoNome = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, produto.getName());
        String novoCategoria = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, produto.getCategory());
        String novoDescricao = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, produto.getDescription());

        produto.setName(novoNome);
        produto.setCategory(novoCategoria);
        produto.setDescription(novoDescricao);
    }
}
