package LessonThree.LessonThree;

import java.util.List;

interface IUserDAO {
	
    void insert(User user);

    void updateUserFirstName(int id, String newName);

    User getUserById(int id);

    List<User> getAllUsers();

    void delete(User user);
}
