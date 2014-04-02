package br.com.personalAssist.teste;

import java.util.List;

public class Teste {
	
	
	private String campoTexto1;
	private int campoInt1;
	private double campoDouble1;
	private List<Object> listObj1;
	
	
	public String getCampoTexto1() {
		return campoTexto1;
	}
	public void setCampoTexto1(String campoTexto1) {
		this.campoTexto1 = campoTexto1;
	}
	public int getCampoInt1() {
		return campoInt1;
	}
	public void setCampoInt1(int campoInt1) {
		this.campoInt1 = campoInt1;
	}
	public double getCampoDouble1() {
		return campoDouble1;
	}
	public void setCampoDouble1(double campoDouble1) {
		this.campoDouble1 = campoDouble1;
	}
	public List<Object> getListObj1() {
		return listObj1;
	}
	public void setListObj1(List<Object> listObj1) {
		this.listObj1 = listObj1;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(campoDouble1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + campoInt1;
		result = prime * result
				+ ((campoTexto1 == null) ? 0 : campoTexto1.hashCode());
		result = prime * result
				+ ((listObj1 == null) ? 0 : listObj1.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teste other = (Teste) obj;
		if (Double.doubleToLongBits(campoDouble1) != Double
				.doubleToLongBits(other.campoDouble1))
			return false;
		if (campoInt1 != other.campoInt1)
			return false;
		if (campoTexto1 == null) {
			if (other.campoTexto1 != null)
				return false;
		} else if (!campoTexto1.equals(other.campoTexto1))
			return false;
		if (listObj1 == null) {
			if (other.listObj1 != null)
				return false;
		} else if (!listObj1.equals(other.listObj1))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Teste [campoTexto1=" + campoTexto1 + ", campoInt1=" + campoInt1
				+ ", campoDouble1=" + campoDouble1 + ", listObj1=" + listObj1
				+ "]";
	}
	
	
	
	
	
	

}
