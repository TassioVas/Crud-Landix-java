package br.com.model;

public class Clientes {
	
	private Integer cdcl;
	private String dsnome;
	private Integer idtipo;
	private Integer cdvend;
	private Double dslim;
	
	private Vendedores vendedores;

	public Integer getCdcl() {
		return cdcl;
	}

	public void setCdcl(Integer cdcl) {
		this.cdcl = cdcl;
	}

	public String getDsnome() {
		return dsnome;
	}

	public void setDsnome(String dsnome) {
		this.dsnome = dsnome;
	}

	public Integer getIdtipo() {
		return idtipo;
	}

	public void setIdtipo(Integer idtipo) {
		this.idtipo = idtipo;
	}

	public Integer getCdvend() {
		return cdvend;
	}

	public void setCdvend(Integer cdvend) {
		this.cdvend = cdvend;
	}

	public Double getDslim() {
		return dslim;
	}

	public void setDslim(Double dslim) {
		this.dslim = dslim;
	}

	public Vendedores getVendedores() {
		return vendedores;
	}

	public void setVendedores(Vendedores vendedores) {
		this.vendedores = vendedores;
	}
	
	

}
