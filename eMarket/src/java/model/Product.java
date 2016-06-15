package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID ;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SELLING_PRICE")
    private double price;
       
    /**  Le constructeur ne prend pas d'argument */
    public Product() {
    }
    
    /** Getters
     * @return  */
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    
    /** Setters
     * @param value */
    public void setID(final int value) {
        ID = value;
    }
    public void setName(final String value) {
        name = value;
    }
    public void setPrice(final double value) {
        price = value;
    }

    public void setId(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
