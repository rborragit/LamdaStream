package org.ram.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="DB2TUSDG.VYE_DIS_CLAIM")
public class Notes_Hist {

	@Id
	private String CLM_NR;    
	private String PLN_NR;           
	private String CLMT_SOC_SEC_NR;  
	private String CLMT_LAST_NM;     
	private String CLMT_FIRST_NM;    
	private String CLMT_MDLE_INIT_NM;
	private String BEN_ANAL_ID;      
	private String CLM_STAT_CD;  
	
	@Temporal(TemporalType.DATE)
	private Date CLM_OPEN_DT;
	
	@Temporal(TemporalType.DATE)
	private Date CLM_CLOSE_DT;  
	
	private String LAST_UPDT_USER_ID;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date LAST_UPDT_TS;
	
	public String getCLM_NR() {
		return CLM_NR;
	}
	public void setCLM_NR(String cLM_NR) {
		CLM_NR = cLM_NR;
	}
	public String getPLN_NR() {
		return PLN_NR;
	}
	public void setPLN_NR(String pLN_NR) {
		PLN_NR = pLN_NR;
	}
	public String getCLMT_SOC_SEC_NR() {
		return CLMT_SOC_SEC_NR;
	}
	public void setCLMT_SOC_SEC_NR(String cLMT_SOC_SEC_NR) {
		CLMT_SOC_SEC_NR = cLMT_SOC_SEC_NR;
	}
	public String getCLMT_LAST_NM() {
		return CLMT_LAST_NM;
	}
	public void setCLMT_LAST_NM(String cLMT_LAST_NM) {
		CLMT_LAST_NM = cLMT_LAST_NM;
	}
	public String getCLMT_FIRST_NM() {
		return CLMT_FIRST_NM;
	}
	public void setCLMT_FIRST_NM(String cLMT_FIRST_NM) {
		CLMT_FIRST_NM = cLMT_FIRST_NM;
	}
	public String getCLMT_MDLE_INIT_NM() {
		return CLMT_MDLE_INIT_NM;
	}
	public void setCLMT_MDLE_INIT_NM(String cLMT_MDLE_INIT_NM) {
		CLMT_MDLE_INIT_NM = cLMT_MDLE_INIT_NM;
	}
	public String getBEN_ANAL_ID() {
		return BEN_ANAL_ID;
	}
	public void setBEN_ANAL_ID(String bEN_ANAL_ID) {
		BEN_ANAL_ID = bEN_ANAL_ID;
	}
	public String getCLM_STAT_CD() {
		return CLM_STAT_CD;
	}
	public void setCLM_STAT_CD(String cLM_STAT_CD) {
		CLM_STAT_CD = cLM_STAT_CD;
	}
	public Date getCLM_OPEN_DT() {
		return CLM_OPEN_DT;
	}
	public void setCLM_OPEN_DT(Date cLM_OPEN_DT) {
		CLM_OPEN_DT = cLM_OPEN_DT;
	}
	public Date getCLM_CLOSE_DT() {
		return CLM_CLOSE_DT;
	}
	public void setCLM_CLOSE_DT(Date cLM_CLOSE_DT) {
		CLM_CLOSE_DT = cLM_CLOSE_DT;
	}
	public String getLAST_UPDT_USER_ID() {
		return LAST_UPDT_USER_ID;
	}
	public void setLAST_UPDT_USER_ID(String lAST_UPDT_USER_ID) {
		LAST_UPDT_USER_ID = lAST_UPDT_USER_ID;
	}
	public Date getLAST_UPDT_TS() {
		return LAST_UPDT_TS;
	}
	public void setLAST_UPDT_TS(Date lAST_UPDT_TS) {
		LAST_UPDT_TS = lAST_UPDT_TS;
	}     
	
	
}
