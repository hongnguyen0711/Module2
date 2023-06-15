package ss10_list.exersice.array_list;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        System.out.println(myList.get(0));
        System.out.println(myList.size());
        System.out.println(myList.indexOf(1));

    }
}
