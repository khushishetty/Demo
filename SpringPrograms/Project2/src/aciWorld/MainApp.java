package aciWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		TextEditor editor = (TextEditor)context.getBean("textEditor");
		editor.spellCheck();
	}

}
