public class Cola {
    private Lista lista;

    public Cola() {
        lista = new Lista();
    }

    public void enqueue(Producto p) {
        lista.insertarFinal(p);
        mostrar();
    }

    public Producto dequeue() {
        if (estaVacia()) return null;
        Producto p = lista.eliminarInicio();
        mostrar();
        return p;
    }

    public Producto peek() {
        if (estaVacia()) return null;
        return lista.verInicio();
    }

    public boolean estaVacia() {
        return lista.estaVacia();
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("[La fila está vacía]");
            return;
        }
        Nodo actual = lista.getCabeza();
        System.out.print("Cabeza -> ");
        while (actual != null) {
            System.out.print(actual.getDato());
            if (actual.getSiguiente() != null) System.out.print(" -> ");
            actual = actual.getSiguiente();
        }
        System.out.println(" <- Cola");
    }
}
