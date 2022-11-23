package org.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "city")
@XmlAccessorType(XmlAccessType.FIELD)
public class CityJAXB {
    @XmlElement
    private String name;
    @XmlElement
    private String mes;
    public CityJAXB (){}
    public CityJAXB(String name, String mes){
        this.name = name;
        this.mes = mes;
    }
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public String getMes(){return mes;}
    public void setMes(String mes){this.mes = mes;}

    @Override
    public String toString (){
        return "CityJAXB{" +
                "name= " + name + '\''+
                ", mes='" + mes + '\'' +
                "}";
    }

}
