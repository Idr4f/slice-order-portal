package ib.slice.order.portal.model.users.gateways;

import ib.slice.order.portal.model.users.Users;

import java.util.List;

public interface UsersRepository {
    Users save(Users users);
    List<Users> findAll();
    Users findById(String id);
    void deleteById(String id);
}
