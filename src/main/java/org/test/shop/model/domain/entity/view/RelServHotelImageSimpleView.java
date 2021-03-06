/* #LAST_VIEW_OBJECT */
/* #UPDATED */
package org.test.shop.model.domain.entity.view;

// Generated 30.08.2015 21:00:08 by Hibernate Tools 4.3.1

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

import org.test.shop.model.domain.SView;


/**
 * RelServHotelImageSimpleView generated by hbm2java, updated by voovee
 */
@JsonIgnoreProperties({
			 
			  "firmid"
			, "firm"
			, "serieskey" 
})
@Entity
@Table(name="rel_serv_hotel_image_simple_view")
public class RelServHotelImageSimpleView extends SView  {

	private static final long serialVersionUID = 5873738816795975L;

	private Integer id;
	private Integer servHotelId;
	private String image;

	public RelServHotelImageSimpleView() {
	}

	public RelServHotelImageSimpleView(Integer id, Integer servHotelId,
			String image) {
		this.id = id;
		this.servHotelId = servHotelId;
		this.image = image;
	}

	@Id
	@Column(name="id")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="serv_hotel_id")
	public Integer getServHotelId() {
		return this.servHotelId;
	}

	public void setServHotelId(Integer servHotelId) {
		this.servHotelId = servHotelId;
	}

	@Column(name="image")
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RelServHotelImageSimpleView))
			return false;
		RelServHotelImageSimpleView castOther = (RelServHotelImageSimpleView) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getServHotelId() == castOther.getServHotelId()) || (this
						.getServHotelId() != null
						&& castOther.getServHotelId() != null && this
						.getServHotelId().equals(castOther.getServHotelId())))
				&& ((this.getImage() == castOther.getImage()) || (this
						.getImage() != null && castOther.getImage() != null && this
						.getImage().equals(castOther.getImage())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37
				* result
				+ (getServHotelId() == null ? 0 : this.getServHotelId()
						.hashCode());
		result = 37 * result
				+ (getImage() == null ? 0 : this.getImage().hashCode());
		return result;
	}
// #SETTER_AND_GETTER
	
// ------------------ Logic part ------------------
	
	public RelServHotelImageSimpleView specialInit() {
	
		
		return this;
	}
	public RelServHotelImageSimpleView init() {
		initList();
		initDicts();
		
		return this;
	}
	
	public RelServHotelImageSimpleView customInitList(List<String> list) {
		
		return this;
	}
	
	public RelServHotelImageSimpleView initList() {

		return this;
	}
	
	public RelServHotelImageSimpleView initDicts() {
		return this;
	}
	
	
}