import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banana banana = new Banana("Caturra", 2.5, "Prata");
        Melancia melancia = new Melancia("Melancia", 10.0, 5.0, true);
        Programador programador = new Programador("João", 23, "Java");
        Aluno aluno = new Aluno("Ana", 21, 8.5);

        System.out.println("Digite 1 para criar um programador, ou 2 para criar um aluno: ");
        int opcao = scanner.nextInt();

        Pessoa p;
        if (opcao == 1){
            System.out.println("\nDigite o nome do programador: ");
            String nome = scanner.next();
            System.out.println("Digite a idade do programador: ");
            int idade = scanner.nextInt();
            System.out.println("Digite a linguagem de programação preferida: ");
            String linguagem = scanner.next();

            p = new Programador(nome, idade, linguagem);
            System.out.println("\nLinguagem Preferida: "+((Programador)p).getLinguagemDeProgramacaoFavorita());
        }else if (opcao == 2){
            System.out.println("\nDigite o nome do aluno: ");
            String nome = scanner.next();
            System.out.println("Digite a idade do aluno: ");
            int idade = scanner.nextInt();
            System.out.println("Digite a nota do aluno: ");
            double nota = scanner.nextDouble();

            p = new Aluno(nome, idade, nota);
            System.out.println("\nNota do aluno: "+((Aluno)p).getNota());
        }else{
            System.out.println("\nOpção Inválida");
            return;
        }

        System.out.println("\nNome da fruta: "+banana.getNome());
        System.out.println("Tipo da fruta: "+banana.getTipo());
        System.out.println("Preço da fruta: "+banana.getPreco());

        System.out.println("\nNome da fruta: "+melancia.getNome());
        System.out.println("Preço da fruta: "+melancia.getPreco());
        System.out.println("É época da fruta? "+melancia.isEpoca());
        System.out.println("Preço adicional: "+melancia.getPrecoAdicional());
        System.out.println("Preço final: "+melancia.calculaPrecoFinal());

        System.out.println("\nNome do programador: "+programador.getNome());
        System.out.println("Idade do programador: "+programador.getIdade());
        System.out.println("Linguagem Preferida: "+programador.getLinguagemDeProgramacaoFavorita());

        System.out.println("\nNome do Aluno: "+aluno.getNome());
        System.out.println("Idade do aluno: "+aluno.getIdade());
        System.out.println("Nota do aluno: "+aluno.getNota());
    }
}
