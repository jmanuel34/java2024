package modelo;

public class CustomObject {

	// Class 1
	// Custom class with custom property
	// It takes and stores custom objects

	 
	     // Class data member 
	    private String customProperty;
	    private Integer valor;
	 
	    // Method 
	    public CustomObject(String property, Integer valor) {
	        this.customProperty = property;
	        this.valor= valor;
	    }
	 
	    // Getter 
	    public String getCustomProperty() {
	        return this.customProperty;
	    }

		public Integer getValor() {
			return valor;
		}

		public void setValor(Integer valor) {
			this.valor = valor;
		}
	    
	}
	 
