package nl.gettoworktogether.onetoone;

import nl.gettoworktogether.onetoone.model.User;
import nl.gettoworktogether.onetoone.model.UserProfile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToOneApplication {

	public static void main(String[] args) {

		SpringApplication.run(OneToOneApplication.class, args);

		User user = new User();

		UserProfile profile = new UserProfile();

		user.setUserProfile(profile);


	}

}
