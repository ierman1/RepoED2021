public class Main {

    public static void main(String[] args) {

        Heap<Integer> a = new Heap<>();

        a.add(1);
        a.add(3);
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(8);
        a.add(2);
        a.add(1);

        System.out.println(a);

        a.remove();
        System.out.println(a);

        a.remove();
        a.remove();
        System.out.println(a);

        a.remove();
        a.remove();
        a.remove();
        a.remove();
        System.out.println(a);

        a.remove();
        System.out.println(a);

    }

}
