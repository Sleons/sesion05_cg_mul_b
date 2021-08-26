package sesion05_cg_mul_b;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner opc = new Scanner (System.in);
		// TODO Auto-generated method stub
		// Defina y asigne dos objetos, un Cuadrado y una circunferencia
		int op;
		
		System.out.println("Digite 1 para cuadrado o 2 para circunferencia");
		op = opc.nextInt();
		 
		if(op ==1) {
		System.out.println("Digite las unidades que se va a transladar el cuadrado (x,y)");
		

		}
		
		if(op ==2) {
			System.out.println("dos");
		}
		
		
		
	
		
	}
class Coord{
	 private int x,y;
	 public void setX(int x) {
		 this.x =x;}
	 
	 public void setY(int y) {
		 this.y=y;
	 }
	 
}

class Cuadrado {
	private Coord c;
	private int lado;
	public Cuadrado(Coord c, int lado) {
		this.c=c;
		this.lado = lado;
	}
	public void Traslación() {  //complete los parametoros requeridos
	 
	}
	
	
	public void Rotación() {
	
	}
	

	public void Escalado() {
		
	}
}

class Circunferencia{
	Coord c;
	float radio;
	
public void Traslación() {  //complete los parametoros requeridos
		
	}
	
	
	public void Rotación() {
	
	}
	

	public void Escalado() {
		
	}
}

}
