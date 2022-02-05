package br.com.udemy.carlosdv93.data.vo;

import java.util.Objects;

public class PersonVO {
    private Long id;

    private String name;

    private String lastName;

    private String address;

    private String gender;

    public PersonVO() {
    }

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonVO personVO = (PersonVO) o;
        return Objects.equals(id, personVO.id) && name.equals(personVO.name) && lastName.equals(personVO.lastName) && address.equals(personVO.address) && gender.equals(personVO.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, address, gender);
    }
}
