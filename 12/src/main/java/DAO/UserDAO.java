package DAO;

import java.util.List;

public interface UserDAO {
	UserData getUserbyID(int iduser);

	List<UserData> getusers();
}
