package ib.slice.order.portal.model.users.gateways;

import ib.slice.order.portal.model.users.Users;

public interface UserOperations {

    default Users editUser(Users users, Users usersDB){

        return usersDB
                .toBuilder()
                .email(users.getEmail() != null ? users.getEmail() : usersDB.getEmail())
                .name(users.getName() != null ? users.getName() : usersDB.getName())
                .build();
    }
}
