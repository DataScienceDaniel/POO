public class Eventos {
    String nome, data, local;
    int capacidade;
    Alunos alunos;


    // Metodo Construidor

    Eventos(String nome, String data, String local, int capacidade) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.capacidade = capacidade;

    }
    void Inscrever(Alunos alunos) {
        this.alunos = alunos;


    }

 }
