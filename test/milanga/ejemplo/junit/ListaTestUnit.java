package milanga.ejemplo.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListaTestUnit {

  @Test
  public void testCrearListaVacia() throws Exception {
    // Una lista sin argumentos ..
    final Lista<String> lista = new Lista<String>();
    // .. deberia estar vacia
    assertEquals(0, lista.tamaño());
  }

  @Test
  public void testCrearListaConElementos() throws Exception {
    // Una lista con 3 argumentos ..
    String[] elementos = new String[] { "A", "B", "C" };
    final Lista<String> lista = new Lista<String>(elementos);
    // .. deberia tener tamaño 3 
    assertEquals(3, lista.tamaño());
  }

  @Test
  public void testObtenerElemento() throws Exception {
    // Una lista con 3 argumentos .. 
    String[] elementos = new String[] { "A", "B", "C" };
    final Lista<String> lista = new Lista<String>(elementos);

    // deberia contenerlos en el mismo orden
    assertEquals("A", lista.obtener(0));
    assertEquals("B", lista.obtener(1));
    assertEquals("C", lista.obtener(2));
  }

}
