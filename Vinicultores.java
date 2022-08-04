class Vinicultores {
	public static void main(String[] args){
		char tipoUva;
		byte tamanioUva;
		float precioUva,ganancia;
		int kilosUva;
		
		System.out.print("Ingrese el tipo de uva (A o B) : ");
		tipoUva = leerChar();
		
		System.out.print("Ingrese el tamanio de la uva : ");
		tamanioUva = leerByte();
		
		System.out.print("Ingrese el precio de la uva : ");
		precioUva = leerFloat();
		
		System.out.print("Ingrese los kilos de uva: ");
		kilosUva = leerInt();
		
		ganancia = calcularGanancia(tipoUva,tamanioUva,precioUva,kilosUva);
		System.out.print("La ganancia total del embarque es de : $" + ganancia);
	}
	
	static float calcularGanancia(char tipo, byte tamanio, float precioInicial, int kilos){
		float ganancia,precio;
		
		if(tipo == 'A'){
			if(tamanio == 1){
				precio = precioInicial + 20f;
			} else{
				precio = precioInicial + 30f;
			}
		} 
		else{
			if(tamanio == 1){
				precio = precioInicial - 30f;
			} else{
				precio = precioInicial - 50f; 
			}
		}
		ganancia = kilos * precio;
		return ganancia;
	}
	static char leerChar(){
		char c = System.console().readLine().charAt(0);
		return c;
	}
	static int leerInt(){
		int i = Integer.parseInt(System.console().readLine());
		return i ;
	}
	static float leerFloat(){
		float f = Float.parseFloat(System.console().readLine());
		return f ;
	}
	static byte leerByte(){
		byte b = Byte.parseByte(System.console().readLine());
		return b ;
	}
}