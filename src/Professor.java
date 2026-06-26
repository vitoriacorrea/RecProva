public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, String email, double salario) {
        super(nome, email); 
        this.salario = salario;
    }

    public double getSalario() { 
        return salario; 
    }
    
    public void setSalario(double salario) { 
        this.salario = salario; 
    }

    @Override
    public double calcularCustoMensal() {
        return this.salario; 
    }
}