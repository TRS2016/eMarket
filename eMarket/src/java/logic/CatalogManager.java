package logic;

import facade.ProductFacade;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import model.Product;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import javax.faces.context.FacesContext;
@ManagedBean
@ApplicationScoped

public class CatalogManager implements java.io.Serializable{
    private ArrayList<Product> mylist;
    private int idSaisi;
    private String nomSaisi;
    private double prixSaisi;
      
    @EJB
    private ProductFacade productfacade;

    public void setProductfacade(ProductFacade productfacade) {
        this.productfacade = productfacade;
    }

    public ProductFacade getProductfacade() {
        return productfacade;
    }
    
     public CatalogManager() {
        this.mylist = new ArrayList<Product>();
     }
     /* Methodes */
    @PostConstruct
    public void initCatalog() {          
        mylist.addAll(productfacade.findAll());   
    }
    
    /** Getters
     * @return  */
    public ArrayList<Product> getMylist() {
        return mylist;
    }
    public int getID() {
        return idSaisi;
    }
    public String getNom() {
        return nomSaisi;
    }
    public double getPrix() {
        return prixSaisi;
    }
    
    /** Setters
     * @param value */
    public void SetMylist(ArrayList<Product> value) {
        mylist = value;
    }
    public void setID(int ID) {
        this.idSaisi = ID;
    }
    public void setNom(String name) {
        this.nomSaisi = name;
    }
    public void setPrix(double price) {
        this.prixSaisi = price;
    }
    public String createProduct() {
        Product P = new Product();
        P.setID(getID());
        P.setName(getNom());
        P.setPrice(getPrix());
        this.mylist.add(P);
        productfacade.create(P);
        return "fromcreate-product2";
    }
}
