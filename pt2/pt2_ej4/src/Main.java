import java.util.*;

public class Main {

    public static void printList(List list) {
        Iterator<Object> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        Profesor pf1 = new Profesor ("Profesor_Sergio", "1234-D", "3.14");
        Profesor pf2 = new Profesor ("Profesor_Xavi", "1235-D", "3.15");
        ArrayList<Profesor> list_prof = new ArrayList<Profesor>();
        list_prof.add(pf1);
        list_prof.add(pf2);
        Lector l1 = new Lector ("Lector_Sergio", "1234-D", "GRIHO");
        Lector l2 = new Lector ("Lector_Josep", "1234-E", "GTI");
        LinkedList<Lector> list_lec = new LinkedList<Lector>();
        list_lec.add(l1);
        list_lec.add(l2);
        printList(list_prof);
        printList(list_lec);
    }
}
