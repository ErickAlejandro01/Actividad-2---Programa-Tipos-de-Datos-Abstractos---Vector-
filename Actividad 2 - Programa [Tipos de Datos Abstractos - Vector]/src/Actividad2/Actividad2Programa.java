package Actividad2;
import java.util.Arrays;
import java.util.Scanner;

public class Actividad2Programa {
	int edades[];
	Scanner e = new Scanner(System.in);
	public Vector Especial()  {
		return null;}
	public Vector Especial(int tamaño) {
		this.edades = new int [tamaño];
		return null;
	}
	public int llenarVector() {
		for(int i = 0; i < edades.length; i++) {
			System.out.print("Ingresar Edad" + (i+1) + ":");
			edades[i]= e.nextInt();
		}
		return 0;
		}
		public int obtenerlaPosicionInicio() {
			return 0;
		}
		public int obtenerlaPosicionFinal() {
			return edades.length-1;
		}
		public int obtenerlaCantidadDeElementos() {
			return edades.length;
		}
		public int mostrarPrimerElemento(){
			return edades[0];
		}
		public int mostrarUltimoElemento(){
			return edades[edades.length-1];
		} 
		public void invrementarTamaño(int nuevoTamaño) {
			System.out.println("El tamaño Deve Ser mayor al actual" + edades.length);
	
			if(nuevoTamaño<= edades.length) {
				
			}
		
		int aux[] = new int [edades.length];
		for (int i = 0; i < edades.length; i++ ) {
			aux[i] =edades[i];		
		}
	
		edades = new int [nuevoTamaño];
		for (int i = 0; i < aux.length; i++ ) {
			edades[i] = aux[i];		
		}	
		}		
	public void mostrarVector() {
		System.out.println(Arrays.toString(edades));
	}

	public void insetrarUnElemento() {
		System.out.println("Dijite el elemento a integrar");
		int numero = e.nextInt();
		int sitio_num=0;
		if (sitio = edades.length);
		else (edades = new edades);
	}
	public void eliminarUnEleemnto() {
		System.out.println("Dijite el elemento a integrar");
		int numero = e.nextInt();
		int sitio_num=-1;
		if (sitio = edades.length);
		else (edades = new edades);		
	}
	public void Invertir El Vector() {
		Char[] invertir = edades.clone();
		int=e;
		for(e=edades.toString())
			
		
	}

 
	
	
	
	
	
	
	
	
	
	}
