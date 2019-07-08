package Homework.Task10;

public class Customer {
    private String surname;
    private String name;
    private String fathername;
    private String address;
    private Long card;
    private Long bankbill;

    public Customer(String name, String surname, String fathername, String address, Long card, Long bankbill) {
        this.surname = surname;
        this.name = name;
        this.fathername = fathername;
        this.address = address;
        this.card = card;
        this.bankbill = bankbill;
    }

    public String getfullinfo() {
        return String.format("%s %s %s %s %d %d",surname,name,fathername,address,card,bankbill);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getCard() {
        return card;
    }

    public void setCard(Long card) {
        this.card = card;
    }

    public Long getBankbill() {
        return bankbill;
    }

    public void setBankbill(Long bankbill) {
        this.bankbill = bankbill;
    }
}
