package java8prog;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import org.w3c.dom.ls.LSInput;

public class FunctionDemo {
	
	
	

	public static void main(String[] args) {
	
		/*Function<Integer, Integer> f = i->i*i;
		System.out.println("square="+f.apply(8));
		
		Function<String,String> f2 = s->s.toUpperCase();
		System.out.println(f2.apply("amitkumar"));
	}*/
		
		List<Student>listStud = new ArrayList<>();
		listStud.add(new Student("amit", 87));
		listStud.add(new Student("lalit", 65));
		listStud.add(new Student("Harsh", 55));
		listStud.add(new Student("Geeta", 65));
		
		Predicate<Student> p1 = s->s.getMarks()>55;
		
		Function<Student,String> f3 = s->{
		int marks = s.getMarks();
		String grade = "";
		if(marks>75){
			grade ="distinction"; 
		}
		else if(marks<75 && marks>=65){
			grade = "first";
		}
		else if(marks<65 && marks>=55){
			grade = "second";
		}
		else
			grade="fail";
		
		return grade;
				
	};
	
	
	for(Student student:listStud){
		if(p1.test(student)){
			
			System.out.println("Name="+student.getName());
			System.out.println("Marks="+student.getMarks());
			System.out.println("Grade="+f3.apply(student));
		}
	}
	
	
	}
	
}
