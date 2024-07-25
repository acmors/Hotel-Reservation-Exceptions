package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private Integer numberRoom;
	private Date checkin;
	private Date checkout;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {
	}

	public Reservation(Integer numberRoom, Date checkin, Date checkout) {
		super();
		this.numberRoom = numberRoom;
		this.checkin = checkin;
		checkout = checkout;
	}

	public Integer getNumberRoom() {
		return numberRoom;
	}

	public void setNumberRoom(Integer numberRoom) {
		this.numberRoom = numberRoom;
	}

	public Date getCheckin() {
		return checkin;
	}

//	public void setCheckin(Date checkin) {
//		this.checkin = checkin;
//	}

	public Date getCheckout() {
		return checkout;
	}

//	public void setCheckout(Date checkout) {
//		checkout = checkout;
//	}
	
	public long duration() {
		long diff = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		
	}
	
	public void updateDates(Date chekin, Date checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	@Override
	public String toString() {
		return "ROOM: " + numberRoom
				+ ", checkIn: "
				+ sdf.format(checkin)
				+ ", checkOut: "
				+ sdf.format(checkout)
				+ ", "
				+ duration()
				+ "nights";
	}
}
