package colecciones.mapas;

import java.util.Objects;

//este ejercicio es de arraylist
public class Carta implements Comparable {
	String[] valores= {"as","dos","tres","cuatro","cinco","seis","siete","sota","caballo","rey"};
	String[] palos= {"oro","copa","espadas","bastos"};
	String valor;
	String palo;
	
	
	Carta(String v,String p){
		this.valor=v;
		this.palo=p;
	}
	
	Carta(){
		this.valor=generaValor();
		this.palo=generaPalo();
	}
	
	
	public String generaValor(){
		int posicion= (int) (Math.random()*10);
		return valores[posicion];
	}
	public String generaPalo(){
		int posicion= (int) (Math.random()*4);
		return palos[posicion];
	}

	public String getValor() {
		return valor;
	}

	public String getPalo() {
		return palo;
	}

	@Override
	public String toString() {
		return "Carta [valor=" + valor + ", palo=" + palo + "]";
	}

	
	//generate equals: de palo y valor
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return Objects.equals(palo, other.palo) && Objects.equals(valor, other.valor);
	}

	//también podemos hacer el equals a mano:
	
	
	/*public boolean equals(Object obj) {
		Carta other = (Carta) obj;
		if (this.palo.equals(other.getPalo()) && this.valor.equals(other.getValor())    )
			return true;
		else
			return false;
	}*/
	
	
	//para poder usar el compareTo ponemos "implements Comparable"
	
	@Override
	public int compareTo(Object obj) {
		Carta car= (Carta) obj;
		//si los palos son distintos procede a ordenar por palo
		if (!this.palo.equals(car.getPalo()) )
			return this.getPalo().compareTo(car.getPalo());
		//si los palos son iguales, procede a ordenar por valor
		else
			return this.getValor().compareTo(car.getValor());
	}
	
	
}
