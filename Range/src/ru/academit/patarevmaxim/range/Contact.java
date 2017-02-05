package ru.academit.patarevmaxim.range;

/**
 * Created by 1 on 27.01.2017.
 */
public class Contact {
    private String name;
    private String surname;
    private String phone;

    public Contact(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static void main(String[] args) {
        Contact firstContact = new Contact("Maxim", "Patarev", "89513984118");

        System.out.println(firstContact.name);
        System.out.println(firstContact.surname);
        System.out.println(firstContact.phone);

        firstContact.setName("Ivan");
        firstContact.setSurname("Ivanov");
        firstContact.setPhone("89999999999");

        System.out.println(firstContact.getName());
        System.out.println(firstContact.getSurname());
        System.out.println(firstContact.getPhone());
    }
}
