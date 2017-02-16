import java.util.Scanner;

public class Tester {
	public static void cambiarSueldo(Empleado empleado){
		Scanner lector = new Scanner(System.in);
		boolean aux = false;
		do{
			System.out.println("Introduce nuevo salario");
			float sueldo = lector.nextFloat();
			aux = empleado.setSueldo(sueldo);
			if (!aux)
				System.out.println("Sueldo no válido");;
			
		}while(!aux);
	}
	
	

	public static void main (String [] args){
		Fecha fecha=new Fecha(3,5,1990);
		System.out.println(fecha);
		Empleado empleado1 = new Empleado();
		Empleado Daniel;
		boolean aux;
		Scanner lector = new Scanner(System.in);

		System.out.println(empleado1);
		//System.out.println(Daniel.toString());
		//System.out.println(empleado1.toStringBonito());
		}
}
