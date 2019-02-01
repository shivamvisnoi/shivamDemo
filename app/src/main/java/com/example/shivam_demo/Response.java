package com.example.shivam_demo;

import java.util.List;

public class Response{
	private List<ContactsItem> contacts;

	public void setContacts(List<ContactsItem> contacts){
		this.contacts = contacts;
	}

	public List<ContactsItem> getContacts(){
		return contacts;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"contacts = '" + contacts + '\'' + 
			"}";
		}
}