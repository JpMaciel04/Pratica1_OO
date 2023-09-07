/* import EmpregoFaculdade.EmpregoDaFaculdade;

class Main {
    public static void main(String[] args) {

        EmpregoDaFaculdade EmpregoDaFaculdade = new EmpregoDaFaculdade("Dr.Michelle", 3000, 40);


        System.out.println("Gastos totais: R$" + EmpregoDaFaculdade.getGastos());
        System.out.println(EmpregoDaFaculdade.getInfo());
    }
}/*
 import NotasAluno.Aluno;
class Main{
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "2021001", 70.0, 75.0, 80.0, "Engenharia", 2);

        // Exibir informações do aluno
        System.out.println("Informações do Aluno:");
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Matrícula: " + aluno1.matricula);
        System.out.println("Curso: " + aluno1.curso);
        System.out.println("Período: " + aluno1.periodo);
        System.out.println("Notas:");
        System.out.println("AV1: " + aluno1.notaAV1);
        System.out.println("AV2: " + aluno1.notaAV2);
        System.out.println("AE: " + aluno1.notaAE);

        // Alterar notas do aluno
        aluno1.alteraNotaAV1(65.0);
        aluno1.alteraNotaAV2(45.0);

        // Avaliar o aluno
        System.out.println("\nResultado da Avaliação:");
        aluno1.avaliarAluno();
    }
}

