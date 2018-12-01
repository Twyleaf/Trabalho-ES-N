package Data;

import java.util.List;

public class User {

	private String name;

	private String login;

	private List<User> userFriends;

	public User(String name, String login, List<User> userFriends) {
		this.name = name;
		this.login = login;
		this.userFriends = userFriends;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public List<User> getUserFriends() {
		return this.userFriends;
	}

}
