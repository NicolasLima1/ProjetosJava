package Quiz;

import java.util.Scanner;

public class Pergunta {
    String pergunta, respostas, respostaCorreta;

    Pergunta(String pergunta, String respostas, String respostaCorreta) {
        this.pergunta = pergunta;
        this.respostas = respostas;
        this.respostaCorreta = respostaCorreta;
    }

    public void fazerPergunta() {
        System.out.printf(this.pergunta);
        System.out.printf(this.respostas);
    }

    public String pegarResposta(Scanner scanner) {
        System.out.print("Resposta: ");
        String resposta = scanner.nextLine();
        return resposta;
    }

    public boolean checarResposta(String resposta) {
        return this.respostaCorreta.equals(resposta);
    }

}