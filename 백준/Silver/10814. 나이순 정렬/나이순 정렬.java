import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] PersonArray = new Person[n];
        for(int i = 0; i < n; i++)
            PersonArray[i] = new Person(sc.nextInt(), sc.next());
        Arrays.sort(PersonArray, new Comparator<Person>() {
            @Override
            public int compare(Person s1, Person s2) {
                return s1.age - s2.age; 
            }
        });
        StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++)
			sb.append(PersonArray[i]);
		System.out.println(sb);
        sc.close();
    }   

    public static class Person {
        int age;
        String name;
        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
        @Override
		public String toString() {
			return age + " " + name + "\n";
		}
    }
}
