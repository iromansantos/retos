/**
 * Bueno me parecio buena idea esto
 * lo hice con el afán de aprender
 * es de un reto muy conocido
 * */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 * @author @XKanan
 * **/

public class Numeros{
	
	BufferedReader alm = new BufferedReader(new InputStreamReader(System.in));
	int numeroACalcular=0;
		/**
		 * Constructor de la clase
		 * */
		public Numeros(){
			
				pedirDatos();
			
			}
		
		/**
		 * M&eacute;todo que pide los datos
		 * */
		private void pedirDatos(){
			String datos="";
				System.out.println("Escriba un numero del 0-999 ó 1000");
				
				try{
					numeroACalcular = Integer.parseInt(alm.readLine());
						
					if(numeroACalcular<=1000 && numeroACalcular>=0){
						
							datos=determinaLetrasNumeros(numeroACalcular);
							System.out.println("--------Sin ordenar más rapido---------");
							System.out.println(datos);
							System.out.println("--------Ordenado ;)--------------------");
							System.out.println(ordenarLetras(datos));
						
						}else{
								System.out.println("El número debe ser menor que 1000 y mayor que 0");
								pedirDatos();
							}
					
				}catch(IOException eio){
							System.out.println("Error desconocido");
							pedirDatos();
					}
				 catch(NumberFormatException enfe){
						
							System.out.println("Escribe un tipo correcto ;)"+enfe);
							pedirDatos();
					 
					 }
				
			
			}
		
		/**
		 * M&eacute;todo que determina las letras que componen del 0 al número actual menor
		 * que 1000
		 * @param stockNumero numero a determinar
		 * @return palabrasMagicas valor que reprenta las letras
		 * */
		private String determinaLetrasNumeros(int stockNumero){
				int cnt=0;
				String palabrasMagicas="";
				
					do{
						palabrasMagicas+=agregarParametro(cnt);
						cnt++;
					}while(cnt<=stockNumero);
					
				return palabrasMagicas;
			
			}
		
		/**
		 * M&eacute;todo que devuelve el tipo de token de acuerdo al n&uacute;mero
		 * @param parametroNumero numero a examinar
		 * @return token Devuelve un valor tipo cadena que es un token asociado al n&uacute;mero
		 * */
			
		private String agregarParametro(int parametroNumero){
			String token="";
			switch(parametroNumero){
				case 0:{
								token="cero";
					}break;
				case 1: {
								token="un";
					}break;
				case 2:{
								token="ds";
					}break;
				case 3:{
								token="t";
					}break;
				case 4:{
								token="a";
					}break;
				case 5:{
								token="i";
					}break;
				case 8:{
								token="h";
					}break;
				case 9:{
								token="v";
					}break;
				case 10:{
								token="z";
					}break;
				case 15:{
								token="q";
					}break;
				case 31:{
								token="y";
					}break;
				case 1000:{
								token="ml";
					}break;
				default:{
								token="";
					}
				}
				
				return token;
			
			}
		
		/**
		 * M&eacute;todo que ordena alfabeticamente a-z
		 * @param cadenaAOrdenar cadena para ordenar
		 * @return cadenaOrdenada valor tipo cadena
		 * */
		private String ordenarLetras(String cadenaAOrdenar){
				String cadenaOrdenada="";
				String cm="";
				for(char letra='a'; letra<='z'; letra++){
					
						for( int l=0; l<cadenaAOrdenar.length();l++){
							
								if(cadenaAOrdenar.charAt(l)==letra){
										cadenaOrdenada+=cm+cadenaAOrdenar.charAt(l);
										cm=", ";
									}
							
							}
					
					}
					
					return cadenaOrdenada;
				
			}
		
		public static void main(String irv[]){
			
				new Numeros();
			}
	
	}
