package ib.slice.order.portal.model.users;

import ib.slice.order.portal.model.enums.Roles;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Users {
    private String id;
    private String document;
    private String name;
    private String email;
    private String password;
    private Roles role;
}