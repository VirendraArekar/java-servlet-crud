package in.strikes.service;

import in.strikes.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {
    final Map<Integer, User> userDB;

    public UserService() {
        userDB = new HashMap<>();
    }

    public User createUser(User userRequest){
        userDB.put(userRequest.getId(), userRequest);
        return userRequest;
    }

    public List<User> getAllUsers(){
        return userDB.values().stream().toList();
    }

    public User updateUser(Integer id, User userRequest){
        userDB.put(id, userRequest);
        return userRequest;
    }

    public User deleteUser(Integer id){
        return userDB.remove(id);
    }

    public User getUserById(Integer id){
        return userDB.getOrDefault(id, null);
    }
}

