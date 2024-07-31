package n3exercici1;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student("Stefan", 19, "Gardening", 9),
				new Student("Scarlett", 22, "Cooking", 6),
				new Student("Martha", 17, "Java", 4),
				new Student("Aurora", 18, "Javascript", 9),
				new Student("Gregoire", 23, "PHP", 10),
				new Student("Albert", 20, "PHP", 7),
				new Student("Roger", 19, "C++", 2),
				new Student("Charles", 17, "PHP", 6),
				new Student("Meghan", 19, "Java", 5));
		
		students.stream()
				.forEach(t -> System.out.printf("%s: %d%n",t.getName(), t.getAge()));

		System.out.println();
		
		List<Student> studentsStartingWithA = students.stream()
				.filter(t -> t.getName().toLowerCase().charAt(0) == 'a').toList();
		studentsStartingWithA.stream()
				.forEach(System.out::println);
		
		System.out.println();
		
		students.stream()
				.filter(t -> t.getGrade() >= 5)
				.forEach(System.out::println);
		
		System.out.println();
		
		
		students.stream()
				.filter(t -> t.getGrade() >= 5)
				.filter(t -> !t.getCourse().equalsIgnoreCase("PHP"))
				.forEach(System.out::println);
		
		System.out.println();
		
		students.stream()
				.filter(t -> t.getCourse().equalsIgnoreCase("JAVA"))
				.filter(t -> t.getAge() >= 18)
				.forEach(System.out::println);
		
		
		
		
	}

}
