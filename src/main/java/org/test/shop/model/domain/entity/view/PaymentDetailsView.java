/* #LAST_VIEW_OBJECT */
/* #UPDATED */
package org.test.shop.model.domain.entity.view;

// Generated 30.08.2015 21:00:08 by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;

import java.util.List;
import java.util.LinkedList;
import java.util.Date;

import javax.persistence.Column;

import org.test.shop.model.domain.SView;


/**
 * PaymentDetailsView generated by hbm2java, updated by voovee
 */
@JsonIdentityInfo(generator = JSOGGenerator.class)
@JsonIgnoreProperties({
			 
			  "firmid"
			, "firm"
			, "serieskey" 
})
@Entity
@Table(name="payment_details_view")
public class PaymentDetailsView extends SView  {

	private static final long serialVersionUID = 8423477199789458L;

	private Integer id;
	private Integer version;
	private String createdby;
	private Date createon;
	private Integer firm;
	private String lastmodifiedby;
	private Date modifyon;
	private String serieskey;
	private String banklocation;
	private String bin;
	private String correspondentaccount;
	private String currentaccount;
	private String fullname;
	private String iin;
	private String legaladdress;
	private String nameofthebank;
	private String nceo;
	private String phone;
	private String phone2;
	private String postaladdress;
	private Integer popularity;

	private List<ServHotelView> servHotels = new LinkedList<ServHotelView>();
	
	public PaymentDetailsView() {
	}

	public PaymentDetailsView(Integer id, Integer version, String createdby,
			Date createon, Integer firm, String lastmodifiedby, Date modifyon,
			String serieskey, String banklocation, String bin,
			String correspondentaccount, String currentaccount,
			String fullname, String iin, String legaladdress,
			String nameofthebank, String nceo, String phone, String phone2,
			String postaladdress, Integer popularity) {
		this.id = id;
		this.version = version;
		this.createdby = createdby;
		this.createon = createon;
		this.firm = firm;
		this.lastmodifiedby = lastmodifiedby;
		this.modifyon = modifyon;
		this.serieskey = serieskey;
		this.banklocation = banklocation;
		this.bin = bin;
		this.correspondentaccount = correspondentaccount;
		this.currentaccount = currentaccount;
		this.fullname=fullname;
		this.iin = iin;
		this.legaladdress = legaladdress;
		this.nameofthebank = nameofthebank;
		this.nceo = nceo;
		this.phone = phone;
		this.phone2 = phone2;
		this.postaladdress = postaladdress;
		this.popularity = popularity;
	}

