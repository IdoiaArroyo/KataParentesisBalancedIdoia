package KataParentesis;

public class ParentesisContador implements Contador{

	int contadorParentesis = 0;
	//StringForBalanced cadena;
	
	@Override
	public boolean contador(StringForBalanced cadena) {
		System.out.println(cadena.getData());

		for(int i = 0; i < cadena.getSizeOfData(); i++){
			char positionString = cadena.getCharAt(i);
			//System.out.println(positionString);
			if ( cadena.isOpen(positionString) ){
				contadorParentesis ++;
			}else if ( cadena.isClosed(positionString) ){
				if (contadorParentesis != 0){
					contadorParentesis --;
				}
			}
			//System.out.println(parentesisContador);

		}
		if (contadorParentesis == 0){
			return true;
		}
		return false;
	}
	


	

}
