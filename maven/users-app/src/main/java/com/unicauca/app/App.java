package com.unicauca.app;

import com.unicauca.app.access.IUserRepository;
import com.unicauca.app.access.UserRepositoryImpl;
import com.unicauca.app.domain.services.IUserService;
import com.unicauca.app.domain.services.UserServiceImpl;
import com.unicauca.app.presentation.UserController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        IUserRepository repository = new UserRepositoryImpl();
        IUserService service = new UserServiceImpl(repository);
        UserController controller = new UserController(service);

        controller.createUser("User name", "password");
    }
}
