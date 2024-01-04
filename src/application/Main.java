package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        File file = new File("D:\\temp\\in.txt");
        Scanner sc = null; //Criado antes do bloco try, para poder ser instanciado no bloco "finally".
        try {
            sc = new Scanner(file); //Scanner tbm funciona para ler arquivos
            //Lógica para ler arquivo linha a linha.
            while(sc.hasNextLine()) { //retorna verdadeiro se não chegou no fim do arquivo,enquanto não chegar no fim do arquivo,continue lendo.
                String line = sc.nextLine(); //Lê a linha, e posciona o curso para a próxima.
                System.out.println(line); //imprime a linha.

                //ou se quiser economizar: System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {  //Executa,mesmo ocorrendo exceções.
            //Fechamento de recursos,sempre declare no bloco "finally"
            if (sc != null) {
                sc.close(); //Tem que fechar o recurso, senão irá provocar um vazamento de memória na aplicação.
            }
        }

    }
}