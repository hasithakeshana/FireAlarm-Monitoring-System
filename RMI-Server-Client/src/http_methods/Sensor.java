package http_methods;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Sensor implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	private String _id; // Auto genreated ID by MongoDB
	private String id; // Sensor ID
	private boolean active; // Sensor Active status
	private String floorNo; // Sensor floor number
	private String roomNo; // Sensor room N=number
	private int smokeLevel; // Smoke level of the sensor
	private int co2Level; // CO2 level of the sensor
	private int __v; // Version generated by MongoDB

	public String get_id() {
		return _id;
	}

	public int get__v() {
		return __v;
	}

	public void set__v(int __v) {
		this.__v = __v;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(String floorNo) {
		this.floorNo = floorNo;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public int getSmokeLevel() {
		return smokeLevel;
	}

	public void setSmokeLevel(int smokeLevel) {
		this.smokeLevel = smokeLevel;
	}

	public int getCo2Level() {
		return co2Level;
	}

	public void setCo2Level(int co2Level) {
		this.co2Level = co2Level;
	}

}