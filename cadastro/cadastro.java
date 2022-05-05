package cadastro;
import java.util.Scanner;

public class cadastro {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            cadastrocriar cadastro = new cadastrocriar();

            System.out.println("Digite seu primeiro nome");
            cadastro.nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            cadastro.sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            cadastro.idade = scanner.nextInt();

            System.out.println("Digite seu sexo");
            cadastro.sexo = scanner.next();

            System.out.println("Nome completo: " + cadastro.nome + " " + cadastro.sobrenome);
            System.out.println("Idade: " + cadastro.idade);
            System.out.println("Sexo: " + cadastro.sexo);

        }

    }
}
