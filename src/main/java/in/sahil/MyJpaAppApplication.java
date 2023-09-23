package in.sahil;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sahil.entity.Student;
import in.sahil.repository.StudentRepository;

@SpringBootApplication
public class MyJpaAppApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context=SpringApplication.run(MyJpaAppApplication.class, args);
		
		StudentRepository studentrepo=context.getBean(StudentRepository.class);
		
		Student s=new Student();
		s.setId(103);
		s.setName("Ashok");
		s.setStudentRank("1133l");
		s.setGender("Male");
		
		
		Student s1=new Student();
		s1.setId(104);
		s1.setName("Sahil");
		s1.setGender("Male");
		s1.setStudentRank("1122l");
		
		Student s2=new Student();
		s2.setId(105);
		s2.setName("Maroof");
		s2.setGender("Male");
		s2.setStudentRank("1144l");
		
		List<Student> list=Arrays.asList(s,s1,s2);
		
        studentrepo.saveAll(list);
	}

}
