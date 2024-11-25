package com.organizer;

public class Organizer {

	private String id;
	private String name;
	private String age;
	private String contact_no;
	private String email;
	private String experience_year;
	private String username;
	private String password;
	
	public Organizer(String id, String name, String age, String contact_no, String email, String experience_year, String username, String password) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.contact_no = contact_no;
		this.email = email;
		this.experience_year = experience_year;
		this.username = username;
		this.password = password;
	}

	public String getOrganizer_id() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public String getContact_no() {
		return contact_no;
	}

	public String getEmail() {
		return email;
	}

	public String getExperience_year() {
		return experience_year;
	}	
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
}
