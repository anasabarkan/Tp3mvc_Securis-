package ma.enset.security.repo;
import ma.enset.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  AppUserRepository extends JpaRepository<AppUser,String> {
    AppUser findByUsername(String username);

}