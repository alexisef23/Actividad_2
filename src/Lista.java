public class Lista {
    private Nodo cabeza;

    public Lista() {
        cabeza = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertarInicio(Producto dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.setSiguiente(cabeza);
        cabeza = nuevo;
    }

    public void insertarFinal(Producto dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public Producto eliminarInicio() {
        if (estaVacia()) throw new RuntimeException("La lista está vacía");
        Producto valor = cabeza.getDato();
        cabeza = cabeza.getSiguiente();
        return valor;
    }

    public Producto verInicio() {
        if (estaVacia()) throw new RuntimeException("La lista está vacía");
        return cabeza.getDato();
    }

    public Nodo getCabeza() {
        return cabeza;
    }
}
