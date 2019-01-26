package DAO;

import java.util.List;

public interface TourDAO {
	TourData getTourbyID(int ID);

	List<TourData> gettours();
}
