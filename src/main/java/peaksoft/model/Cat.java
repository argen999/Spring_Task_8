package peaksoft.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import peaksoft.dao.Animal;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Component
public class Cat implements Animal {
    @Value("${cat.bread}")
    private String breed;
    @Value("${cat.colour}")
    private String colour;

    public Cat(String breed, String colour) {
        this.breed = breed;
        this.colour = colour;
    }

    @Override
    public void animalPlus() {
        System.out.println("I love cats!");
    }

    @Override
    public void animalMinus() {
        System.out.println("I don't love cats!");
    }
}
