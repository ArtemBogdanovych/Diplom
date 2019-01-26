package DAO;

public class TourData {
	private int ID;
	private String nametours;
	private String country;
	private String tourscol;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "TourData [ID=" + ID + ", nametours=" + nametours + ", country=" + country + ", tourscol=" + tourscol
				+ "]";
	}

	public String getNametours() {
		return nametours;
	}

	public void setNametours(String nametours) {
		this.nametours = nametours;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTourscol() {
		return tourscol;
	}

	public void setTourscol(String tourscol) {
		this.tourscol = tourscol;
	}
}
