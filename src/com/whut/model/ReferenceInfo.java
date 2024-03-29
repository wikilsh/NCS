package com.whut.model;
// default package
// Generated 2019-2-23 15:29:55 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ReferenceInfo generated by hbm2java
 */
@Entity
@Table(name = "reference_info", catalog = "cloudtest")
public class ReferenceInfo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer referenceId;
	private String referenceSeq;
	private String referenceAuthor;
	private String referenceName;
	private String referenceClass;
	private String referencePublicadd;
	private String referencePublic;
	private String referencePublictime;
	private Integer textbookId;
	private String reserver1;
	private String reserver2;
	private String reserver3;
	private String reserver4;
	private String reserver5;

	public ReferenceInfo() {
	}

	public ReferenceInfo(String referenceSeq, String referenceAuthor, String referenceName, String referenceClass,
			String referencePublicadd, String referencePublic, String referencePublictime, Integer textbookId,
			String reserver1, String reserver2, String reserver3, String reserver4, String reserver5) {
		this.referenceSeq = referenceSeq;
		this.referenceAuthor = referenceAuthor;
		this.referenceName = referenceName;
		this.referenceClass = referenceClass;
		this.referencePublicadd = referencePublicadd;
		this.referencePublic = referencePublic;
		this.referencePublictime = referencePublictime;
		this.textbookId = textbookId;
		this.reserver1 = reserver1;
		this.reserver2 = reserver2;
		this.reserver3 = reserver3;
		this.reserver4 = reserver4;
		this.reserver5 = reserver5;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "referenceId", unique = true, nullable = false)
	public Integer getReferenceId() {
		return this.referenceId;
	}

	public void setReferenceId(Integer referenceId) {
		this.referenceId = referenceId;
	}

	@Column(name = "referenceSeq", length = 10)
	public String getReferenceSeq() {
		return this.referenceSeq;
	}

	public void setReferenceSeq(String referenceSeq) {
		this.referenceSeq = referenceSeq;
	}

	@Column(name = "referenceAuthor", length = 100)
	public String getReferenceAuthor() {
		return this.referenceAuthor;
	}

	public void setReferenceAuthor(String referenceAuthor) {
		this.referenceAuthor = referenceAuthor;
	}

	@Column(name = "referenceName", length = 100)
	public String getReferenceName() {
		return this.referenceName;
	}

	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}

	@Column(name = "referenceClass", length = 10)
	public String getReferenceClass() {
		return this.referenceClass;
	}

	public void setReferenceClass(String referenceClass) {
		this.referenceClass = referenceClass;
	}

	@Column(name = "referencePublicadd", length = 50)
	public String getReferencePublicadd() {
		return this.referencePublicadd;
	}

	public void setReferencePublicadd(String referencePublicadd) {
		this.referencePublicadd = referencePublicadd;
	}

	@Column(name = "referencePublic", length = 200)
	public String getReferencePublic() {
		return this.referencePublic;
	}

	public void setReferencePublic(String referencePublic) {
		this.referencePublic = referencePublic;
	}

	@Column(name = "referencePublictime", length = 50)
	public String getReferencePublictime() {
		return this.referencePublictime;
	}

	public void setReferencePublictime(String referencePublictime) {
		this.referencePublictime = referencePublictime;
	}

	@Column(name = "textbookId")
	public Integer getTextbookId() {
		return this.textbookId;
	}

	public void setTextbookId(Integer textbookId) {
		this.textbookId = textbookId;
	}

	@Column(name = "reserver1", length = 100)
	public String getReserver1() {
		return this.reserver1;
	}

	public void setReserver1(String reserver1) {
		this.reserver1 = reserver1;
	}

	@Column(name = "reserver2", length = 100)
	public String getReserver2() {
		return this.reserver2;
	}

	public void setReserver2(String reserver2) {
		this.reserver2 = reserver2;
	}

	@Column(name = "reserver3", length = 100)
	public String getReserver3() {
		return this.reserver3;
	}

	public void setReserver3(String reserver3) {
		this.reserver3 = reserver3;
	}

	@Column(name = "reserver4", length = 100)
	public String getReserver4() {
		return this.reserver4;
	}

	public void setReserver4(String reserver4) {
		this.reserver4 = reserver4;
	}

	@Column(name = "reserver5", length = 100)
	public String getReserver5() {
		return this.reserver5;
	}

	public void setReserver5(String reserver5) {
		this.reserver5 = reserver5;
	}

}
