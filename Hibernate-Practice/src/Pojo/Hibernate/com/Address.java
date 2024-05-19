package Pojo.Hibernate.com;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable

public class Address {

	@Column(length = 20)
	private String Street;
	@Column(length = 20)
	private String City;
	@Column(length = 20)
	private String State;
	@Column(length = 20)
	private long Zipcode;
	
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", City=" + City + ", State=" + State + ", Zipcode=" + Zipcode + "]";
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public long getZipcode() {
		return Zipcode;
	}
	public void setZipcode(long zipcode) {
		Zipcode = zipcode;
	}
	public Address(String street, String city, String state, long zipcode) {
		super();
		Street = street;
		City = city;
		State = state;
		Zipcode = zipcode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
