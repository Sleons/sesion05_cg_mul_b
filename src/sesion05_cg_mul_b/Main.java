package sesion05_cg_mul_b;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner op1 = new Scanner (System.in);
		Scanner opc1= new Scanner (System.in);
		Scanner corx1 = new Scanner (System.in);
		Scanner cory1 = new Scanner (System.in);
		Scanner orgx1 = new Scanner (System.in);
		Scanner orgy1 = new Scanner (System.in);
		Scanner lado1 = new Scanner (System.in);
		Scanner porc1 = new Scanner (System.in);
		Scanner rot1 = new Scanner (System.in);
		Scanner rad1 = new Scanner (System.in);
		
		Coord coorx = new Coord();
		Coord coory = new Coord();
		Cuadrado  Cuad = new Cuadrado(0);
		Circunferencia Cir = new Circunferencia(0);

		float op,corx,cory,opc,orgx,orgy,lado, porc,rot;
		
		System.out.println("Digite 1 para cuadrado o 2 para circunferencia");
		op = op1.nextFloat();
		 
		if(op ==1) {
		
		System.out.println("Digite 1 para traslación");
		System.out.println("Digite 2 Escalado");
		System.out.println("Digite 3 Rotación");
		opc= opc1.nextFloat();
		
		
		//TRASLACION
		if (opc == 1) {
			
		System.out.println("Digite la coordenada de la esquina inferior izq del cuadrado en x");
		orgx = orgx1.nextFloat();
		
		System.out.println("Digite la coordenada de la esquina inferior izq del cuadrado en y");
		orgy = orgy1.nextFloat();
		
		System.out.println("Digite las unidades que se va a transladar el cuadrado en x");
		corx = corx1.nextFloat();
		
		coorx.setX(corx);
		
		System.out.println("Digite las unidades que se va a transladar el cuadrado en y");
		cory = cory1.nextFloat();
		
		coory.setY(cory);
		
		Cuad.Traslación(orgx,orgy,corx,cory);
		
		System.out.println("Las coordenadas del cubo sin trasladarse son ("+orgx+","+orgy+")");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
		System.out.println("Las coordenadas del cubo al trasladarse son  ("+Cuad.trasX()+","+Cuad.trasY()+")");
		}
		
		
		
		//ECALADO
		if(opc ==2) {
		
		System.out.println("Digite la coordenada de la esquina inferior izq del cuadrado en x");
		orgx = orgx1.nextFloat();
			
		System.out.println("Digite la coordenada de la esquina inferior izq del cuadrado en y");
		orgy = orgy1.nextFloat();
		
		System.out.println("Digite la longitud de los lados del cuadrado");
		lado = lado1.nextFloat();
		
		System.out.println("Digite el porcentaje al que quiere que sea escalado el cuadrado (100%=1:1)");
		porc = porc1.nextFloat();
		
		Cuad.Escalado(orgx,orgy,lado,porc);
		
		System.out.println("El cuadrado sin escalar:");
		System.out.println(Cuad.e1x()+","+Cuad.e1y()+"__________"+Cuad.e2x()+","+Cuad.e2y());
		System.out.println("|                            |");
		System.out.println("|                            |");
		System.out.println("|                            |");
		System.out.println("|                            |");
		System.out.println("|                            |");
		System.out.println("|                            |");
		System.out.println("|                            |");
		System.out.println("|                            |");
		System.out.println(Cuad.e1x()+","+Cuad.e3y()+"__________"+Cuad.e3x()+","+Cuad.e3y());
		
		System.out.println("El cuadrado ecalado:");
		System.out.println(Cuad.e1xf()+","+Cuad.e1yf()+"__________"+Cuad.e2xf()+","+Cuad.e2yf());
		System.out.println("|                            |");
		System.out.println("|                            |");
		System.out.println("|                            |");
		System.out.println("|                            |");
		System.out.println("|                            |");
		System.out.println("|                            |");
		System.out.println("|                            |");
		System.out.println("|                            |");
		System.out.println(Cuad.e1xf()+","+Cuad.e3yf()+"__________"+Cuad.e3xf()+","+Cuad.e3yf());
		
		}
		
		
		if(opc == 3) {
		int v=0;
		float aux=0;
			
		System.out.println("El procedimiento se realizará teniendo en cuenta las coordenadas inferiores del cuadrado");
		System.out.println("La coordenada de la izquierda se mantendrá intacta");
		System.out.println("La coordenada de la derecha girará al rededor de la izquierda.");
		
		System.out.println("Digite la coordenada de la esquina inferior izq del cuadrado en x");
		orgx = orgx1.nextFloat();
		
		System.out.println("Digite la coordenada de la esquina inferior izq del cuadrado en y");
		orgy = orgy1.nextFloat();
		
		
		System.out.println("Digite la longitud de los lados del  cuadrado");
		lado = lado1.nextFloat();
		
		System.out.println("Digite 1 para girarlo 90 grados");
		System.out.println("Digite 2 para girarlo 120 grados");
		System.out.println("Digite 3 para girarlo 270 grados");
		System.out.println("Digite 4 para girarlo 360 grados");
		rot = rot1.nextFloat();
		aux = orgx+lado;

		
		if(rot==1) {
			
		v=1;}
		else if (rot==2) {
			v=2;
			aux = orgx+lado;
		}
		else if (rot ==3) {
			  v=3;
		}
		else if (rot == 4) {
			System.out.println("Coordenadas de las esquinas inferiores");
			System.out.println("Antes de la rotación:");
			System.out.println(orgx +"," + orgy+"___"+ aux +","+orgy);
			System.out.println("Despues de la rotación.");
			System.out.println(orgx +"," + orgy+"___"+ aux +","+orgy);
			System.out.println("______________________________");
			
		}
		else {
			System.out.println("error");
		}
		
		Cuad.Rotación(orgx,orgy,lado,v);
	
		System.out.println("Coordenadas de las esquinas inferiores");
		System.out.println("Antes de la rotación:");
		System.out.println(orgx +"," + orgy+"___"+ aux +","+orgy);
		System.out.println("Despues de la rotación.");
		System.out.println(orgx +"," + orgy+"___"+Cuad.Rotx()+","+Cuad.Roty());
		
		
		//Circunferencia
		}
		}
		
		if(op == 2) {
			
			System.out.println("Digite 1 para traslación");
			System.out.println("Digite 2 Escalado");
			System.out.println("Digite 3 Rotación");
			float rad;
			opc= opc1.nextFloat();
			
			
			//TRASLACIÓN
			if (opc == 1) {
			
			
			System.out.println("Digite el radio del circulo");
			rad= rad1.nextFloat();
			
			System.out.println("Digite la coordenada del centro del circulo en X");
			orgx = orgx1.nextFloat();
				
			System.out.println("Digite la coordenada del centro del circulo en Y");
			orgy = orgy1.nextFloat();
				
			System.out.println("Digite las unidades que se va a transladar el cuadrado en x");
			corx = corx1.nextFloat();
			
			coorx.setX(corx);
			
			System.out.println("Digite las unidades que se va a transladar el cuadrado en y");
			cory = cory1.nextFloat();
			
			coory.setY(cory);
			
			Cir.Traslación(orgx,orgy,corx,cory);
			
			System.out.println("Las coordenadas del centro del circulo sin trasladarse son ("+orgx+","+orgy+")");    
			System.out.println("Con un radio de:"+rad);
			System.out.println("Las coordenadas del centro del circulo al trasladarse son  ("+Cir.trasX()+","+Cir.trasY()+")");
			System.out.println("Con un radio de:"+rad);
		
		}
			if (opc ==2) {
				
			System.out.println("Digite la coordenada del centro del circulo en x");
			orgx = orgx1.nextFloat();
					
			System.out.println("Digite la coordenada del centro del circulo en y");
			orgy = orgy1.nextFloat();
				
			System.out.println("Digite el radio del circulo");
			rad= rad1.nextFloat();
				
			System.out.println("Digite el porcentaje al que quiere que sea escalado el circulo (100%=1:1)");
			porc = porc1.nextFloat();
			
			Cir.Escalado(rad,porc);
			
			System.out.println("Las coordenadas del centro del circulo sin escalado son ("+orgx+","+orgy+")");    
			System.out.println("Con un radio de:"+rad);
			System.out.println("Las coordenadas del centro del circulo al escalarse son  ("+orgx+","+orgy+")"); 
			System.out.println("Con un radio de:"+ Cir.Rad());
		
		  
			}
			
			if (opc ==3) {
			
				System.out.println("No se va a poder pa, buenas noches");
			}
			
		}
	}
