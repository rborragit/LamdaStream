package org.ram.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="DB2TUSDG.VYE_PROCESS_PARM")
public class ProcessingTab {
	@Id
	private String PARM_NM;          
	private String PARM_TY;  
	
	@Temporal(TemporalType.DATE)
	private Date PARM_DT;          
	
	private String PARM_NR;          
	private String PARM_STRING_TX;   
	private String PARM_INCR_NR;     
	private String PARM_INCR_TY;     
	private String PARM_DESC_TX;    
	
	
	public String getPARM_NM() {
		return PARM_NM;
	}
	public String getPARM_TY() {
		return PARM_TY;
	}
	public Date getPARM_DT() {
		return PARM_DT;
	}
	public String getPARM_NR() {
		return PARM_NR;
	}
	public String getPARM_STRING_TX() {
		return PARM_STRING_TX;
	}
	public String getPARM_INCR_NR() {
		return PARM_INCR_NR;
	}
	public String getPARM_INCR_TY() {
		return PARM_INCR_TY;
	}
	public String getPARM_DESC_TX() {
		return PARM_DESC_TX;
	}
	public String getLAST_UPDT_USER_ID() {
		return LAST_UPDT_USER_ID;
	}
	public Date getLAST_UPDT_TS() {
		return LAST_UPDT_TS;
	}
	private String LAST_UPDT_USER_ID;
	private Date LAST_UPDT_TS;
	
	public void setPARM_NM(String pARM_NM) {
		PARM_NM = pARM_NM;
	}
	public void setPARM_TY(String pARM_TY) {
		PARM_TY = pARM_TY;
	}
	public void setPARM_DT(Date pARM_DT) {
		PARM_DT = pARM_DT;
	}
	public void setPARM_NR(String pARM_NR) {
		PARM_NR = pARM_NR;
	}
	public void setPARM_STRING_TX(String pARM_STRING_TX) {
		PARM_STRING_TX = pARM_STRING_TX;
	}
	public void setPARM_INCR_NR(String pARM_INCR_NR) {
		PARM_INCR_NR = pARM_INCR_NR;
	}
	public void setPARM_INCR_TY(String pARM_INCR_TY) {
		PARM_INCR_TY = pARM_INCR_TY;
	}
	public void setPARM_DESC_TX(String pARM_DESC_TX) {
		PARM_DESC_TX = pARM_DESC_TX;
	}
	public void setLAST_UPDT_USER_ID(String lAST_UPDT_USER_ID) {
		LAST_UPDT_USER_ID = lAST_UPDT_USER_ID;
	}
	public void setLAST_UPDT_TS(Date lAST_UPDT_TS) {
		LAST_UPDT_TS = lAST_UPDT_TS;
	}     

}
