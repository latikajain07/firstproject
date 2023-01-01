package learn_connectivity.learn_jpa_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import learn_connectivity.learn_jpa_hibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseJdbcRepository repository ;

	@Override
	public void run(String... args) throws Exception {
		
		repository.insert(new Course(1,"youu","jgdjsgajh"));
		repository.insert(new Course(2,"she","jgdjsgajh"));
		repository.insert(new Course(3,"he","jgdjsgajh"));
		
	    repository.delete(1);
	}

}
