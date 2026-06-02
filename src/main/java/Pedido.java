
public class Pedido {

    private int    numero;
    private double valor;

    public Pedido(int numero, double valor) {
        this.numero = numero;
        this.valor  = valor;
    }

    // ── Getters e Setters ──────────────────────────────────────────────────

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // ── toString ────────────────────────────────────────────────────────────

    @Override
    public String toString() {
        return String.format("Pedido { numero=%d, valor=R$ %.2f }", numero, valor);
    }
}
