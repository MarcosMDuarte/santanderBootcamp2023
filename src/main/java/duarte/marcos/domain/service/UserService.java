package duarte.marcos.domain.service;

import duarte.marcos.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
