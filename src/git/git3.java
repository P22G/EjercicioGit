package git;

public class git3 {
	public static void main (String[] args) {
		double movil= 284.07;
    double impuesto=0.22;
    
    double incre;
    double preT;
    incre=((double)movil*impuesto);
    
    preT=((double)movil+incre);
    
    System.out.println("El precio del movil mas iva es "+preT+" euros");
	}
}
