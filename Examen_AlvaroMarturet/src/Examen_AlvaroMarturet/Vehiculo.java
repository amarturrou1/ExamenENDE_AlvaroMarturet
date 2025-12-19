package Examen_AlvaroMarturet;

public class Vehiculo {
	String matricula;
	String marca;
	String modelo;
	double preciohora;
	//preciohora
	
	public Vehiculo(String matricula, String marca, String modelo, double preciohora) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.preciohora = preciohora;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreciohora() {
		return preciohora;
	}

	public void setPreciohora(double preciohora) {
		this.preciohora = preciohora;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", preciohora="
				+ preciohora + "]";
	}
	
	
}
