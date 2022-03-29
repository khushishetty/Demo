package aciWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfig.class);
		TextEditor editor = context.getBean(TextEditor.class);
		editor.spellCheck();

	}

}
