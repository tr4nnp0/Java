package br.senac.rj.empresa.modelo;

public class Material {
	private int codMaterial;
	private String descMaterial;
	private int qtdeEstoque;
	
	public int getCodMaterial() {
		return codMaterial;
	}

	public void setCodMaterial(int codMaterial) {
		this.codMaterial = codMaterial;
	}

	public String getDescMaterial() {
		return descMaterial;
	}

	public void setDescMaterial(String descMaterial) {
		this.descMaterial = descMaterial;
	}

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	public void entrarMaterial(int materialSaida) {
		this.qtdeEstoque = this.qtdeEstoque + materialSaida;
	}
	
	public boolean sairMaterial(int materialSaida) {
		int novoEstoque = this.qtdeEstoque - materialSaida;
		if (novoEstoque<0)
			return false;
		this.qtdeEstoque = novoEstoque;
		return true;
	}	

}