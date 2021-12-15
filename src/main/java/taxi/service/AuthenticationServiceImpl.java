package taxi.service;

import java.util.Optional;
import taxi.exception.AuthenticationException;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Inject
    private DriverService driverService;
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);
    private String errorMsg = "Username or password incorrect";

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driver = driverService.findByLogin(login);
        if (driver.isPresent() && driver.get().getPassword().equals(password)) {
            logger.info("User logged in site. Login: {}", login);
            return driver.get();
        }
        logger.error(errorMsg);
        throw new AuthenticationException(errorMsg);
    }
}
