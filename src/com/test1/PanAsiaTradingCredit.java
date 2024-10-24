package com.test1;

public class PanAsiaTradingCredit {
	private String countryCode;
	private String creditFlowCode;
	private String origin;
	private String preTradeControls;
	private boolean modelPartitionType;
	private Integer riskRatingSystem;
	private boolean businessLineAwareness;
	private String tradingDeskCode;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public PanAsiaTradingCredit() {

	}

	public PanAsiaTradingCredit(String countryCode, String creditFlowCode, String origin, String preTradeControls,
			boolean modelPartitionType, Integer riskRatingSystem, boolean businessLineAwareness, String tradingDeskCode,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.countryCode = countryCode;
		this.creditFlowCode = creditFlowCode;
		this.origin = origin;
		this.preTradeControls = preTradeControls;
		this.modelPartitionType = modelPartitionType;
		this.riskRatingSystem = riskRatingSystem;
		this.businessLineAwareness = businessLineAwareness;
		this.tradingDeskCode = tradingDeskCode;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
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

	public String getPreTradeControls() {
		return preTradeControls;
	}

	public void setPreTradeControls(String preTradeControls) {
		this.preTradeControls = preTradeControls;
	}

	public boolean isModelPartitionType() {
		return modelPartitionType;
	}

	public void setModelPartitionType(boolean modelPartitionType) {
		this.modelPartitionType = modelPartitionType;
	}

	public Integer getRiskRatingSystem() {
		return riskRatingSystem;
	}

	public void setRiskRatingSystem(Integer riskRatingSystem) {
		this.riskRatingSystem = riskRatingSystem;
	}

	public boolean isBusinessLineAwareness() {
		return businessLineAwareness;
	}

	public void setBusinessLineAwareness(boolean businessLineAwareness) {
		this.businessLineAwareness = businessLineAwareness;
	}

	public String getTradingDeskCode() {
		return tradingDeskCode;
	}

	public void setTradingDeskCode(String tradingDeskCode) {
		this.tradingDeskCode = tradingDeskCode;
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
