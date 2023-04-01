public class Funcionarios {
    double salario;
    long registro;
    boolean estaAtivo;
    String nome;
    String departamento;
    String rg;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public long getRegistro() {
        return registro;
    }

    public void setRegistro(long registro) {
        this.registro = registro;
    }

    public boolean isEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void bonificar(){
        salario += salario;
    }

    @Override
    public String toString() {
        return "Funcionario.." +
                "Salario: " + salario +
                "Registro: " + registro +
                "Funcionario Ativo: " + estaAtivo +
                "Nome: '" + nome + '\'' +
                "Departamento: '" + departamento + '\'' +
                "RG: '" + rg;
    }

}
