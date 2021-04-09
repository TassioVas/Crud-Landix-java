package br.com.model;

import java.util.Date;

public class Vendedores {
	
	private Integer codvend;
	private String dsnome;
	private Integer cdtab;
	private Date dtnasc;
	
	public Integer getCodvend() {
		return codvend;
	}
	public void setCodvend(Integer codvend) {
		this.codvend = codvend;
	}
	public String getDsnome() {
		return dsnome;
	}
	public void setDsnome(String dsnome) {
		this.dsnome = dsnome;
	}
	public Integer getCdtab() {
		return cdtab;
	}
	public void setCdtab(Integer cdtab) {
		this.cdtab = cdtab;
	}
	public Date getDtnasc() {
		return dtnasc;
	}
	public void setDtnasc(Date dtnasc) {
		this.dtnasc = dtnasc;
	}
}
