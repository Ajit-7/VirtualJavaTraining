package com.accenture.lkm.businessbean;

public class AssetBean {
	
	private Integer assetId;
	private String assetName;
	private String assetBrandName;
	private Integer validityYears;
	public String getAssetBrandName() {
		return assetBrandName;
	}
	public Integer getAssetId() {
		return assetId;
	}
	
	public String getAssetName() {
		return assetName;
	}
	public Integer getValidityYears() {
		return validityYears;
	}
	public void setAssetBrandName(String assetBrandName) {
		this.assetBrandName = assetBrandName;
	}
	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public void setValidityYears(Integer validityYears) {
		this.validityYears = validityYears;
	}
	

}
