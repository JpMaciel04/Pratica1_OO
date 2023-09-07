package EmpregoFaculdade;

public class EmpregoDaFaculdade {
        private String nome;
        private double salario;
        private int horasAula;

    public EmpregoDaFaculdade(String nome, double salario, int horasAula) {
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
    }

    public double getGastos(){
        double bonus = horasAula*40;
        return salario + bonus;
    }

    public String getInfo(){
            double valorTotal = getGastos();
            return "Nome: " + this.nome + ", Valor Total: R$" + valorTotal;
    }


}
