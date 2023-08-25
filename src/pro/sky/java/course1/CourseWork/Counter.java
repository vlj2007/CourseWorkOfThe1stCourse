package pro.sky.java.course1.CourseWork;

public class Counter {
    public int count;

    public Counter() {
//        int[] employeeStorage = new int[10];
//        for (int count = 1; count <= employeeStorage.length; count++) {
//            System.out.println(count);
//        }
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

}

