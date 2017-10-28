import java.util.List;

public class Garage {
	private String vehicleCapacity = null;
	private String vehicleCapacityValueSrc = null;
	
	public String getVehicleCapacity() {
		return vehicleCapacity;
	}
	public void setVehicleCapacity(String vehicleCapacity) {
		this.vehicleCapacity = vehicleCapacity;
	}
	public String getVehicleCapacityValueSrc() {
		return vehicleCapacityValueSrc;
	}
	public void setVehicleCapacityValueSrc(String vehicleCapacityValueSrc) {
		this.vehicleCapacityValueSrc = vehicleCapacityValueSrc;
	}
	
	public String toString(List<Garage> garageL) {
		return ", GARAGE_CD_360V: " + garageL.size() + ", GARAGE_SRC: " + garageL.get(0).getVehicleCapacityValueSrc();
	}
}
