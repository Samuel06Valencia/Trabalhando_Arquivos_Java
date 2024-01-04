package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Projeto Leitura de arquivo .csv
        String path = "D:\\temp\\in.txt";

        List<Product> list = new ArrayList<Product>(); //Lista para receber produtos.

        try(BufferedReader br = new BufferedReader(new FileReader(path))) { //Estrutura try-with-resources, fazendo com que os recursos sejam desalocados de forma automatizada. 

            String line = br.readLine(); //Variável para ler a primeira linha
            line = br.readLine();
            while(line != null) { //Enquanto a linha for diferente de nulo...

                String[] vect = line.split(","); //vai recortar o string em partes,onde ele achar a vírgula(",").
                String name = vect[0]; //posição 0 na linha String possui o nome do arquivo.
                Double price = Double.parseDouble(vect[1]); //posição 1 na linha String possui o price do produto.
                Integer qte = Integer.parseInt(vect[2]); //posição 2 na linha String possui a quantity do produto.

                Product prod = new Product(name, price, qte); //instanciação da classe produto.
                list.add(prod); //adiciona a instanciação do objeto a lista "list" declarada a cima.

                line = br.readLine(); //Leia a próxima linha...

            }
            System.out.println("PRODUCTS:");
            for (Product p : list) { //percorre a list de produtos
                System.out.println(p); //imprime as listas
            }
        }
        catch(IOException e) {
            System.out.println("Error: "+e.getMessage()); //tratamento exceção
        }
    }
}