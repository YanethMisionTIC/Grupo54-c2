/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

/**
 *
 * @author YanethM
 */
public class ProductClass {

    private String code = "";
    private String productName = "";
    private String brand = "";
    private String presentationType = "";
    private String[] nutritionalTable = {};
    private String originProduct = "";
    private String typePackaging = "";
    private String description = "";
    private boolean avaiable = false;
    private int stock = 0;
    private float price = 0.0f;
    private String invoceDate = "";

    //1. Insertar el constructor de la clase
    public ProductClass(String code, String productName, String brand, String presentationType, String[] nutritionalTable, String originProduct, String typePackaging, String description, boolean avaiable, int stock) {
        this.code = code;
        this.productName = productName;
        this.brand = brand;
        this.presentationType = presentationType;
        this.nutritionalTable = nutritionalTable;
        this.originProduct = originProduct;
        this.typePackaging = typePackaging;
        this.description = description;
        this.avaiable = avaiable;
        this.stock = stock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getInvoceDate() {
        return invoceDate;
    }

    //2. Insertar los getter y setter de los atributos
    public void setInvoceDate(String invoceDate) {
        this.invoceDate = invoceDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPresentationType() {
        return presentationType;
    }

    public void setPresentationType(String presentationType) {
        this.presentationType = presentationType;
    }

    public String[] getNutritionalTable() {
        return nutritionalTable;
    }

    public void setNutritionalTable(String[] nutritionalTable) {
        this.nutritionalTable = nutritionalTable;
    }

    public String getOriginProduct() {
        return originProduct;
    }

    public void setOriginProduct(String originProduct) {
        this.originProduct = originProduct;
    }

    public String getTypePackaging() {
        return typePackaging;
    }

    public void setTypePackaging(String typePackaging) {
        this.typePackaging = typePackaging;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvaiable() {
        return avaiable;
    }

    public void setAvaiable(boolean avaiable) {
        this.avaiable = avaiable;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    //3. Método que muestra la información del producto
    public void ShowProductInformation() {
        System.out.println("|-----------------------------------------------------------------------|");
        System.out.println("|                     Factura MisionTIC Supermarket                     |");
        System.out.println("|-----------------------------------------------------------------------|");
        System.out.println("|       Producto: " + getProductName()+                 "|");
        System.out.println("|       Marca: " + getBrand()+                 "|");
        System.out.println("|       Nutritional Table: " + getNutritionalTable()+                 "|");
        System.out.println("|       Description:" + getDescription()+                 "|");
        System.out.println("|       Price:" + getPrice()+                 "|");
        System.out.println("------------------------------------------------------------------------");
    }

    //4. Método que muestra la factura del producto
    public void ProductInvoce() {
        System.out.println("|-----------------------------------------------------------------------|");
        System.out.println("|                     Factura MisionTIC Supermarket                     |");
        System.out.println("|                     Fecha compra:" + getInvoceDate()+        "|");
        System.out.println("|-----------------------------------------------------------------------|");
        System.out.println("|       Producto: " + getProductName()+                 "|");
        System.out.println("|       Marca: " + getBrand()+                 "|");
        System.out.println("|       Cantidad de productos: " +                 "|");
        System.out.println("|       Price:" + getPrice()+                 "|");
        System.out.println("|       Total:" +                 "|");
        System.out.println("------------------------------------------------------------------------");
    }
}
