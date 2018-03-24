package utn111.ejemplo.junit;

public class Lista<T> {

  private Nodo<T> primero = null;

  public Lista() {
    // nada por aqui
  }

  public Lista(final T[] elementos) {
    for (T e : elementos) {
      agregar(e);
    }
  }

  public int tamanio() {
    if (primero == null) {
      return 0;
    }
    return primero.tamanio();
  }

  private void agregar(T e) {

    final Nodo<T> nodo = new Nodo<T>(e);

    if (primero == null) {
      primero = nodo;
    }
    else {
      primero.agregar(nodo);
    }
  }

  public T obtener(int i) {
    if (primero == null) {
      throw new IndexOutOfBoundsException();
    }
    return primero.obtener(i);
  }

  static class Nodo<T> {
    final T valor;
    private Nodo<T> siguiente;

    private Nodo(T valor, Nodo<T> siguiente) {
      this.valor = valor;
      this.siguiente = siguiente;
    }

    private Nodo(T valor) {
      this(valor, null);
    }

    private int tamanio () {
      if (siguiente == null) {
        return 1;
      } else {
        return 1 + siguiente.tamanio();
      }
    }

    private void agregar(Nodo<T> ultimo) {
      if (siguiente == null) {
        siguiente = ultimo;
      }
      else {
        siguiente.agregar(ultimo);
      }
    }

    private T obtener(int i) {
      if (i == 0) {
        return valor;
      } else {
        return siguiente.obtener(i - 1);
      }
    }
  }
}
