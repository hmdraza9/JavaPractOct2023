package my.test.pack.javaConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {

	int rollNo;
	String name;
	int age;

	Student(int rollNo, String name, int age) {

		this.rollNo = rollNo;
		this.name = name;
		this.age = age;

	}

	@Override
	public int compareTo(Student st) {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		if (age == st.age)
			return 0;
		if (age > st.age)
			return 1;
		else
			return -1;
	}
}

public class ObjectSortingComparable {

	public static void main(String[] args) {

		List<Student> al = new ArrayList<>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jay", 21));
		al.add(new Student(104, "Vijay", 24));
		al.add(new Student(108, "Ajay", 26));
		al.add(new Student(102, "Jay", 22));

		ObjectSortingComparable.printList(al, "Before sort");

		Collections.sort(al);

		ObjectSortingComparable.printList(al, "After sort");

	}

	public static void printList(List<Student> ll, String msg) {

		for (Student st : ll) {

			System.out.println(msg + " - Roll No. " + st.rollNo + "; Name: " + st.name + "; Age: " + st.age);

		}
		System.out.println("\n");

	}

}
