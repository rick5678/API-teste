package com.br.cubix.api.dto;

public class FinalizaReconferenciaDTO {

	private Long idCortesepara;
	private String codbarras;
	private Long nrpreoc;
	private Long qtdConf;
	private String cep;

	public FinalizaReconferenciaDTO() {

	}

	public FinalizaReconferenciaDTO(Long idCortesepara, String codbarras, Long nrpreoc, Long qtdConf, String cep) {
		super();
		this.idCortesepara = idCortesepara;
		this.codbarras = codbarras;
		this.nrpreoc = nrpreoc;
		this.qtdConf = qtdConf;
		this.cep = cep;
	}
	
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Long getIdCortesepara() {
		return idCortesepara;
	}

	public void setIdCortesepara(Long idCorteSepara) {
		this.idCortesepara = idCorteSepara;
	}

	public String getCodbarras() {
		return codbarras;
	}

	public void setCodbarras(String codbarras) {
		this.codbarras = codbarras;
	}

	public Long getNrpreoc() {
		return nrpreoc;
	}

	public void setNrpreoc(Long nrpreoc) {
		this.nrpreoc = nrpreoc;
	}

	public Long getQtdConf() {
		return qtdConf;
	}

	public void setQtdConf(Long qtdConf) {
		this.qtdConf = qtdConf;
	}

}

