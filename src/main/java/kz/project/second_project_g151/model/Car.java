package kz.project.second_project_g151.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private Integer id;
    private String modelName;
    private int cost;
    private String color;
    private double engine;
    private int horsePower;

    @Getter
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(1, "Toyota Camry 80", 23000000, "red", 2.5, 199));
        cars.add(new Car(2, "Toyota Camry 75", 17000000, "white", 3.5, 249));
        cars.add(new Car(3, "Kia Rio", 8000000, "white", 1.5, 120));
        cars.add(new Car(4, "BMW X5", 70000000, "white", 3.0, 300));
    }

    public static Car getCarById(int id) {

        return cars.stream().filter(car-> car.id==id).findFirst().get();
    }
}
