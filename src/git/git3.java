package git;

public class git3 {
	public static void main (String[] args) {
		double movil= 284.07;
    double impuesto=0.22;
    
    double incrementacion;
    double preciototal;
    incrementacion=((double)movil*impuesto);
    
    preciototal=((double)movil+incrementacion);
    
    System.out.println("El precio del movil mas iva es "+preciototal+" euros");
	}
}
