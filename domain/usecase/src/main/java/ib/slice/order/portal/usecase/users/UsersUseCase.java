package ib.slice.order.portal.usecase.users;

import ib.slice.order.portal.model.enums.Errors;
import ib.slice.order.portal.model.exception.BusinessException;
import ib.slice.order.portal.model.users.Users;
import ib.slice.order.portal.model.users.gateways.UserOperations;
import ib.slice.order.portal.model.users.gateways.UsersRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UsersUseCase implements UserOperations {
    private final UsersRepository repository;

    public Users saveUsers(Users users){

        return repository.save(users);
    }
    public List<Users> getAllUsers(){

        return repository.findAll();
    }
    public Users getUserById(String id){
        try{
            return repository.findById(id);
        }catch (Exception e){

            throw new BusinessException(Errors.FIND_BY_ID_ERROR.getValue());
        }
    }
    public Users updateUser(String id, Users users){

            Users userDB = this.getUserById(id);
            try{
                Users editedUser = editUser(users, userDB);
                return repository.save(editedUser);
            }catch (Exception e){

                throw new BusinessException(Errors.UPDATE_ERROR.getValue());
            }

    }
    public String deleteUserById(String id){

        try{
            Users users = this.getUserById(id);
            repository.deleteById(users.getId());
            return "Success";
        }catch (Exception e){

            throw new BusinessException(Errors.DELETE_ERROR.getValue());
        }
    }
}
