public class Ebook extends Livro {
    String nome, autor, arquivo;

    Ebook(String nome, String autor, String arquivo) {
        super(nome, autor);
        this.arquivo = arquivo;
    }


}
