package model;

public class Gym <acad> extends Student {
    private String name;
    private String address;
    private String telephone;
    private String email;

    private Gym(String name, String address, String telephone, String email) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }
}
