package classes.maintask;

public class Car {

  private static int newId = 1;
  private final Mark mark;
  private final String model;
  private int year;
  private String color;
  private int price;
  private String number;

  private final int id = newId++;

  public Car(Mark mark, String model, int year, String color, int price, String number) {
    this.mark = mark;
    this.model = model;
    this.year = year;
    this.color = color;
    this.price = price;
    this.number = number;
  }

  public Car(Mark mark, String model) {
    this.mark = mark;
    this.model = model;
  }

  public static int getNewId() {
    return newId;
  }

  public static void setNewId(int newId) {
    Car.newId = newId;
  }

  public Mark getMark() {
    return mark;
  }

  public String getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }

  public String getColor() {
    return color;
  }

  public int getPrice() {
    return price;
  }

  public String getNumber() {
    return number;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Car{"
               + "id=" + id
               + ", mark=" + mark
               + ", model='" + model + '\''
               + ", year=" + year
               + ", color='" + color + '\''
               + ", price=" + price
               + ", number='" + number + '\'' + '}';
  }
}
