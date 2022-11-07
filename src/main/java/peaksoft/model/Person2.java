package peaksoft.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import peaksoft.dao.Animal;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Setter
@Getter
@NoArgsConstructor
@Component
public class Person2 {
    @Value("${person2.name}")
    private String name;
    @Value("${person2.age}")
    private int age;
    @Autowired
    @Qualifier("dog")
    private Animal animal;


    public Person2(String name, int age, Animal animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
    }

    @PostConstruct
    public void init() {
        System.out.println("Second person init!");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Second person destroy!");
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
