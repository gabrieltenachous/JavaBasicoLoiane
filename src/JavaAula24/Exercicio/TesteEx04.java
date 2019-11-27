package JavaAula24.Exercicio;
import java.util.Date;
public class TesteEx04 {

    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca();
        livro.anoLancamento=2016;
        livro.autor="Loiane";
        livro.isbn="1dasa";
        livro.nome="Loli Groner";
        livro.qtdPagina=432;
        livro.preco=89.25;
        livro.dataEntrega = new Date();
        
    }

}
