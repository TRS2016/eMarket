package logic;

import model.Product;

public class ShoppingCartItem implements java.io.Serializable{
    private int identifiant;
    private int quantite;
    private Product produit;
    
    public ShoppingCartItem() {
        this.produit = new Product();
    }
    
    /** Getters */
    public int getIdentifiant() {
        return identifiant;
    }
    public int getQuantite() {
        return quantite;
    }
    public Product getProduit() {
        return produit;
    }
    
    /** Setters */
    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    public void setProduit(Product produit) {
        this.produit = produit;
    }
    
}
