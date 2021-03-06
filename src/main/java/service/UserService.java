package service;

import entity.User;
import service.exceptions.DuplicateUserException;
import service.exceptions.UserNotFoundException;

import java.util.List;

public interface UserService {

    void create (User user) throws DuplicateUserException;
    User getById(long id) throws UserNotFoundException;
    User getByLogin (String login) throws UserNotFoundException;
    List<User> getAll();
    void deleteById (long id);
    void update (User user);
    void update (String name, long id);
    boolean containsByLogin (String login);

}
