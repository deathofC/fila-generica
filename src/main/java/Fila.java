import java.util.ArrayList;
public class Fila<T> {

    private ArrayList<T> itens = new ArrayList<>();

    public void adicionar(T item) {
        itens.add(item);
    }

    public T proximo() {
        if (itens.isEmpty()) {
            return null;
        }
        return itens.remove(0);
    }

    public T primeiro() {
        if (itens.isEmpty()) {
            return null;
        }
        return itens.get(0);
    }


    public boolean vazia() {
        return itens.isEmpty();
    }

    public int quantidade() {
        return itens.size();
    }

    public void listar() {
        if (itens.isEmpty()) {
            System.out.println("  (fila vazia)");
            return;
        }
        for (T item : itens) {
            System.out.println("  " + item);
        }
    }
}
