import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Clientes> clientes;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarCliente(Clientes cliente) {
        clientes.add(cliente);
    }

    public void emprestarLivro(String isbn, String codigoCliente) {
        Livro livro = procurarLivroPorIsbn(isbn);
        Clientes cliente = procurarClientePorCodigo(codigoCliente);

        if (livro != null && cliente != null && !livro.isEmprestado()) {
            livro.setEmprestado(true);
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Empréstimo não pode ser realizado.");
        }
    }

    private Livro procurarLivroPorIsbn(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    private Clientes procurarClientePorCodigo(String codigoCliente) {
        for (Clientes cliente : clientes) {
            if (cliente.getCodigoCliente().equals(codigoCliente)) {
                return cliente;
            }
        }
        return null;
    }
}
