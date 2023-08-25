public class App {
    public static void main(String[] args) throws Exception {
        Alunos aluno1;
        Eventos evento1;
        PaineldeControle paineldecontrole;

        aluno1 = new Alunos("Daniel", 18, "Ciência de Dados", "202208385222");
        System.out.println("Nome: "+ aluno1.nome + " , " + "Idade: "+ aluno1.idade + " , " +  "Curso: " + aluno1.curso + " , " + "Matricula: " + aluno1.matricula);

        evento1 = new Eventos("Bienal", "02/09/2023", "Riocentro", 1000 );
        evento1.Inscrever(aluno1);
        System.out.println(evento1.nome + " , " + evento1.data + " , " + evento1.local+ " , " + evento1.capacidade);
        System.out.println(evento1.alunos.nome);


        paineldecontrole = new PaineldeControle(3, 4, 2 );
        System.out.println(paineldecontrole.eventosFuturos + " , " + paineldecontrole.palestrantes + " , " + paineldecontrole.vagasDisponiveis);




    }
}
