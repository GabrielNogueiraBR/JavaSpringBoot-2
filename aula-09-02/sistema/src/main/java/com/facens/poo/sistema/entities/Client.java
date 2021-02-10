package com.facens.poo.sistema.entities;

public class Client {
    private Long id;
    private String name;
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Client() {
    }

    public Client(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    
}
