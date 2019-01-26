package DAO;

import DAO.impl.DefaulttourDAO;
import DAO.impl.DefaultuserDAO;

public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultuserDAO dud = new DefaultuserDAO();
//UserData user= dud.getUserbyID(2);
		UserData user = new UserData();
		user = dud.getUserbyID(2);
		System.out.println(user);
		DefaulttourDAO dtd = new DefaulttourDAO();
		TourData tour = new TourData();
		tour = dtd.getTourbyID(1);
		System.out.println(tour);
	}

}
