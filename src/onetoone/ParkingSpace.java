package onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ParkingSpace {
 
	@Id
	int parkingId;
	
	String buildName;

	public ParkingSpace() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParkingSpace(int parkingId, String buildName) {
		super();
		this.parkingId = parkingId;
		this.buildName = buildName;
	}

	public int getParkingId() {
		return parkingId;
	}

	public void setParkingId(int parkingId) {
		this.parkingId = parkingId;
	}

	public String getBuildName() {
		return buildName;
	}

	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}
	
	
	
}
