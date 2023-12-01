package u3.entregable;

import java.util.Scanner;
import java.util.Random;

public class Ej1_entregable {
	
	public static int[] creaBomboNumeros(int numBolas, Random random) {
		
		int[] numTotales = new int [numBolas] ;
		
		for(int i = 0 ; i<numTotales.length ; i++) {
			
			numTotales[i] = random.nextInt(99999)+1;
			
		}
		
		return numTotales;

	}
	
	public static String[] creaBomboPremios(int numPremios) {
		
		String[] premiosTotales = new String[numPremios];
		
		for(int i = 0 ; i<premiosTotales.length ; i++) {
			if(i==0){
				premiosTotales[i] = "gordo" ;
			}
			if(i==1){
				premiosTotales[i] = "segundo" ;
			}
			if(i==2){
				premiosTotales[i] = "tercero" ;
			}
			if(i>2 && i<5){
				premiosTotales[i] = "cuarto" ;
			}
			if(i>4 && i<13){
				premiosTotales[i] = "quinto" ;
			}
			if(i>12){
				premiosTotales[i] = "pedrea";
			}
			
		}
		
		return premiosTotales;
		
	}
	
	public static String dameNumero(int[] bombo, Random random){
	
		int num = random.nextInt(bombo.length);
		
		String numeroFormato = String.format("%05d", num);
		
		return numeroFormato;
	
	}
	
	public static String damePremio(String[] bombo, Random random) {
		
		String premio = "";
		
		int i = random.nextInt(0,1807);
				
			if(i==0){
				premio = "gordo" ;
			}
			if(i==1){
				premio = "segundo" ;
			}
			if(i==2){
				premio = "tercero" ;
			}
			if(i>=3 && i<=4){
				premio = "cuarto" ;
			}
			if(i>=5 && i<=12){
				premio = "quinto" ;
			}
			if(i>12){
				premio = "pedrea";
			}
			
		
		
		return premio;
		
	}
	
	public static void main (String[]args) {	
		
		Random random = new Random();
		Scanner sc = new Scanner (System.in);
		int numBolas = 99999;
		int numPremios = 1807;
		int[] bomboNumeros = new int[numBolas];
		String[] bomboPremios = new String[numPremios];
		String decimo = "0" ;
		

		
		creaBomboNumeros(numBolas, random);
		creaBomboPremios(numPremios);
		
		for(int i = 0 ; i<numPremios ; i++) {
			System.out.println("Número: "+dameNumero(bomboNumeros,random)+" agraciado con: "+damePremio(bomboPremios,random));
		}
		
		do {
		System.out.println("Introduzca su décimo con todas las cifras:");
		decimo = sc.next();
		}while(!(decimo.length()==5));
		
		if(decimo.equals(bomboPremios)) {
			System.out.println("Agraciado con: "+damePremio(bomboPremios,random));
		}else {
			System.out.println("No premiado");
		}
	}

}
