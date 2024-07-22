public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros
        Livro livro1 = new Livro("O Hobbit", "J.R.R. Tolkien", "123456");
        Livro livro2 = new Livro("1984", "George Orwell", "7891011");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Adicionando clientes
        Clientes cliente1 = new Clientes("João", "11122233344", "C001");
        Clientes cliente2 = new Clientes("Maria", "55566677788", "C002");
        biblioteca.adicionarCliente(cliente1);
        biblioteca.adicionarCliente(cliente2);

        // Emprestando um livro
        biblioteca.emprestarLivro("123456", "C001");
        biblioteca.emprestarLivro("123456", "C002"); // Este empréstimo deve falhar

        // Imprimindo o estado dos livros
        System.out.println(livro1);
        System.out.println(livro2);
    }
}
