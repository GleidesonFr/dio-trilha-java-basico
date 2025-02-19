import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = digitarParametro(terminal);

        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = digitarParametro(terminal);             

		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro".toUpperCase());
		}
		
	}

    static int digitarParametro(Scanner terminal){
        while (true) {
            try {
                return terminal.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Digite um número para interação (especificamente inteiros!): ".toUpperCase());
                terminal.nextLine();
            }
        }
    }

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }else{
            int contagem = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem
            for (int i = 0; i <= contagem; i++) {
                System.out.println("Imprimindo número " + i);
            }        
        }

	}
}