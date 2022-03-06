package AreglosMatrices;

public class Matrices {
	public static void main(String[] args) {
		int[][] numeros = new int[3][3];
		for (int c=0;c<numeros.length;c++) {
			for(int c1=0;c1<numeros[c].length;c1++)
			  numeros[c][c1] = (int) (Math.random()*20)+1;}
		imprimir(numeros);
		mayor(numeros);
		menor(numeros);
		primo(numeros);
		par(numeros);
		promedio(numeros);
		diagonal(numeros);
		ultimaFila(numeros);
		
	}
	public static void imprimir(int [][]n) {
		for (int c=0;c<n.length;c++) {
			for (int c1=0;c1<n[c].length;c1++) {
			System.out.print( n[c][c1]+" " );}
			System.out.println();}
		System.out.println();
	}
	public static void mayor(int [][]n) {
		int m = n[0][0];
		int cont=0;
		for (int c = 1; c < n.length; c++) {
			for (int c1=0;c1<n[c].length;c1++) {
			if (n[c][c1] > m) {
				m = n[c][c1];
				cont++;
			}}
}
		System.out.println(" El numero mayor es: " + m+" El numero de ocurrecnias es:"+cont);
}
	public static void menor(int [][]n) {
		int m = n[0][0];
		int cont=0;
		for (int c = 1; c < n.length; c++) {
			for (int c1=0;c1<n[c].length;c1++) {
			if (n[c][c1] < m) {
				m = n[c][c1];
				cont++;	
			}}
}
		System.out.println(" El numero menor es: " + m+ " El numero de ocurrencias es:"+cont);
	}
	 public static void primo(int[][]n) {
			
			for(int c=0;c<n.length;c++) {
				for (int c1=0;c1<n[c].length;c1++) {
				int div=0;
				for(int x=1 ; x<=n[c][c1] ;x++) {
					if(n[c][c1]%x==0) {
						div++;
					}
					
				}
				if(div==2) {System.out.print(" Numero primo: "+n[c][c1]);}
			}}
			System.out.println();
			}
		 public static void par(int[][]n) {
				
				for(int c=0;c<n.length;c++) {
					for (int c1=0;c1<n[c].length;c1++) {
					if(n[c][c1]%2==0) {
						System.out.print(" Numero par: "+n[c][c1]);	
					}
				}}
				System.out.println();
				}    
		 public static void promedio(int[][]n) {
				int suma=0;
				int cont=0;
				double prom=0;
				for(int c=0;c<n.length;c++) {
					for (int c1=0;c1<n[c].length;c1++) {
					suma =suma+n[c][c1];
					cont++;
					
				}}
				prom=suma/cont;
				System.out.println(" La suma es :"+suma+" El promedio es:"+prom);
				} 
		 public static void diagonal(int[][] n) {
			 int[] diagoP = new int[n.length];
		        int[] diagoS = new int[n.length];
		         int suma1=0,suma2=0,sumaT=0;        
		        for(int c=0;c<n.length;c++){
		            for(int c1=0;c1<n[c].length;c1++){
		                if(c==c1){
		                    diagoP[c] = n[c][c1];
		                }
		                 
		                if(c+c1 == n.length-1){
		                    diagoS[c] = n[c][c1];
		                }
		            }
		        }
		        for(int i=0;i<diagoP.length;i++) {
		        	suma1=suma1+diagoP[i];
		        }
		        for(int i=0;i<diagoS.length;i++) {
		        	suma2=suma2+diagoS[i];
		        }
		        sumaT=suma1+suma2;
		        System.out.println("Suma Diagonal Principal:"+suma1);
		        
		        System.out.println("Suma Diagonal Secundaria:"+suma2);
		        System.out.println("Suma Total:"+sumaT);
		       }  
		 public static void ultimaFila(int[][]n) {
				int suma=0;
				for(int c=n.length-1;c<n.length;c++) {
					for (int c1=0;c1<n[c].length;c1++) {
					suma=suma+n[c][c1];
				}}
				System.out.println("la suma de la ultima fila es:"+suma);
				}  }