	@Id
	@Column(name="id")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="version")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name="createdby")
	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	@Column(name="createon", length = 29)
	public Date getCreateon() {
		return this.createon;
	}

	public void setCreateon(Date createon) {
		this.createon = createon;
	}

	@Column(name="firm")
	public Integer getFirm() {
		return this.firm;
	}

	public void setFirm(Integer firm) {
		this.firm = firm;
	}

	@Column(name="lastmodifiedby")
	public String getLastmodifiedby() {
		return this.lastmodifiedby;
	}

	public void setLastmodifiedby(String lastmodifiedby) {
		this.lastmodifiedby = lastmodifiedby;
	}

	@Column(name="modifyon", length = 29)
	public Date getModifyon() {
		return this.modifyon;
	}

	public void setModifyon(Date modifyon) {
		this.modifyon = modifyon;
	}

	@Column(name="serieskey")
	public String getSerieskey() {
		return this.serieskey;
	}

	public void setSerieskey(String serieskey) {
		this.serieskey = serieskey;
	}

	@Column(name="banklocation")
	public String getBanklocation() {
		return this.banklocation;
	}

	public void setBanklocation(String banklocation) {
		this.banklocation = banklocation;
	}

	@Column(name="bin")
	public String getBin() {
		return this.bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	@Column(name="correspondentaccount")
	public String getCorrespondentaccount() {
		return this.correspondentaccount;
	}

	public void setCorrespondentaccount(String correspondentaccount) {
		this.correspondentaccount = correspondentaccount;
	}

	@Column(name="currentaccount")
	public String getCurrentaccount() {
		return this.currentaccount;
	}

	public void setCurrentaccount(String currentaccount) {
		this.currentaccount = currentaccount;
	}

	@Column(name="fullname")
	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname=fullname;
	}

	@Column(name="iin")
	public String getIin() {
		return this.iin;
	}

	public void setIin(String iin) {
		this.iin = iin;
	}

	@Column(name="legaladdress")
	public String getLegaladdress() {
		return this.legaladdress;
	}

	public void setLegaladdress(String legaladdress) {
		this.legaladdress = legaladdress;
	}

	@Column(name="nameofthebank")
	public String getNameofthebank() {
		return this.nameofthebank;
	}

	public void setNameofthebank(String nameofthebank) {
		this.nameofthebank = nameofthebank;
	}

	@Column(name="nceo")
	public String getNceo() {
		return this.nceo;
	}

	public void setNceo(String nceo) {
		this.nceo = nceo;
	}

	@Column(name="phone")
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name="phone2")
	public String getPhone2() {
		return this.phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	@Column(name="postaladdress")
	public String getPostaladdress() {
		return this.postaladdress;
	}

	public void setPostaladdress(String postaladdress) {
		this.postaladdress = postaladdress;
	}

	@Column(name="popularity")
	public Integer getPopularity() {
		return this.popularity;
	}

	public void setPopularity(Integer popularity) {
		this.popularity = popularity;
	}

	 	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="paymentdetailsid")
	public List<ServHotelView> getServHotels() {
		return this.servHotels;
	}

	public void setServHotels(List<ServHotelView> servHotels) {
		this.servHotels = servHotels;
	}

	
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PaymentDetailsView))
			return false;
		PaymentDetailsView castOther = (PaymentDetailsView) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getVersion() == castOther.getVersion()) || (this
						.getVersion() != null && castOther.getVersion() != null && this
						.getVersion().equals(castOther.getVersion())))
				&& ((this.getCreatedby() == castOther.getCreatedby()) || (this
						.getCreatedby() != null
						&& castOther.getCreatedby() != null && this
						.getCreatedby().equals(castOther.getCreatedby())))
				&& ((this.getCreateon() == castOther.getCreateon()) || (this
						.getCreateon() != null
						&& castOther.getCreateon() != null && this
						.getCreateon().equals(castOther.getCreateon())))
				&& ((this.getFirm() == castOther.getFirm()) || (this.getFirm() != null
						&& castOther.getFirm() != null && this.getFirm()
						.equals(castOther.getFirm())))
				&& ((this.getLastmodifiedby() == castOther.getLastmodifiedby()) || (this
						.getLastmodifiedby() != null
						&& castOther.getLastmodifiedby() != null && this
						.getLastmodifiedby().equals(
								castOther.getLastmodifiedby())))
				&& ((this.getModifyon() == castOther.getModifyon()) || (this
						.getModifyon() != null
						&& castOther.getModifyon() != null && this
						.getModifyon().equals(castOther.getModifyon())))
				&& ((this.getSerieskey() == castOther.getSerieskey()) || (this
						.getSerieskey() != null
						&& castOther.getSerieskey() != null && this
						.getSerieskey().equals(castOther.getSerieskey())))
				&& ((this.getBanklocation() == castOther.getBanklocation()) || (this
						.getBanklocation() != null
						&& castOther.getBanklocation() != null && this
						.getBanklocation().equals(castOther.getBanklocation())))
				&& ((this.getBin() == castOther.getBin()) || (this.getBin() != null
						&& castOther.getBin() != null && this.getBin().equals(
						castOther.getBin())))
				&& ((this.getCorrespondentaccount() == castOther
						.getCorrespondentaccount()) || (this
						.getCorrespondentaccount() != null
						&& castOther.getCorrespondentaccount() != null && this
						.getCorrespondentaccount().equals(
								castOther.getCorrespondentaccount())))
				&& ((this.getCurrentaccount() == castOther.getCurrentaccount()) || (this
						.getCurrentaccount() != null
						&& castOther.getCurrentaccount() != null && this
						.getCurrentaccount().equals(
								castOther.getCurrentaccount())))
				&& ((this.getFullname() == castOther.getFullname()) || (this
						.getFullname() != null
						&& castOther.getFullname() != null && this
						.getFullname().equals(castOther.getFullname())))
				&& ((this.getIin() == castOther.getIin()) || (this.getIin() != null
						&& castOther.getIin() != null && this.getIin().equals(
						castOther.getIin())))
				&& ((this.getLegaladdress() == castOther.getLegaladdress()) || (this
						.getLegaladdress() != null
						&& castOther.getLegaladdress() != null && this
						.getLegaladdress().equals(castOther.getLegaladdress())))
				&& ((this.getNameofthebank() == castOther.getNameofthebank()) || (this
						.getNameofthebank() != null
						&& castOther.getNameofthebank() != null && this
						.getNameofthebank()
						.equals(castOther.getNameofthebank())))
				&& ((this.getNceo() == castOther.getNceo()) || (this.getNceo() != null
						&& castOther.getNceo() != null && this.getNceo()
						.equals(castOther.getNceo())))
				&& ((this.getPhone() == castOther.getPhone()) || (this
						.getPhone() != null && castOther.getPhone() != null && this
						.getPhone().equals(castOther.getPhone())))
				&& ((this.getPhone2() == castOther.getPhone2()) || (this
						.getPhone2() != null && castOther.getPhone2() != null && this
						.getPhone2().equals(castOther.getPhone2())))
				&& ((this.getPostaladdress() == castOther.getPostaladdress()) || (this
						.getPostaladdress() != null
						&& castOther.getPostaladdress() != null && this
						.getPostaladdress()
						.equals(castOther.getPostaladdress())))
				&& ((this.getPopularity() == castOther.getPopularity()) || (this
						.getPopularity() != null
						&& castOther.getPopularity() != null && this
						.getPopularity().equals(castOther.getPopularity())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getVersion() == null ? 0 : this.getVersion().hashCode());
		result = 37 * result
				+ (getCreatedby() == null ? 0 : this.getCreatedby().hashCode());
		result = 37 * result
				+ (getCreateon() == null ? 0 : this.getCreateon().hashCode());
		result = 37 * result
				+ (getFirm() == null ? 0 : this.getFirm().hashCode());
		result = 37
				* result
				+ (getLastmodifiedby() == null ? 0 : this.getLastmodifiedby()
						.hashCode());
		result = 37 * result
				+ (getModifyon() == null ? 0 : this.getModifyon().hashCode());
		result = 37 * result
				+ (getSerieskey() == null ? 0 : this.getSerieskey().hashCode());
		result = 37
				* result
				+ (getBanklocation() == null ? 0 : this.getBanklocation()
						.hashCode());
		result = 37 * result
				+ (getBin() == null ? 0 : this.getBin().hashCode());
		result = 37
				* result
				+ (getCorrespondentaccount() == null ? 0 : this
						.getCorrespondentaccount().hashCode());
		result = 37
				* result
				+ (getCurrentaccount() == null ? 0 : this.getCurrentaccount()
						.hashCode());
		result = 37 * result
				+ (getFullname() == null ? 0 : this.getFullname().hashCode());
		result = 37 * result
				+ (getIin() == null ? 0 : this.getIin().hashCode());
		result = 37
				* result
				+ (getLegaladdress() == null ? 0 : this.getLegaladdress()
						.hashCode());
		result = 37
				* result
				+ (getNameofthebank() == null ? 0 : this.getNameofthebank()
						.hashCode());
		result = 37 * result
				+ (getNceo() == null ? 0 : this.getNceo().hashCode());
		result = 37 * result
				+ (getPhone() == null ? 0 : this.getPhone().hashCode());
		result = 37 * result
				+ (getPhone2() == null ? 0 : this.getPhone2().hashCode());
		result = 37
				* result
				+ (getPostaladdress() == null ? 0 : this.getPostaladdress()
						.hashCode());
		result = 37
				* result
				+ (getPopularity() == null ? 0 : this.getPopularity()
						.hashCode());
		return result;
	}

	
// ------------------ Logic part ------------------
	
	public PaymentDetailsView specialInit() {
	
		
		return this;
	}
	public PaymentDetailsView init() {
		initList();
		initDicts();
		
		return this;
	}
	
	public PaymentDetailsView customInitList(List<String> list) {
		if (list.contains("servHotels")) {
			initLists(servHotels);
		}
		return this;
	}
	
	public PaymentDetailsView initList() {
		initLists(servHotels);

		return this;
	}
	
	public PaymentDetailsView initDicts() {
		return this;
	}
	
	
}