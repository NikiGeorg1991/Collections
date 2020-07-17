package Torti.Persons;

public class Person {

    private String name;
    private String phoneNum;
    private double money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Person(String name, String phoneNum, double money) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", money=" + money +
                '}';
    }
}
