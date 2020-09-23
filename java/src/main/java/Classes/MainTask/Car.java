package Classes.MainTask;

public class Car {

  private int newId = 1;
  private Mark mark;
  private String model;
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

//  public int getId() {
//    return id;
//  }
//
//  public void setId(int id) {
//    this.id = id;
//  }

  public Mark getMark() {
    return mark;
  }

  public void setMark(Mark mark) {
    this.mark = mark;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  @Override
  public String toString() {
    return "Car{" +
      "id=" + id +
      ", mark=" + mark +
      ", model='" + model + '\'' +
      ", year=" + year +
      ", color='" + color + '\'' +
      ", price=" + price +
      ", number='" + number + '\'' +
      '}';
  }
}