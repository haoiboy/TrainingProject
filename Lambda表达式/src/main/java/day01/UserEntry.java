package day01;

public class UserEntry {
    private String userName;
    private int age;

    public UserEntry(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "UserEntry{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }
}
