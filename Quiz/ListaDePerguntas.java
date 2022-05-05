package Quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class ListaDePerguntas {
    List<Pergunta> todasAsPerguntas = new ArrayList<Pergunta>();
    int pontuacao = 0;
    int pontuacaoTotal;

    public void adicionarTodasAsPerguntas() {
        for (Pergunta pergunta : RepositorioDePerguntas.repositorio) {
            this.todasAsPerguntas.add(pergunta);
        }
        this.pontuacaoTotal = this.todasAsPerguntas.size();
    }

    public void fazerTodasAsPerguntas() {
        Scanner scanner = new Scanner(System.in);
        while (this.todasAsPerguntas.size() > 0) {
            Pergunta pergunta = this.sortearPergunta();

            pergunta.fazerPergunta();

            String resposta = pergunta.pegarResposta(scanner);
            if (pergunta.checarResposta(resposta)) {
                System.out.println("Parabéns você acertou!");
                this.pontuacao++;
                System.out.printf("Respostas corretas: %d %n", this.pontuacao);
            } else {
                System.out.println("Você errou!");
            }
            if (this.todasAsPerguntas.size() == 1) {
                double pontuacaoPercentual = this.pontuacao / this.pontuacaoTotal * 100;
                System.out.println("Você terminou o quiz!");
                System.out.printf("Você acertou %.2f%% %n", pontuacaoPercentual);
            }
            this.todasAsPerguntas.remove(pergunta);

        }
        scanner.close();
    }

    public Pergunta sortearPergunta() {
        int numAleatorio = (int) (Math.floor(Math.random() * this.todasAsPerguntas.size()));
        return this.todasAsPerguntas.get(numAleatorio);
    }
}