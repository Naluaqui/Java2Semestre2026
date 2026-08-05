public class Aluno extends Pessoa{

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }



    public Aluno(String matricula, String nome, String documento, String email) {
        this.matricula = matricula;
        this.nome = nome;
        this.documento = documento;
        this.email = email;
    }

    @Override
    public void teste() {
        System.out.println("TESTE");
    }

    @Override
    public void imprimirDados() {
        System.out.println(" Aluno do nome: " + this.nome + " do documento " + " e email " + this.email + " e da matricula: " + this.matricula);
    }


}
