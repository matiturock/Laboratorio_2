package inicio.udemy.apicolecciones.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestApiColecciones {
  public static void main(String[] args) {
    List<String> miLista = new ArrayList<>();
    miLista.add("LUN");
    miLista.add("MAR");
    miLista.add("MIE");
    miLista.add("JUE");
    miLista.add("VIE");
    miLista.add("SAB");
    miLista.add("DOM");
    mostrar(miLista);

    // for (Object elemento : miLista) {
    // System.out.println(elemento);
    // }

    // miLista.forEach(e -> System.err.println(e));

    Set<String> miSet = new HashSet<>();

    miLista.forEach(e -> miSet.add(e));

    System.out.println(miSet);
    mostrar(miSet);

    Map<Integer, String> miMapa = new HashMap<>();
    miMapa.put(1, "Matías");
    miMapa.put(2, "Rosario");
    miMapa.put(3, "Antonella");
    miMapa.put(3, "Luana");

    String elemento = miMapa.get(3);
    System.out.println(elemento);

    mostartInt(miMapa.keySet());
    mostrar(miMapa.values());
  }

  public static void mostrar(Collection<String> collection) {
    collection.forEach(e -> System.out.println(e));
  }

  public static void mostartInt(Collection<Integer> collection) {
    for (Integer integer : collection) {
      System.out.println(integer);
    }
  }
}