package com.accenture.lkm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "assets")
public class AssetEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int assetId;

	@Column(name = "asset_brandname")
	private String assetBrandName;

	@Column(name = "validityyears")
	private Integer validityYears;

	public String getAssetBrandName() {
		return assetBrandName;
	}

	public void setAssetBrandName(String assetBrandName) {
		this.assetBrandName = assetBrandName;
	}

	public Integer getValidityYears() {
		return validityYears;
	}

	public void setValidityYears(Integer validityYears) {
		this.validityYears = validityYears;
	}

	public int getAssetId() {
		return assetId;
	}

	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
}
