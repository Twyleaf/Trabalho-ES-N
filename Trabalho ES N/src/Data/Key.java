package Data;
public class Key {

	private int id;

	private Date expirationTime;

	private boolean isPermanent;
	
	public Key(int keyID, Date keyExpirationTime, boolean keyIsPermanent) {
		this.id = keyID;
		this.expirationTime = keyExpirationTime;
		this.isPermanent = keyIsPermanent;
	}
	
	public int getID() {
		return this.id;
	}
	
	public Date getExpiraationTime() {
		return this.expirationTime;
	}
	
	public boolean getIsPermanent() {
		return this.isPermanent;
	}

}
