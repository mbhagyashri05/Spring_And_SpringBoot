package org.tns.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		/*Student s=new Student();
		s.setStudentName("Bhagyashri Marathe");
		s.display();*/
		
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Student s1=c.getBean("s1",Student.class);
		s1.display();
		
		Student s2=c.getBean("s2",Student.class);
		s2.display();
	}
}
