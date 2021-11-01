public class AccountHolder {
	protected int ID;
	protected String address;
	
	public AccountHolder (int ID, String address) {
		this.ID = ID;
		this.address = address;
	}
	
	public int nextID() {
		return ID + 1;
	}
}
AccountHolder.java
1 KB