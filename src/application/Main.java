package application;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Segunda versão, leitura manual.

        String path = "D:\\temp\\in.txt"; //String com caminho do arquivo.

        try(BufferedReader br = new BufferedReader(new FileReader(path))) { //(try with resources,permite instanciar recursos na linha do try, fazendo com que esses recursos sejam desalocados de forma automatizada quando o escopo do try acabar.

            String line = br.readLine();
            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }

            br.close();
        }
        catch(IOException e) {
            System.out.println("Error: "+e.getMessage());
        }

    }
}