package aciWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello World!!");
		helloWorld.getMessage();
	}

}
