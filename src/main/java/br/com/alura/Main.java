package br.com.alura;

import br.com.alura.model.Produto;
import br.com.alura.service.TraduzProdutoService;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CsvToBeanBuilder<Produto> csvProdutos=new CsvToBeanBuilder<Produto>(new FileReader("src/main/resources/products.csv"));
        List<Produto> produtos = csvProdutos.withType(Produto.class).build().parse();

        for(Produto produto: produtos) {
            System.out.println(produto);
        }

        TraduzProdutoService traducaoService = new TraduzProdutoService();

        for(Produto produto: produtos) {
            traducaoService.traduzir(produto);
            System.out.println(produto);
        }
        
    }
}