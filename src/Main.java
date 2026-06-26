public class Main {
    public static void main(String[] args) {
        
        Coordenador coord = new Coordenador("Vitoria Correa", "vitoria.correa@ifsc.edu.br", 9000.00, 2000.00);

        
        Professor prof1 = new Professor("Ana", "ana@ifsc.edu.br", 4500.00);
        Professor prof2 = new Professor("Dudu", "dudu@ifsc.edu.br", 5000.00);
        Professor prof3 = new Professor("Davi", "davi@ifsc.edu.br", 4800.00);

        
        Curso curso = new Curso("Técnico em Informática");

        
        curso.setCoordenador(coord);
        curso.adicionarProfessor(prof1);
        curso.adicionarProfessor(prof2);
        curso.adicionarProfessor(prof3);

        
        curso.exibirRelatorio();
    }
}