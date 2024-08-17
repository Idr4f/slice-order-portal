package ib.slice.order.portal.mongo.users;

import ib.slice.order.portal.model.enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Document(value = "users")
public class UsersEntity {
    @Id
    private String id;
    private String document;
    private String name;
    private String email;
    private String password;
    private Roles role;
}
