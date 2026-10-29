import java.util.Collections;
import java.util.List;

public class ListaUtil{

    public static <T extends Comparable<T>> void ordenarExibir(List<T> ordenar){

        Collections.sort(ordenar);

        for(T ordenados : ordenar){
            System.out.println(ordenados);
        }


    }
}
