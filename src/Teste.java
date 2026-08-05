public class Teste {

    static void main(){
        Aluno aluno = new Aluno ("45454566", "Joao", "4646545", "emal@email.com");
        aluno.imprimirDados();

        Professor professor = new Professor("5646464", "José", "p55.5.5", "emailaqui");
        professor.imprimirDados();

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.somar(1, 4));
        System.out.println(calculadora.somar(5, 6, 9));

        aluno.teste();


    }
}
