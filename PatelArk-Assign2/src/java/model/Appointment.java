/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Java Bean
 * @author ARK PATEL
 */
public class Appointment 
{
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private String mobile;
    private String gender;
    private String issue;
    private String timing;
    
    //default constructor
    public Appointment()
    {
    }
    
    //parameterized constructor
    public Appointment(String firstName,String lastName,String age,String address, String mobile,String gender,String issue,String timing)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.address=address;
        this.mobile=mobile;
        this.gender=gender;
        this.issue=issue;
        this.timing=timing;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
 

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the issue
     */
    public String getIssue() {
        return issue;
    }

    /**
     * @param issue the issue to set
     */
    public void setIssue(String issue) {
        this.issue = issue;
    }

    /**
     * @return the time
     */
    public String getTiming() {
        return timing;
    }

    /**
     * @param time the time to set
     */
    public void setTiming(String timing) {
        this.timing = timing;
    }
    
}
