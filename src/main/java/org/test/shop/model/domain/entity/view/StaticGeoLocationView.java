/* #LAST_VIEW_OBJECT */
/* #UPDATED */
package org.test.shop.model.domain.entity.view;

// Generated 30.08.2015 21:00:08 by Hibernate Tools 4.3.1

import javax.persistence.Id;
import javax.persistence.Id;
import javax.persistence.Id;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

import org.test.shop.model.domain.SView;


/**
 * StaticGeoLocationView generated by hbm2java, updated by voovee
 */
@JsonIgnoreProperties({
			 
			  "firmid"
			, "firm"
			, "serieskey" 
})
@Entity
@Table(name="static_geo_location_view")
public class StaticGeoLocationView extends SView  {

	private static final long serialVersionUID = 1575762376558718L;

	private String name;
	private String x;
	private String y;

	public StaticGeoLocationView() {
	}

	public StaticGeoLocationView(String name, String x, String y) {
		this.name=name;
		this.x = x;
		this.y = y;
	}

	@Id
	@Column(name="name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name=name;
	}

	@Column(name="x")
	public String getX() {
		return this.x;
	}

	public void setX(String x) {
		this.x = x;
	}

	@Column(name="y")
	public String getY() {
		return this.y;
	}

	public void setY(String y) {
		this.y = y;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StaticGeoLocationView))
			return false;
		StaticGeoLocationView castOther = (StaticGeoLocationView) other;

		return ((this.getName() == castOther.getName()) || (this.getName() != null
				&& castOther.getName() != null && this.getName().equals(
				castOther.getName())))
				&& ((this.getX() == castOther.getX()) || (this.getX() != null
						&& castOther.getX() != null && this.getX().equals(
						castOther.getX())))
				&& ((this.getY() == castOther.getY()) || (this.getY() != null
						&& castOther.getY() != null && this.getY().equals(
						castOther.getY())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getX() == null ? 0 : this.getX().hashCode());
		result = 37 * result + (getY() == null ? 0 : this.getY().hashCode());
		return result;
	}
// #SETTER_AND_GETTER
	
// ------------------ Logic part ------------------
	
	public StaticGeoLocationView specialInit() {
	
		
		return this;
	}
	public StaticGeoLocationView init() {
		initList();
		initDicts();
		
		return this;
	}
	
	public StaticGeoLocationView customInitList(List<String> list) {
		
		return this;
	}
	
	public StaticGeoLocationView initList() {

		return this;
	}
	
	public StaticGeoLocationView initDicts() {
		return this;
	}
	
	
}