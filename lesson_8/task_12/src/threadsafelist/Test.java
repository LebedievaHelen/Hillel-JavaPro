package threadsafelist;

public class Test {

    public static void main(String[] args) {
        MyList<String> list = new ThreadSafeList<>();

        System.out.println("Test for add method:");

        list.add("one");
        list.add("two");
        list.add("three");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("Test for get method:");

        System.out.println(list.get(0));

        System.out.println("Test for remove method:");

        list.remove("two");

        for (String s : list) {
            System.out.println(s);
        }
    }
}