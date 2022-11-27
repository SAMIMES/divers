package springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		
		//create a spring container
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("ApplicationContextAnno.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("trackCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		//Call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
