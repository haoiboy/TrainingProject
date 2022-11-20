package Class;

public class Parent {
    private  String username;
    private int age;



    public Parent(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public Parent() {

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public Parent(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Parent(String username) {
        this.username = username;
    }
}
