//Cassiano Miguel Almeida Santana - 10/04/2025

import java.util.Scanner;

public class CassianoMiguel_Atividade3 {

    static class Aluno {
        String matricula, grupo, subTurma, senha, nome;

        public Aluno(String matriculaNova, String grupoNovo, String subTurmaNova, String senhaNova, String nomeNovo) {
            matricula = matriculaNova;
            grupo = grupoNovo;
            subTurma = subTurmaNova;
            senha = senhaNova;
            nome = nomeNovo;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Aluno[] alunos = new Aluno[3];

        for (int i = 0; i < 3; i++) {

            System.out.printf("\nInforme os dados do aluno %d: \n", i + 1);

            System.out.print("Numero da Matricula: ");
            String matricula = scanner.nextLine();

            System.out.print("Nome do aluno: ");
            String nome = scanner.nextLine();

            System.out.print("Grupo do aluno: ");
            String grupo = scanner.nextLine();

            System.out.print("Numero da sub turma: ");
            String subTurma = scanner.nextLine();

            System.out.print("Numero da senha: ");
            String senha = scanner.nextLine();

            alunos[i] = new Aluno(matricula, grupo, subTurma, senha, nome);
        }

        System.out.println("\n\n=== Dados dos Alunos ===");

        for (int i = 0; i < 3; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");
            System.out.println("Matricula: " + alunos[i].matricula);
            System.out.println("Nome: " + alunos[i].nome);
            System.out.println("Grupo: " + alunos[i].grupo);
            System.out.println("Sub Turma: " + alunos[i].subTurma);
            System.out.println("Senha: " + "*".repeat(alunos[i].senha.length()));
        }

        scanner.close();
    }
}