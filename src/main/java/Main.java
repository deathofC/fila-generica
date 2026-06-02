
public class Main {

    private static void titulo(String texto) {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.printf ("║  %-41s║%n", texto);
        System.out.println("╚══════════════════════════════════════════╝");
    }

    private static void separador(String etapa) {
        System.out.println("\n▶ " + etapa);
        System.out.println("  " + "─".repeat(38));
    }

    // ── main ─────────────────────────────────────────────────────────────

    public static void main(String[] args) {

        titulo("FILA<CLIENTE>");

        Fila<Cliente> filaClientes = new Fila<>();

        separador("Adicionando clientes à fila");
        filaClientes.adicionar(new Cliente("Ana Paula",  "123.456.789-00"));
        filaClientes.adicionar(new Cliente("Bruno Lima", "987.654.321-00"));
        filaClientes.adicionar(new Cliente("Carla Dias", "456.789.123-00"));
        System.out.println("  3 clientes adicionados.");

        separador("Listando todos os elementos");
        filaClientes.listar();

        separador("Primeiro da fila (sem remover)");
        System.out.println("  " + filaClientes.primeiro());

        separador("Removendo o próximo (proximo())");
        Cliente removidoCliente = filaClientes.proximo();
        System.out.println("  Removido: " + removidoCliente);

        separador("Fila após remoção");
        filaClientes.listar();

        separador("Quantidade de elementos restantes");
        System.out.println("  Total: " + filaClientes.quantidade());

        titulo("FILA<CHAMADO>");

        Fila<Chamado> filaChamados = new Fila<>();

        separador("Adicionando chamados à fila");
        filaChamados.adicionar(new Chamado(101, "Computador não liga"));
        filaChamados.adicionar(new Chamado(102, "Erro ao acessar o sistema"));
        filaChamados.adicionar(new Chamado(103, "Impressora sem papel"));
        System.out.println("  3 chamados adicionados.");

        separador("Listando todos os elementos");
        filaChamados.listar();

        separador("Primeiro da fila (sem remover)");
        System.out.println("  " + filaChamados.primeiro());

        separador("Removendo o próximo (proximo())");
        Chamado removidoChamado = filaChamados.proximo();
        System.out.println("  Removido: " + removidoChamado);

        separador("Fila após remoção");
        filaChamados.listar();

        separador("Quantidade de elementos restantes");
        System.out.println("  Total: " + filaChamados.quantidade());

        titulo("FILA<PEDIDO>");

        Fila<Pedido> filaPedidos = new Fila<>();

        separador("Adicionando pedidos à fila");
        filaPedidos.adicionar(new Pedido(1001, 250.00));
        filaPedidos.adicionar(new Pedido(1002, 89.90));
        filaPedidos.adicionar(new Pedido(1003, 1540.50));
        System.out.println("  3 pedidos adicionados.");

        separador("Listando todos os elementos");
        filaPedidos.listar();

        separador("Primeiro da fila (sem remover)");
        System.out.println("  " + filaPedidos.primeiro());

        separador("Removendo o próximo (proximo())");
        Pedido removidoPedido = filaPedidos.proximo();
        System.out.println("  Removido: " + removidoPedido);

        separador("Fila após remoção");
        filaPedidos.listar();

        separador("Quantidade de elementos restantes");
        System.out.println("  Total: " + filaPedidos.quantidade());

        titulo("TESTE: FILA VAZIA");

        Fila<Cliente> filaVazia = new Fila<>();
        System.out.println("\n  vazia()    → " + filaVazia.vazia());
        System.out.println("  primeiro() → " + filaVazia.primeiro());
        System.out.println("  proximo()  → " + filaVazia.proximo());
        separador("listar() em fila vazia");
        filaVazia.listar();

        System.out.println("\n✔  Todos os testes concluídos com sucesso!\n");
    }
}
