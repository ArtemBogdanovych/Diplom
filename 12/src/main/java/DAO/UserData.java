package DAO;

public class UserData {
	private int iduser;
	private String name;
	private String email;

	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "UserData [iduser=" + iduser + ", name=" + name + ", email=" + email +  "]";
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
