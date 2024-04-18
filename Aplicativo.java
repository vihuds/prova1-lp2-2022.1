public class Aplicativo {
    public static void main(String[] args) {
        Empregado professor = new Empregado("Tiago", "Professor", -1000.00F);
        professor.setSalario(5000.00F);
        professor.setSalario(professor.getSalario()+professor.getSalario()*0.1F);
        System.out.println("Empregado: "+professor.getNome()+", Salario: "+professor.getSalario());
    }
}