import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Aqui está pedindo o número da conta do banco.
        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        //Aqui está pedindo qual agência.
        System.out.println("Por favor, digite a sua agência: ");
        String agencia = scanner.next();
        scanner.nextLine();

        //Aqui está pedindo para digitar o nome completo.
        //Tive uma certa dificuldade, pois não conseguia colocar espaços em brancos no nome usando apenas o next(). Por isso pesquisei mais sobre o scanner e aprendi sobre o nextLine, que não ignora os espaços em brancos, pega todo o conteúdo da linha, mas tinha um erro, pois assim que eu digitava a agência, o nome completo era ignorado e pulado para o saldo. O nome ficava vazio e sem conteúdo.
        System.out.println("Por favor, digite o seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        //Aqui pede para falar qual o valor inicial ele deseja depositar.
        System.out.println("Por favor, qual o valor deseja depositar inicialmente: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");

        scanner.close();
    }
}
