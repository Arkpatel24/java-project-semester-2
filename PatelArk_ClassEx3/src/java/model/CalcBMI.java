/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author ARK PATEL
 */
public class CalcBMI implements Serializable 
{
    private String FirstName;
    private String LastName;
    private double weight; 
    private double height;  
    
   
    
    public CalcBMI (String FirstName,String LastName, double weight, double height)
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.weight = weight; 
        this.height = height; 
    }
   
    public double getBMI()
    {
    double bmi = weight /(height * height);
    return Math.round(bmi * 100) / 100.0;
    }

    


    public String getStatus() 
    {
        double bmi = getBMI();
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)  
            return "Normal";  
        else if (bmi < 30) 
            return "Overweight";
        else
            return "Obese";  
    }

    /**
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
}