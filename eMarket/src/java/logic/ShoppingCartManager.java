package logic;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import model.Product;

@ManagedBean
@ApplicationScoped
public class ShoppingCartManager implements java.io.Serializable{
    private ArrayList<ShoppingCartItem> panier;
    private Product prodToAdd;

    /** Setters */
    public void setPanier(ArrayList<ShoppingCartItem> panier) {
        this.panier = panier;
    }
     public void setProdToAdd(Product prodToAdd) {
        this.prodToAdd = prodToAdd;
    }
    
    /** Getters */
    public ArrayList<ShoppingCartItem> getPanier() {
        return panier;
    }
    public Product getProdToAdd() {
        return prodToAdd;
    }
    
    public ShoppingCartManager() {
        this.panier = new ArrayList<ShoppingCartItem> ();
        this.prodToAdd = new Product();
    }
    
    @PostConstruct
    public void initCart() {
        ShoppingCartItem SCI = new ShoppingCartItem();
        Product P = new Product();
        P.setName("Pomme");
   
     
        SCI.setQuantite(2);
        SCI.setProduit(P);
        this.panier.add(SCI);
        
        
    }
    public String addToCart (){
        ShoppingCartItem S = new ShoppingCartItem();
        S.setProduit(prodToAdd);
        this.panier.add(S);
        return "toshoppingcart2";
    } 
    
    
}
