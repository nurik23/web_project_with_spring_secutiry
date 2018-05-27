package kg.iaau.edu.com.model;

public class Student {

    private int id;
    private String firstName;
    private String username;
    private String password;

    public Student()
    {

    }

    public Student(int id, String firstName, String lastName, String groupName) {
        this.id = id;
        this.firstName = firstName;

    }

    public Student(String firstName, String lastName, String groupName) {
        this.firstName = firstName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
