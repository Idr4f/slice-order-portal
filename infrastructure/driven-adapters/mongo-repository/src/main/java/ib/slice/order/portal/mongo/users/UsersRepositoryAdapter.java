package ib.slice.order.portal.mongo.users;

import ib.slice.order.portal.model.users.Users;
import ib.slice.order.portal.model.users.gateways.UsersRepository;
import ib.slice.order.portal.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UsersRepositoryAdapter extends AdapterOperations<Users, UsersEntity, String, UsersDBRepository>
implements UsersRepository
{

    public UsersRepositoryAdapter(UsersDBRepository repository, ObjectMapper mapper) {

        super(repository, mapper, d -> mapper.map(d, Users.class));
    }
}
