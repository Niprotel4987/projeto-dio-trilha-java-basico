package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0); 
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA.");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    }
}
// O código acima é um exemplo de um processo seletivo simples, onde o salário base é comparado com o salário pretendido do candidato.
// Dependendo do resultado da comparação, o sistema decide se deve ligar para o candidato ou aguardar o resultado de outros candidatos.
// O código pode ser melhorado com a adição de mais critérios de seleção, como habilidades, experiência, etc.