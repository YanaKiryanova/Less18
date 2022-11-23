package org.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "name")
@XmlAccessorType(XmlAccessType.FIELD)
public class Name {
    @XmlElement
    private String first_name;
    @XmlElement
    private String last_name;
    @XmlElement
    private String title;

    public Name(){}

    public Name(String first_name, String last_name, String title){
        this.first_name = first_name;
        this.last_name = last_name;
        this.title = title;
    }
    public String getFirst_name(){return first_name;}
    public void setFirst_name(String first_name){this.first_name = first_name;}
    public String getLast_name(){return last_name;}
    public void setLast_name(String last_name){this.last_name = last_name;}

    @Override
    public String toString(){
        return "Name{" +
                "Firstname= '" + first_name + '\''+
                ", Lastname='" + last_name + '\'' +
                ", Title = '" + title +'\''+
                "}";
    }
}
