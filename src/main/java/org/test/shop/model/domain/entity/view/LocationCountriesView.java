/* #LAST_VIEW_OBJECT */
/* #UPDATED */
package org.test.shop.model.domain.entity.view;

// Generated 30.08.2015 21:00:08 by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
 * LocationCountriesView generated by hbm2java, updated by voovee
 */
@JsonIgnoreProperties({
			 
			  "firmid"
			, "firm"
			, "serieskey" 
})
@Entity
@Table(name="location_countries_view")
public class LocationCountriesView extends SView  {

	private static final long serialVersionUID = 8445846697348811L;

	private Integer id;
	private Integer version;
	private String createdby;
	private Date createon;
	private Integer firm;
	private String lastmodifiedby;
	private Date modifyon;
	private String serieskey;
	private String countryname;
	private String descr;
	private String isocode;
	private String nameeng;
	private Integer popularity;

	private List<TmContactView> tmContacts = new LinkedList<TmContactView>();
	private List<ServHotelView> servHotels = new LinkedList<ServHotelView>();
	private List<LocationCitiesView> locationCitieses = new LinkedList<LocationCitiesView>();
	private List<ServTransferView> servTransfers = new LinkedList<ServTransferView>();
	private List<TmAccountView> tmAccounts = new LinkedList<TmAccountView>();
	private List<TmContactEasyView> tmContactEasies = new LinkedList<TmContactEasyView>();
	
	public LocationCountriesView() {
	}

	public LocationCountriesView(Integer id, Integer version,
			String createdby, Date createon, Integer firm,
			String lastmodifiedby, Date modifyon, String serieskey,
			String countryname, String descr, String isocode, String nameeng,
			Integer popularity) {
		this.id = id;
		this.version = version;
		this.createdby = createdby;
		this.createon = createon;
		this.firm = firm;
		this.lastmodifiedby = lastmodifiedby;
		this.modifyon = modifyon;
		this.serieskey = serieskey;
		this.countryname=countryname;
		this.descr = descr;
		this.isocode = isocode;
		this.nameeng = nameeng;
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

	@Column(name="countryname")
	public String getCountryname() {
		return this.countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname=countryname;
	}

	@Column(name="descr", length = 2000)
	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	@Column(name="isocode")
	public String getIsocode() {
		return this.isocode;
	}

	public void setIsocode(String isocode) {
		this.isocode = isocode;
	}

	@Column(name="nameeng")
	public String getNameeng() {
		return this.nameeng;
	}

	public void setNameeng(String nameeng) {
		this.nameeng = nameeng;
	}

	@Column(name="popularity")
	public Integer getPopularity() {
		return this.popularity;
	}

	public void setPopularity(Integer popularity) {
		this.popularity = popularity;
	}

	 	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="locationcountriesid")
	public List<TmContactView> getTmContacts() {
		return this.tmContacts;
	}

	public void setTmContacts(List<TmContactView> tmContacts) {
		this.tmContacts = tmContacts;
	}

	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="locationcountriesid")
	public List<ServHotelView> getServHotels() {
		return this.servHotels;
	}

	public void setServHotels(List<ServHotelView> servHotels) {
		this.servHotels = servHotels;
	}

	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="locationcountriesid")
	public List<LocationCitiesView> getLocationCitieses() {
		return this.locationCitieses;
	}

	public void setLocationCitieses(List<LocationCitiesView> locationCitieses) {
		this.locationCitieses = locationCitieses;
	}

	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="locationcountriesid")
	public List<ServTransferView> getServTransfers() {
		return this.servTransfers;
	}

	public void setServTransfers(List<ServTransferView> servTransfers) {
		this.servTransfers = servTransfers;
	}

	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="locationcountriesid")
	public List<TmAccountView> getTmAccounts() {
		return this.tmAccounts;
	}

	public void setTmAccounts(List<TmAccountView> tmAccounts) {
		this.tmAccounts = tmAccounts;
	}

	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="locationcountriesid")
	public List<TmContactEasyView> getTmContactEasies() {
		return this.tmContactEasies;
	}

	public void setTmContactEasies(List<TmContactEasyView> tmContactEasies) {
		this.tmContactEasies = tmContactEasies;
	}

	
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LocationCountriesView))
			return false;
		LocationCountriesView castOther = (LocationCountriesView) other;

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
				&& ((this.getCountryname() == castOther.getCountryname()) || (this
						.getCountryname() != null
						&& castOther.getCountryname() != null && this
						.getCountryname().equals(castOther.getCountryname())))
				&& ((this.getDescr() == castOther.getDescr()) || (this
						.getDescr() != null && castOther.getDescr() != null && this
						.getDescr().equals(castOther.getDescr())))
				&& ((this.getIsocode() == castOther.getIsocode()) || (this
						.getIsocode() != null && castOther.getIsocode() != null && this
						.getIsocode().equals(castOther.getIsocode())))
				&& ((this.getNameeng() == castOther.getNameeng()) || (this
						.getNameeng() != null && castOther.getNameeng() != null && this
						.getNameeng().equals(castOther.getNameeng())))
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
				+ (getCountryname() == null ? 0 : this.getCountryname()
						.hashCode());
		result = 37 * result
				+ (getDescr() == null ? 0 : this.getDescr().hashCode());
		result = 37 * result
				+ (getIsocode() == null ? 0 : this.getIsocode().hashCode());
		result = 37 * result
				+ (getNameeng() == null ? 0 : this.getNameeng().hashCode());
		result = 37
				* result
				+ (getPopularity() == null ? 0 : this.getPopularity()
						.hashCode());
		return result;
	}

	
// ------------------ Logic part ------------------
	
	public LocationCountriesView specialInit() {
	
		
		return this;
	}
	public LocationCountriesView init() {
		initList();
		initDicts();
		
		return this;
	}
	
	public LocationCountriesView customInitList(List<String> list) {
		if (list.contains("tmContacts")) {
			initLists(tmContacts);
		}
		if (list.contains("servHotels")) {
			initLists(servHotels);
		}
		if (list.contains("locationCitieses")) {
			initLists(locationCitieses);
		}
		if (list.contains("servTransfers")) {
			initLists(servTransfers);
		}
		if (list.contains("tmAccounts")) {
			initLists(tmAccounts);
		}
		if (list.contains("tmContactEasies")) {
			initLists(tmContactEasies);
		}
		return this;
	}
	
	public LocationCountriesView initList() {

		return this;
	}
	
	public LocationCountriesView initDicts() {
		return this;
	}
	
	
}