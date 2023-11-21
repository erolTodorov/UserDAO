package LessonThree.LessonThree;

import java.util.List;

class UserDAO implements IUserDAO {
    private List<User> userList; 

    
    public UserDAO(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public void insert(User user) {
        userList.add(user);
    }

    @Override
    public void updateUserFirstName(int id, String newName) {
        for (User user : userList) {
            if (user.getId() == id) {
                user.setFirstName(newName);
                return;
            }
        }
        
        System.out.println("User with ID " + id + " not found.");
    }

    @Override
    public User getUserById(int id) {
        for (User user : userList) {
            if (user.getId() == id) {
                return user;
            }
        }
        // Handle the case where the user with the given id is not found
        System.out.println("User with ID " + id + " not found.");
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }

    @Override
    public void delete(User user) {
        userList.remove(user);
    }
}
