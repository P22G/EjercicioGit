package git;

public class git3 {
	public static void main (String[] args) {
		double movil= 221.77;
    double impuesto=0.21;
    
    double incrementacion;
    double preciototal;
    incrementacion=((double)movil*impuesto);
    
    preciototal=((double)movil+incrementacion);
    
    System.out.println("El precio del movil mas iva es "+preciototal+" euros");
	}
}
