package gameProject;

public class Salesman extends User implements Entity {
	private int salesmanId;
	private String nationalIdentity;
	private String firstName;
	private String lastName;
	private int dateOfYear;

	public Salesman() {
		super();
	}

	public Salesman(int userId, int salesmanId,String firstName, String lastName,String nationalIdentity , int dateOfYear,String mailadress, String password) {
		super(userId,mailadress,password);
		this.salesmanId = salesmanId;
		this.nationalIdentity = nationalIdentity;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfYear = dateOfYear;
	}

	public int getSalesmanId() {
		return salesmanId;
	}

	public void setSalesmanId(int salesmanId) {
		this.salesmanId = salesmanId;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfYear() {
		return dateOfYear;
	}

	public void setDateOfYear(int dateOfYear) {
		this.dateOfYear = dateOfYear;
	}
}