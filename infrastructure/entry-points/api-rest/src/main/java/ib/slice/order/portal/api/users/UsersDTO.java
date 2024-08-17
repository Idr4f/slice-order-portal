package ib.slice.order.portal.api.users;

import ib.slice.order.portal.model.enums.Roles;

public record UsersDTO(
        String id,
        String document,
        String name,
        String email,
        String password,
        Roles role){}
