<<<<<<< HEAD

=======
package excepciones_Iv2;
>>>>>>> 7aa224ca3b047e437b404b2f1687769aef99f1de

import	javax.swing.JOptionPane;

public class Aleatorios {
	
	public static void main(String[] args) {

		//TODO Auto-generated method stub

		int elementos=Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos de la matriz"));
<<<<<<< HEAD
		
		int num_aleat[]=new int[elementos];
		
		for(int i=0;i<num_aleat.length;i++){
			num_aleat[i]= (int)(Math.random()*100);

		}
		for(int elem: num_aleat) {
			System.out.println(elem);
		}
	}
=======

		int num_aleat[]=new int[elementos];

		for(int i=0;i<num_aleat.length;i++){

			num_aleat[i]=(int)(Math.random()*100);

		}
		
		for(int elem: num_aleat) {

			System.out.println(elem);

		}

	}

>>>>>>> 7aa224ca3b047e437b404b2f1687769aef99f1de
}