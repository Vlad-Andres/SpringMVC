package cf.flymengo;

public class LogInService {
	public boolean validateUser(String username,String password) {
		return username.equals("Vlad") && password.equals("123");
	}

}
