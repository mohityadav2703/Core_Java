package test;

import java.util.Arrays;
import java.util.List;

class Student{
	String name;
	int score;
	
	Student(String name, int score){
		this.name=name;
		this.score=score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore(){
		return this.score;
	}
}


public class ParallelStream {
	public static void main(String[] args) {
		
		List<Student> studentList=Arrays.asList(
					new Student("David", 82),
					new Student("Bob", 90),
					new Student("John", 65),
					new Student("Canedy", 55),
					new Student("Eric",85),
					new Student("Smith", 88),
					new Student("Scott",59)
				);
		//using stream() - it will process collection data in sequential order
		studentList.stream().filter(x-> x.getScore()>=80).limit(3).forEach(std-> System.out.print(std.getName()+" "+ std.getScore()+", "));
	
		System.out.println();
		//using parallelStream()-
		studentList.parallelStream().filter(x-> x.getScore()>=80).limit(3).forEach(std-> System.out.print(std.getName()+" "+std.getScore()+", "));
		
		System.out.println();
		// we can convert stream to parallel stream
		studentList.stream().parallel().filter(x-> x.getScore()>=80).forEach(std-> System.out.print(std.getName()+" "+std.getScore()+", "));
	
	}

}
