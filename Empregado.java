public class Empregado {
    private String nome;
    private String cargo;
    private float salario;


    public Empregado(String nome, String cargo, float salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if (salario <= 0) {
            this.salario = 0.0f;
        }else{
            this.salario = salario;
        }
    }
}
