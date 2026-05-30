package model;
import java.util.ArrayList;

public class Gym <T>{
    private String name;
    private String address;
    private String telephone;
    private String email;
    private ArrayList<T> members;

    public Gym(String name, String address, String telephone, String email) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
        this.members = new ArrayList<>();
    }

}
