public class Livro {
    String nome, autor;
    boolean reservado, emprestado;


    Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
        this.reservado = false;
        this.emprestado = false;
    }

    void reservar() {
        if (!reservado) {
            reservado = true;
            System.out.println(nome + " , " + autor + " , " + " Foi reservado com sucesso.");
        } else {
            System.out.println(nome + " , " + autor +  " , " + " Ja foi reservado. ");
        }
        }



    void emprestar() {
        if (reservado && !emprestado) {
            emprestado = true;
            System.out.println(nome+ " , " + autor + " , " + " Livro emprestado.");
        } else if (!reservado) {
            System.out.println("O livro precisa ser reservado antes de poder emprestar.");
        } else {
            System.out.println(nome + " , " + autor +  " , " + " Ja foi emprestado.");
        }
    }

   void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println(nome + " , " + autor +  " , " + " Foi devolvido.");
        } else {
            System.out.println(nome + " , " + autor +  " , " + " Não pode ser devolvido pois você não pegou ele emprestado ");
        }
    }

    void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println("A reserva de " + nome + " , " + autor + " , " + "Foi cancelado.");
        } else {
            System.out.println("Não é possível cancelar a reserva de " + nome + " , " + autor + " , " +  " Porque não foi reservado.");
        }
    }
    }




