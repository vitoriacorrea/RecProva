public class Coordenador extends Pessoa {
    private double salario;
    private double gratificacao;

    public Coordenador(String nome, String email, double salario, double gratificacao) {
        super(nome, email); 
        this.salario = salario;
        this.gratificacao = gratificacao;
    }

    public double getSalario() { 
        return salario; 
    }
    
    public void setSalario(double salario) { 
        this.salario = salario; 
    }
    
    public double getGratificacao() { 
        return gratificacao; 
    }
    
    public void setGratificacao(double gratificacao) { 
        this.gratificacao = gratificacao; 
    }

    @Override
    public double calcularCustoMensal() {
        return this.salario + this.gratificacao; 
    }
}