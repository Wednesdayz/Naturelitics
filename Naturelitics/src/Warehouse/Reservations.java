package Warehouse;
import java.util.ArrayList;
import java.time.LocalDate;

/**
 * 
 * @author z5118076
 *
 */

public class Reservations {
	private int id;
	private int userId;
	ArrayList<Items> items;
	LocalDate start;
	LocalDate end;
	
	public Reservations(int userID, int id, LocalDate start, LocalDate end) {
		this.id = id;
		this.start = start;
		this.end = end;
	}
	public int getUserID() {
		return userId;
	}
	
	public void addItem(Items i) {
		items.add(i);
	}
	public LocalDate getStart() {
		return start;
	}
	
	public LocalDate getEnd() {
		return end;
	}
	public int getID() {
		return id;
	}
	
	public boolean getItem(Items o) {
		if(items.contains(o)) {
			return true;
		}
	return false;
	}
	
}
