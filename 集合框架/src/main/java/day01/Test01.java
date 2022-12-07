package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test01 {
    public static void main(String[] args) {
        List<MayiktParent> mayiktParents = new ArrayList<MayiktParent>();
        List<Student> students = new ArrayList<Student>();
        List<Integer> integers = new ArrayList<Integer>();
        List<Object> objects = new ArrayList<Object>();
        printList(mayiktParents);
        printList(students);

printList2(mayiktParents);
        printList2(objects);

    }

    /**
     * 通配符上限和下限
     * List<? extends MayiktParent 上限 extends MayiktParent 和他子类></>
     * @param list
     */
    public static void printList(List<? extends MayiktParent> list) {

    }
    public static void printList2(List<? super MayiktParent> list) {

    }
}
