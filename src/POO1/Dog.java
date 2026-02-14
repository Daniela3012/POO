package POO1;

public class Dog {
    private String bread;
    private int age;
    private String color;

    public Dog(String bread, int age, String color) {
        this.bread = bread;
        this.age = age;
        this.color = color;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
