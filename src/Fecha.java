
public class Fecha {
	private int dia;
	private int mes;
	private int anno;
	
	/*
	 * Constructor primera por defecto creada por nosotros
	 * el segundo para que se pueda crear a tu medida.
	 */
	
	public Fecha(){
		dia=28;
		mes=3;
		anno=2000;
	}
	
	public Fecha(int dia,int mes,int anno){
		this.dia=dia;
		this.mes=mes;
		this.anno=anno;
	}
	
	public Fecha(String fecha){
		
		String [] aux= fecha.split(";");
		this.dia= Integer.parseInt(aux[0]) ;
		this.mes= Integer.parseInt(aux[1]) ;
		this.anno= Integer.parseInt(aux[2]) ;
		new Fecha(Integer.parseInt(aux[0]),Integer.parseInt(aux[1]),Integer.parseInt(aux[2]));
	}
	/**
	 * 
	 */
	public int getDia(){
		return dia;
	}
	public int getMes(){
		return mes;
	}
	public int getanno(){
		return anno;
	}
	
	/**
	 * Modificar los datos
	 */
	
	public void setDia(int dia){
		this.dia=dia;
	}
	public void setMes(int mes){
		this.mes=mes;
	}
	public void setAnno(int anno){
		this.anno=anno;
	}
	
	/**
	 * Mostrar los datos
	 */
	
	public String toString(){
		return "el dia "+dia+" Mes "+mes+ " año "+anno;
	}
}
