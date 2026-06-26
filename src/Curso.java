import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private Coordenador coordenador; 
    private List<Professor> professores;
    public Curso(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public String getNome() { 
        return nome; 
    }
    
    public void setNome(String nome) { 
        this.nome = nome; 
    }
    
    public Coordenador getCoordenador() { 
        return coordenador; 
    }
    
    public void setCoordenador(Coordenador coordenador) { 
        this.coordenador = coordenador; 
    }
    
    public List<Professor> getProfessores() { 
        return professores; 
    }

    public void adicionarProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public double calcularCustoTotalCurso() {
        double total = 0;
        if (coordenador != null) {
            total += coordenador.calcularCustoMensal();
        }
        for (Professor prof : professores) {
            total += prof.calcularCustoMensal();
        }
        return total;
    }

    public void exibirRelatorio() {
        System.out.println("Curso: " + this.nome);
        System.out.println("Coordenador");
        if (coordenador != null) {
            System.out.println(coordenador.getNome());
            System.out.printf("Salário: R$ %,.2f%n", coordenador.getSalario());
            System.out.printf("Gratificação: R$ %,.2f%n", coordenador.getGratificacao());
            System.out.printf("Custo mensal: R$ %,.2f%n", coordenador.calcularCustoMensal());
        }
        
        System.out.println("\nProfessores");
        for (Professor prof : professores) {
            System.out.println(prof.getNome());
            System.out.printf("Salário: R$ %,.2f%n", prof.getSalario());
            System.out.printf("Custo mensal: R$ %,.2f%n%n", prof.calcularCustoMensal());
        }
        
        System.out.println("Custo total mensal do curso:");
        System.out.printf("R$ %,.2f%n", calcularCustoTotalCurso());
    }
}