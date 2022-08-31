
package projetogratuliano.anos;

import java.util.Scanner;

/**
 *
 * @author Joao Victor
 */
public class Anos {

    public static void main(String[] args) {
        int anoAtual, anoNascimento, qtdeAnos;
        System.out.println("Entre com o Ano Atual:");
        anoAtual = new Scanner(System.in).nextInt();
        System.out.println("Entre com o Ano de Nascimento");
        anoNascimento = new Scanner(System.in).nextInt();
        qtdeAnos = anoAtual - anoNascimento;
        System.out.println("Em "+anoAtual+" Voce faz (ou Já Fez)"+qtdeAnos+" anos!");
    }
}
