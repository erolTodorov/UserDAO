package LessonThree.LessonThree;
class User {
    private int id;
    private String username;
    private String firstName;
    private String lastName;

    // Constructor, getters, and setters
    // ...

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}