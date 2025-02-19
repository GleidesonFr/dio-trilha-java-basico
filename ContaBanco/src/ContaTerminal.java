import java.util.Locale;
import java.util.Scanner;

/**
 * @author Gleideson Freitas
 * Projeto Conta Banco
 * @version 1.0
 */

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH); //Usado para aceitar ponto ao invés de vírgula
        System.out.print("Por favor, insira o número da agência: ");
        String agencia = sc.next();
        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine(); //Remover o buffer de dados gerado pelas entradas
        System.out.print("Digite o seu nome completo: ");
        String nome = sc.nextLine();
        System.out.print("Digite o seu saldo: ");
        Double saldo = sc.nextDouble();
        System.out.println();
        System.out.println("Olá " +nome+ " , obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +numero+ " e seu saldo " +saldo+ " já está disponível para saque");
        sc.close();
    }
}
