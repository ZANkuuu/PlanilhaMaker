package Application;

import Entities.Produto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        String caminhoArquivo = "/home/zankuuu/Documentos/dor.txt";

        List<Produto> lista = new ArrayList<>();

        try(BufferedReader leitorBuffer = new BufferedReader(new FileReader(caminhoArquivo))){
            String linha = leitorBuffer.readLine();
            linha = leitorBuffer.readLine();
            while(linha != null){

                String[] vetor = linha.split(",");
                String name = vetor[0];
                Double price = Double.parseDouble(vetor[1]);
                Integer quantity = Integer.parseInt(vetor[2]);

                Produto product = new Produto(name, price, quantity);
                lista.add(product);

                linha = leitorBuffer.readLine();
            }

            for(Produto produto : lista){
                System.out.println(produto.toString());
            }
        }
        catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}