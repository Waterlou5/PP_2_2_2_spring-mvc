package web.models;

public class Car {
    private String model;
    private int age;
    private String color;

    public Car(String model, int age, String color) {
        this.model = model;
        this.age = age;
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
}
