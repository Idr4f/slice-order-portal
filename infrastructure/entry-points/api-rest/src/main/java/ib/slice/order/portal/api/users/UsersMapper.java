package ib.slice.order.portal.api.users;

import ib.slice.order.portal.model.users.Users;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper
public interface UsersMapper {
    @Mapping(target = "id", defaultExpression = "java(java.util.UUID.randomUUID().toString())")
    Users toEntity(UsersDTO dto);
    UsersDTO toTransferObject(Users users);
}
