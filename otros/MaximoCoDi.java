/**
 * Cálculo del Máximo Comun Divisor de 3 número
 * con el algoritmo de Euclides,
 * si les sirve ocupenlo
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author @xkanan
 * */
 public class MaximoCoDi{
	 
		private int NumeroMayor=0, 
		            NumeroMenor=0;
		
		public MaximoCoDi(){
			
		}
			
		public MaximoCoDi(int numero1, int numero2){
			if(numero1>numero2){
				this.NumeroMayor = numero1;
				this.NumeroMenor = numero2;
			}else{
					this.NumeroMayor = numero2;
					this.NumeroMenor = numero1;
			}
		}
		
		public int resultadoMaximo(){
			int resultDivi1=0, 
			    resultDivi2=0;
			
				do{
					resultDivi1 = NumeroMayor % NumeroMenor;
					if(resultDivi1!=0){
						resultDivi2 = NumeroMenor % resultDivi1;
					}else{ 
						return NumeroMenor;
					}
						NumeroMayor = NumeroMenor;
						NumeroMenor = resultDivi1;
				  }while(resultDivi2!=0);
				
				return resultDivi1;
		}
		
			
		public void pedirDatos(){
			int primerNumero=0, 
				segundoNumero=0,
				tercernumero=0;
				
				BufferedReader almacen = new BufferedReader(new InputStreamReader(System.in));
				MaximoCoDi nuevoCalculo;
				
				    
					System.out.println("Cálculo del Maximo Común Divisor");
				
				try{
					System.out.println("Introduce el primer Número");
					primerNumero=Integer.parseInt(almacen.readLine());
					
						
					System.out.println("Introduce el segundo Número");
					segundoNumero = Integer.parseInt(almacen.readLine());
					
					System.out.println("Introduce el tercer numero");
					tercernumero = Integer.parseInt(almacen.readLine());
				
					
				  }catch(IOException e){
						System.out.println("A ocurrido un error de tipo "+e);		
					
				  }
				  catch(NumberFormatException en){
							System.out.println("Error en: "+en);
							//Lo he colocado para poder seguir probando
							nuevoCalculo = new MaximoCoDi();
									nuevoCalculo.pedirDatos();
									
				  }
						nuevoCalculo = new MaximoCoDi(tercernumero, 
									   new MaximoCoDi(primerNumero, segundoNumero).resultadoMaximo());
									   				
						System.out.println("El resultado es "+ nuevoCalculo.resultadoMaximo());
					
		}
			
		 public static void main(String irv[]){
					MaximoCoDi ejecutar = new MaximoCoDi();
							   ejecutar.pedirDatos();
							   
		}
	 }
