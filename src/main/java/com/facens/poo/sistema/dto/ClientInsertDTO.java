package com.facens.poo.sistema.dto;

public class ClientInsertDTO {
    private String name;
    private String address;   
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

    public ClientInsertDTO(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
}
