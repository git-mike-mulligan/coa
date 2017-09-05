package entity;

public class Entity {
	private String id;
	private String name;
	private String country;
	
	public Entity(String id, String name, String country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return String.format("Entity [id=%s, name=%s, country=%s]", id, name, country);
	}
	
	
}
