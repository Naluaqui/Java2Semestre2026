public class Professor extends Pessoa{

    private String inscricao;

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    public Professor(String inscricao, String nome, String documento, String email) {
        this.inscricao = inscricao;
        this.nome = nome;
        this.documento = documento;
        this.email = email;
    }

    @Override
    public void imprimirDados() {
        System.out.println(" Aluno do nome: " + this.nome + " do documento " + " e email " + this.email + " e da inscrição: " + this.inscricao);
    }
}
