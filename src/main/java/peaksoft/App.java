package peaksoft;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import peaksoft.model.Person;
import peaksoft.model.Person2;
import peaksoft.util.SpringContainerUtil;

public class App {
    public static void main( String[] args ) {
        System.out.println("ClassPathXmlConnection");
        contextClassPathXmlConnection();
        System.out.println("--\n\n\n\n--");
        System.out.println("AnnotationConfigApplicationContext");
        contextAnnotationConfiguration();
    }
    public static void contextClassPathXmlConnection() {
        try (ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml")) {

            Person person = context.getBean("person", Person.class);
            System.out.println(person);
            person.getAnimal().animalPlus();
            person.getAnimal().animalMinus();

            Person2 person2 = context.getBean("person2", Person2.class);
            System.out.println(person2);
            person2.getAnimal().animalPlus();
            person2.getAnimal().animalMinus();
        }

    }
    public static void contextAnnotationConfiguration() {
        try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringContainerUtil.class)) {

            Person person = context.getBean("getPerson", Person.class);
            System.out.println(person);
            person.getAnimal().animalPlus();
            person.getAnimal().animalMinus();

            Person2 person2 = context.getBean("getPerson2", Person2.class);
            System.out.println(person2);
            person2.getAnimal().animalPlus();
            person2.getAnimal().animalMinus();
        }
    }
}
