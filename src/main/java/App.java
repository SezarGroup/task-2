import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloWorld2 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(helloWorld1.getMessage());
        System.out.println(helloWorld2.getMessage());
        System.out.println(cat1.getName());
        System.out.println(cat2.getName());
        System.out.println("Две пары Hello World = " + helloWorld1.equals(helloWorld2));
        System.out.println("Две пары Cat = " + cat1.equals(cat2));
    }
}