package DAO.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import DAO.TourDAO;
import DAO.TourData;
import DButils.DBconectionUtils;

public class DefaulttourDAO implements TourDAO {

	@Override
	public TourData getTourbyID(int ID) {
		// TODO Auto-generated method stub
		TourData tourdata = new TourData();
		try (Connection conn = DBconectionUtils.getConnection()) {
			Statement statement = conn.createStatement();

			ResultSet resultSet = statement.executeQuery("SELECT * FROM tours WHERE tours_id=" + ID);

			while (resultSet.next()) {
				tourdata.setID(resultSet.getInt("tours_id"));
				tourdata.setNametours(resultSet.getString("name_tours"));
				tourdata.setCountry(resultSet.getString("Country"));
				tourdata.setTourscol(resultSet.getString("tourscol"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return tourdata;
	}

	@Override
	public List<TourData> gettours() {
		// TODO Auto-generated method stub
		return null;
	}

}
