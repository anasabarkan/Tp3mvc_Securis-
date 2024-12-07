package ma.enset.security.service;


import ma.enset.security.entities.AppRole;
import ma.enset.security.entities.AppUser;

public interface AccountService {
    AppUser addNewUser(String usename, String password, String email, String confirmPassword);
    AppRole addNewRole(String role);
    void addRoleToUser(String username, String role);
    void removeRoleFormUser(String username, String role);
    AppUser loadUserByUsername(String username);
}

