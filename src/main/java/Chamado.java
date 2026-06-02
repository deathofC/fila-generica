
public class Chamado {

    private int    numero;
    private String descricao;

    public Chamado(int numero, String descricao) {
        this.numero    = numero;
        this.descricao = descricao;
    }

    // ── Getters e Setters ──────────────────────────────────────────────────

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // ── toString ────────────────────────────────────────────────────────────

    @Override
    public String toString() {
        return "Chamado { numero=" + numero + ", descricao='" + descricao + "' }";
    }
}
