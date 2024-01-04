package application;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Segunda versão, leitura manual.

        String path = "D:\\temp\\in.txt"; //String com caminho do arquivo.
        FileReader fr = null; //Classe padrão para ler uma stream de dados.
        BufferedReader br = null; //Gerencia a memória usada para leitura,classe otimizada.

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            //Leitura linha a linha
            String line = br.readLine(); //Faz leitura do arquivo até a quebra de linha e devolve uma string com essa leitura.
            while(line != null) { //Enquanto essa linha for diferente de nulo.
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch(IOException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        finally {
            try {
                br.close();
                fr.close();
            }
            catch(IOException e) {
               e.printStackTrace();
            }
        }

    }
}