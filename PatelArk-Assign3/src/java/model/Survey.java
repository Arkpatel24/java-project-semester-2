/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ARK PATEL
 */
public class Survey 
{
    private String name;
    private String ques1;
    private String ques2;
    private String ques3;
    private String ques4;
    
    public Survey()
    {
    }
    
    public Survey(String name,String ques1,String ques2,String ques3,String ques4)
    {
        this.name=name;
        this.ques1=ques1;
        this.ques2=ques2;
        this.ques3=ques3;
        this.ques4=ques4;
    }
    
    public Survey(String name)
    {
        this.name=name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ques1
     */
    public String getQues1() {
        return ques1;
    }

    /**
     * @param ques1 the ques1 to set
     */
    public void setQues1(String ques1) {
        this.ques1 = ques1;
    }

    /**
     * @return the ques2
     */
    public String getQues2() {
        return ques2;
    }

    /**
     * @param ques2 the ques2 to set
     */
    public void setQues2(String ques2) {
        this.ques2 = ques2;
    }

    /**
     * @return the ques3
     */
    public String getQues3() {
        return ques3;
    }

    /**
     * @param ques3 the ques3 to set
     */
    public void setQues3(String ques3) {
        this.ques3 = ques3;
    }

    /**
     * @return the ques4
     */
    public String getQues4() {
        return ques4;
    }

    /**
     * @param ques4 the ques4 to set
     */
    public void setQues4(String ques4) {
        this.ques4 = ques4;
    }
    
}
