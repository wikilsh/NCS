package com.whut.model;
// default package
// Generated 2019-7-1 16:23:34 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TrainInfo generated by hbm2java
 */
@Entity
@Table(name = "train_info", catalog = "cloudtest")
public class TrainInfo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer trainId;
	private String trainTitle;
	private String trainAuthor;
	private String trainTime;
	private String trainContent;
	private Integer trainPriority;
	private Integer trainClickNum;
	private String trainPublisher;
	private String trainType;
	private String reserve1;
	private String reserve2;

	public TrainInfo() {
	}

	public TrainInfo(String trainTitle, String trainAuthor, String trainTime, String trainContent,
			Integer trainPriority, Integer trainClickNum, String trainPublisher, String trainType, String reserve1,
			String reserve2) {
		this.trainTitle = trainTitle;
		this.trainAuthor = trainAuthor;
		this.trainTime = trainTime;
		this.trainContent = trainContent;
		this.trainPriority = trainPriority;
		this.trainClickNum = trainClickNum;
		this.trainPublisher = trainPublisher;
		this.trainType = trainType;
		this.reserve1 = reserve1;
		this.reserve2 = reserve2;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "trainId", unique = true, nullable = false)
	public Integer getTrainId() {
		return this.trainId;
	}

	public void setTrainId(Integer trainId) {
		this.trainId = trainId;
	}

	@Column(name = "trainTitle", length = 100)
	public String getTrainTitle() {
		return this.trainTitle;
	}

	public void setTrainTitle(String trainTitle) {
		this.trainTitle = trainTitle;
	}

	@Column(name = "trainAuthor", length = 100)
	public String getTrainAuthor() {
		return this.trainAuthor;
	}

	public void setTrainAuthor(String trainAuthor) {
		this.trainAuthor = trainAuthor;
	}

	@Column(name = "trainTime", length = 50)
	public String getTrainTime() {
		return this.trainTime;
	}

	public void setTrainTime(String trainTime) {
		this.trainTime = trainTime;
	}

	@Column(name = "trainContent")
	public String getTrainContent() {
		return this.trainContent;
	}

	public void setTrainContent(String trainContent) {
		this.trainContent = trainContent;
	}

	@Column(name = "trainPriority")
	public Integer getTrainPriority() {
		return this.trainPriority;
	}

	public void setTrainPriority(Integer trainPriority) {
		this.trainPriority = trainPriority;
	}

	@Column(name = "trainClickNum")
	public Integer getTrainClickNum() {
		return this.trainClickNum;
	}

	public void setTrainClickNum(Integer trainClickNum) {
		this.trainClickNum = trainClickNum;
	}

	@Column(name = "trainPublisher", length = 100)
	public String getTrainPublisher() {
		return this.trainPublisher;
	}

	public void setTrainPublisher(String trainPublisher) {
		this.trainPublisher = trainPublisher;
	}

	@Column(name = "trainType", length = 100)
	public String getTrainType() {
		return this.trainType;
	}

	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}

	@Column(name = "reserve1", length = 100)
	public String getReserve1() {
		return this.reserve1;
	}

	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}

	@Column(name = "reserve2", length = 100)
	public String getReserve2() {
		return this.reserve2;
	}

	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}

}