static class Coord{ //Se  declara  como una  static class ya que esta dentro de un mismo archivo
	private float x,y;
	 public void setX(float x) {
		 this.x =x;
			 
	 }
	 public float getX() {
		 return x;
	 }
	 
	 public void setY(float y) {
		 this.y=y;
	 }
	 
	 public float getY() {
		 return y;
	 }
}

static class Cuadrado { //Se  declara  como una  static class ya que esta dentro de un mismo archivo
	Coord coorx = new Coord();
	Coord coory = new Coord();
	private float lado,x,y,xf,yf,lad,porc,e1x,e1y,e2x,e2y,e3x,e3y,e1xf,e1yf,e2xf,e2yf,e3xf,e3yf,v,rotx,roty;
	public Cuadrado( float lado) {
		this.lado = lado;
	}
	
	
	//Traslación
	public void Traslación(float x, float y, float corx, float cory) {
		//Cantidad a trasladar
		this.x=x;
		this.y=y;
		//Procedimiento
		xf = x + corx;
		yf = y + cory;
		
		return;
		
	}
	
	public float trasX() {
		return xf;
	}
	
	public float trasY() {
		return yf;
	}
	
	//Rotación
	public void Rotación(float corx, float cory, float lad, int v) {
		this.v =v;
		
		//Procedimiento
		if (v==1) { //90 grados
			rotx = corx;
			roty = cory+lad;
			
			return;
		}
		if (v==2) { //120 grados
			rotx = corx-lad;
			roty = cory;
			return;
		}
	
		if (v==3) { //270 grados
			rotx = corx;
			roty = cory-lad;
			return;
		}
		
		if (v==4) { //360 grados
			rotx = corx;
			roty = cory;
			
			return;
		}
	}
	public float Rotx() {
	return rotx;
		
	}
	
