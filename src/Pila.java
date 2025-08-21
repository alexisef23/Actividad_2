public class Pila {
    private Lista lista;

    public Pila() {
        lista = new Lista();
    }

    public void push(Producto p) {
        lista.insertarInicio(p);
        mostrar();
    }

    public Producto pop() {
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
            System.out.println("[La bolsa está vacía]");
            return;
        }
        Nodo actual = lista.getCabeza();
        System.out.print("Tope -> ");
        while (actual != null) {
            System.out.print(actual.getDato());
            if (actual.getSiguiente() != null) System.out.print(" -> ");
            actual = actual.getSiguiente();
        }
        System.out.println(" <- Fondo");
    }
}
