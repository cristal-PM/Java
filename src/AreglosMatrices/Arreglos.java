package AreglosMatrices;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[17];
		for (int c=0;c<numeros.length;c++) {
			  numeros[c] = (int) (Math.random()*20)+1;}
		imprimir(numeros);
		mayor(numeros);
		menor(numeros);
		primo(numeros);
		par(numeros);
		ascendente(numeros);
		promedio(numeros);
		suma(numeros);
	}
	public static void imprimir(int []n) {
		for (int c=0;c<n.length;c++)
			System.out.print( n[c]+" " );
	}
	public static void mayor(int []n) {
		int m = n[0];
		for (int c = 1; c < n.length; c++) {
			if (n[c] > m) {
				m = n[c];
			}
		}
		System.out.println("El numero mayor es: " + m);
	}
	public static void menor(int []n) {
		int me = n[0];
		for (int c = 1; c < n.length; c++) {
			if (n[c] < me) {
				me = n[c];
			}
		}
		System.out.println("El numero menor es: " + me);
	}
	 public static void primo(int[]n) {
		
		for(int c=0;c<n.length;c++) {
			int div=0;
			for(int c1=1 ; c1<=n[c] ;c1++) {
				if(n[c]%c1==0) {
					div++;
				}
				
			}
			if(div==2) {System.out.print(" Numero primo: "+n[c]);}
		}
		System.out.println();
		}
	 public static void par(int[]n) {
			
			for(int c=0;c<n.length;c++) {
				if(n[c]%2==0) {
					System.out.print(" Numero par: "+n[c]);	
				}
			}
			System.out.println();
			}    
	  
	 public static void ascendente(int[]n) {
			int temp=0;
			System.out.print("Orden ascendente:"  );
		 for(int i=0;i<n.length;i++) {
		      for(int j=i+1;j<n.length;j++) {
		        if(n[i] > n[j]) {
		          temp = n[i];
		          n[i] = n[j];
		          n[j] = temp;
		        }
		      
		      }
		      System.out.print(" "+n[i]);
		    }
			}  
	 public static void promedio(int[]n) {
			int suma=0;
			double prom=0;
			for(int c=0;c<n.length;c++) {
				suma =suma+n[c];
			}
			prom=suma/n.length;
			System.out.println(" La suma es :"+suma+" El promedio es:"+prom);
			}  
	 public static void suma(int[]n) {
			int suma=0;
			
				suma=n[0]+n[n.length-1];
			
			System.out.println(" La suma es :"+suma);
			}  
	 }
	


