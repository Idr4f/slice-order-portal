package ib.slice.order.portal.api.users;
import ib.slice.order.portal.api.commons.GenericStringResponse;
import ib.slice.order.portal.usecase.users.UsersUseCase;
import lombok.AllArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/users", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class UsersRest {
    private final UsersUseCase useCase;
    private final UsersMapper usersMappers = Mappers.getMapper(UsersMapper.class);

    @PostMapping
    public ResponseEntity<?> save(@RequestBody UsersDTO dto){

        return ResponseEntity.ok(usersMappers.toTransferObject(useCase.saveUsers(usersMappers.toEntity(dto))));
    }

    @GetMapping
    public ResponseEntity<?> findAllUsers(){

        return ResponseEntity.ok(useCase.getAllUsers().stream().map(usersMappers::toTransferObject).toList());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> findUserById(@PathVariable(name = "id") String id){

        return ResponseEntity.ok(usersMappers.toTransferObject(useCase.getUserById(id)));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<?> updateUser(@PathVariable(name = "id") String id, @RequestBody UsersDTO dto){

        return ResponseEntity.ok(usersMappers.toTransferObject(useCase.updateUser(id, usersMappers.toEntity(dto))));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<GenericStringResponse> deleteUser(@PathVariable(name = "id") String id){

        String status = useCase.deleteUserById(id);
        return ResponseEntity.ok(GenericStringResponse.builder().status(status).build());
    }
}
