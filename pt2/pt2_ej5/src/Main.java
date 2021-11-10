import java.util.*;

public class Main {

    public static void printList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public static <T extends Comparable> void sort (List<T> l) {
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.size() - 1; j++) {
                if (l.get(j).compareTo(l.get(j + 1)) < 0) {
                    T tmp = l.get(j);
                    l.set(j, l.get(j + 1));
                    l.set(j + 1, tmp);
                }
            }
        }
    }

    public static void main(String[] args) {
        Persona person1 = new Persona("Sergio", "99999999X");
        Persona person2 = new Persona ("Josep", "88888888P");
        Persona person3 = new Persona ("Josep", "77777777A");
        Persona person4 = new Persona ("Josep", "77777777P");
        //mas personas
        ArrayList<Persona> arr_per = new ArrayList<Persona>();
        arr_per.add(person1);
        arr_per.add(person2);
        arr_per.add(person3);
        arr_per.add(person4);
        // añadir mas personas
        sort(arr_per);
        //imprimir lista de Personas ordenades (opcional)
        Coche coche1 = new Coche ("L-1234");
        Coche coche2 = new Coche ("Z-1234");
        //mas coches
        LinkedList<Coche> arr_ctx = new LinkedList<Coche>();
        arr_ctx.add(coche1);
        arr_ctx.add(coche2);
        //añadir mas coches
        sort(arr_ctx);
        //imprimir lista de coches ordenados (opcional)

        printList(arr_ctx);
        printList(arr_per);
    }

}
