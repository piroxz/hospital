
public class Empleado {
	private String nombre;
	private String DNI;
	private float sueldo;
	private String direccion;
	private Fecha fechaAlta;
	/*
	 * 
	 */
	public Empleado  (){
		nombre = "Manolo";
		DNI = "11111111y";
		sueldo = 1000;
		direccion = "ni Idea";
		fechaAlta = new Fecha(2,2,-1);
	}
	
	public Empleado(String nombre,String DNI,float sueldo,String direccion, Fecha fechaAlta){
		this.nombre = nombre;
		this.DNI= DNI;
		this.sueldo = sueldo;
		this.direccion = direccion;
		
		this.fechaAlta = fechaAlta; 
	}
	
	
	/**
	 * Método que devuelve: 
	 * @return nombre del empleado
	 */
	
	
	public String getNombre(){
		return nombre;
	}
	
	public String getDNI(){
		return DNI;
	}
	public float getSueldo(){
		return sueldo;
	}
	
	private boolean controlSueldo(float sueldo){
		boolean aux=false;
		if (sueldo>0 && sueldo<6000)
			aux= true;
		return aux;
	}
	
	public boolean setSueldo(float sueldo){
		boolean aux=false;
		if (controlSueldo(sueldo)){
			this.sueldo = sueldo;
			aux=true;
		}
		return aux;	
	}
	
	public String getDireccion(){
		return direccion;
	}
	
	public void setDireccion(String direccion){
		this.direccion=direccion;
	}
	
	public Fecha getFechaAlta(){
		return fechaAlta;
	}
	/**
	 * 
	 * otra opcion de mostrarla
	 */
	public String getFechaAltatexto(){
		return fechaAlta.toString();
	}
	
	
	public String toString(){
		String cadena = nombre +";"+ DNI +";"+ String.valueOf(sueldo)+";" + direccion +";"+ fechaAlta;  
		return cadena;
	}
	
	public String toStringBonito(){
		String cadena = "Nombre: "+ nombre + " DNI: "+ DNI + " Sueldo: "+ String.valueOf(sueldo) + " Direccion: "+ direccion + " Fecha Alta: "+ fechaAlta;  
		return cadena;
	}
	
}
