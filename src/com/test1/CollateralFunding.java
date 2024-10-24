package com.test1;

public class CollateralFunding {
	private String historyDate;
	private String fundInitiatedDate;
	private String creditFlowCode;
	private String origin;
	private String auditFlag;
	private boolean auditDone;
	private String auditType;
	private String actedBy;
	private String auditSource;
	private String collateralOwner;
	private String riskFactor;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CollateralFunding() {

	}

	public CollateralFunding(String historyDate, String fundInitiatedDate, String creditFlowCode, String origin,
			String auditFlag, boolean auditDone, String auditType, String actedBy, String auditSource,
			String collateralOwner, String riskFactor, String creationDate, String modifiedDate, String entityState) {
		super();
		this.historyDate = historyDate;
		this.fundInitiatedDate = fundInitiatedDate;
		this.creditFlowCode = creditFlowCode;
		this.origin = origin;
		this.auditFlag = auditFlag;
		this.auditDone = auditDone;
		this.auditType = auditType;
		this.actedBy = actedBy;
		this.auditSource = auditSource;
		this.collateralOwner = collateralOwner;
		this.riskFactor = riskFactor;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getHistoryDate() {
		return historyDate;
	}

	public void setHistoryDate(String historyDate) {
		this.historyDate = historyDate;
	}

	public String getFundInitiatedDate() {
		return fundInitiatedDate;
	}

	public void setFundInitiatedDate(String fundInitiatedDate) {
		this.fundInitiatedDate = fundInitiatedDate;
	}

	public String getCreditFlowCode() {
		return creditFlowCode;
	}

	public void setCreditFlowCode(String creditFlowCode) {
		this.creditFlowCode = creditFlowCode;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getAuditFlag() {
		return auditFlag;
	}

	public void setAuditFlag(String auditFlag) {
		this.auditFlag = auditFlag;
	}

	public boolean isAuditDone() {
		return auditDone;
	}

	public void setAuditDone(boolean auditDone) {
		this.auditDone = auditDone;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public String getActedBy() {
		return actedBy;
	}

	public void setActedBy(String actedBy) {
		this.actedBy = actedBy;
	}

	public String getAuditSource() {
		return auditSource;
	}

	public void setAuditSource(String auditSource) {
		this.auditSource = auditSource;
	}

	public String getCollateralOwner() {
		return collateralOwner;
	}

	public void setCollateralOwner(String collateralOwner) {
		this.collateralOwner = collateralOwner;
	}

	public String getRiskFactor() {
		return riskFactor;
	}

	public void setRiskFactor(String riskFactor) {
		this.riskFactor = riskFactor;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
