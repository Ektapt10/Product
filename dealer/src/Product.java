package dealer;

public class Product {
             
    String name;
    int price;
    String prop;
    
    
    public Product(){
    }
    
	public Product(String name, int price, String prop) {
	
		this.name=name;
		this.price=price;
		this.prop=prop;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public String getProp() {
		return prop;
	}

	public void setProp(String prop) {
		this.prop = prop;
	}

	public void setPrice(int price) {
		this.price = price;
	}
    
    public void printNameprice(){
    	System.out.println("NAme of product:"+ name +  "\nPrice:" + price + "desc:" +prop);
    	
    }
     
    public void printNameprice(String dummy){
    	System.out.println("NAme of product:"+ name +  "\nPrice:" + price + "desc:" +prop+dummy);
    	
    	
    }
}
               
