package org.tns.di1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Di_Using_Objects {
	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Student s=c.getBean("s",Student.class);
		s.cheating();
	}
}
