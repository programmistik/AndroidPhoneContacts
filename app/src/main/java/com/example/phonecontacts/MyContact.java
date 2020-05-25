package com.example.phonecontacts;

public class MyContact {
    private String ContactName;
    private String ContactNumber;
    private String ContactPhoto;

    public MyContact(String ContactName, String ContactNumber, String ContactPhoto){

        this.ContactName=ContactName;
        this.ContactNumber=ContactNumber;

        this.ContactPhoto=ContactPhoto;
    }

    public String getName() {
        return ContactName;
    }

    public void setName(String ContactName) {
        this.ContactName = ContactName;
    }

    public String getNumber() {
        return ContactNumber;
    }

    public void setNumber(String ContactNumber) {
        this.ContactNumber = ContactNumber;
    }

    public String getPhotoResource() {
        return this.ContactPhoto;
    }

    public void setPhotoResource(String ContactPhoto) {
        this.ContactPhoto = ContactPhoto;
    }
}
