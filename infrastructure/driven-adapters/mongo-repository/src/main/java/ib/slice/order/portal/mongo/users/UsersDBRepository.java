package ib.slice.order.portal.mongo.users;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface UsersDBRepository extends MongoRepository<UsersEntity, String> , QueryByExampleExecutor<UsersEntity> {
}