	public float Roty() {
		return roty;
			
		}
	
    //Escalado
	public void Escalado(float corx, float cory,float lad, float porc) {
		//Porcentaje y lados del cuadrado
		this.lad=lad;
		this.porc=porc;
		e1x = corx;
		e1y = cory+lad;
		e2x = corx+lad;
		e2y = cory+lad;
		e3x = corx+lad;
		e3y = cory;
		
		
		xf = (porc/100)*corx;
		yf = (porc/100)*cory;
		e1xf = (porc/100)*e1x;
		e1yf = (porc/100)*e1y;
		e2xf = (porc/100)*e2x;
		e2yf = (porc/100)*e2y;
		e3xf = (porc/100)*e3x;
		e3yf = (porc/100)*e3y;
		
		return;
		}
	public float e1xf() {
		return e1xf;
	}
	public float e1yf() {
		return e1yf;
	}
	public float e2xf() {
		return e2xf;
	}
	public float e2yf() {
		return e2yf;
	}
	public float e3xf() {
		return e3xf;
	}
	public float e3yf() {
		return e3yf;
	}
	public float e1x() {
		return e1x;
	}
	public float e1y() {
		return e1y;
	}
	public float e2x() {
		return e2x;
	}
	public float e2y() {
		return e2y;
	}
	public float e3x() {
		return e3x;
	}
	public float e3y() {
		return e3y;
	}
	}

static class Circunferencia{//Se  declara  como una  static class ya que esta dentro de un mismo archivo
	
	Coord coorx = new Coord();
	Coord coory = new Coord();
	float radio,x,y,xf,yf,porc,rad,radf;
	public Circunferencia ( float radio) {
		this.radio = radio;
	}
	
public void Traslación(float x, float y, float corx, float cory) {
	//Cantidad a trasladar
	this.x=x;
	this.y=y;
	//Procedimiento
	xf = x + corx;
	yf = y + cory;
	
	return;
		
	}
public float trasX() {
	return xf;
}

public float trasY() {
	return yf;
}
//Escalado
public void Escalado(float rad, float porc) {
	this.rad=rad;
	this.porc=porc;
	
	radf = (porc/100)*rad;
	
	return;
	}

public float Rad() {
	return radf;
}


}

}
