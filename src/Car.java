
public class Car {
    public int weight;
    public String model;
    public char color;
    public float speed;

    public void outPut() {
        System.out.println("Вес " + this.model + " составляет " + this.weight + "кг.");
        System.out.println("Цвет машины - " + this.color + " и её скорость - " + this.speed);
    }

    public Car(int weight, String model, char color, float speed) {
        this.weight = weight;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public Car() {
    }
}
