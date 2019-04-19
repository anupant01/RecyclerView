package model;

public class Contacts {

    private String name;
    private String phoneno;
    private int imageId;
    private String email;
    private String address;

    public Contacts(String name, String phoneno, int imageId, String email, String address) {
        this.name = name;
        this.phoneno = phoneno;
        this.imageId = imageId;
        this.email=email;
        this.address=address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
