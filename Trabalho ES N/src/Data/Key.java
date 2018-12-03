package Data;

import java.time.LocalDate;

public class Key {

	private int id;

	private LocalDate expirationTime;

	private boolean isPermanent;
	
	public Key(int keyID, LocalDate keyExpirationTime, boolean keyIsPermanent) {
		this.id = keyID;
		this.expirationTime = keyExpirationTime;
		this.isPermanent = keyIsPermanent;
	}
	
	public Key(LocalDate keyExpirationTime, boolean keyIsPermanent) {
		this.expirationTime = keyExpirationTime;
		this.isPermanent = keyIsPermanent;
	}
	
	public int getID() {
		return this.id;
	}
	
	public LocalDate getExpirationTime() {
		return this.expirationTime;
	}
	
	public boolean getIsPermanent() {
		return this.isPermanent;
	}

}
