package clase4;

public class metodoCodificar {
	
		char abecedario []= new char [27]; //{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		String palabra;
		
		
		
		
		public char[] getAbecedario() {
			return abecedario;
		}


		public void setAbecedario(char[] abecedario) {
			this.abecedario = abecedario;
		}


		public String getPalabra() {
			return palabra;
		}


		public void setPalabra(String palabra) {
			this.palabra = palabra;
		}


		public metodoCodificar() {};
		
			public void Desplazar(int desplazar) {
			
				System.out.println("palabra original: " + palabra);
				for(int indice =0; indice<palabra.length();indice++) {
				char caracter = palabra.charAt(indice);
				
				for (int i = 0; i<abecedario.length; i++) {	
					if(caracter == abecedario[i]) {
						palabra = palabra.replace(caracter, abecedario[i+desplazar]);		
					}
				}
			}System.out.println("la palabra codificada es: " + palabra);
				
		}
	}

