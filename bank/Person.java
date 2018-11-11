package bank;

/**
 *Creates a Person class that can be inherited by person subtypes. The person class provides
 * a contact information and generates a id
 */
public abstract class Person {
	private ContactInfo contactInfo;
	private int id;
	private static int nextId = 0;
	
	public Person(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
		this.id = nextId;
		nextId += 1;
	}
	public ContactInfo contactInfo() {
		return contactInfo;
	}
	public int id() {
		return id;
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	/**
	 * Sets the contact information for a given person
	 * @param contactInfo
	 */
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
