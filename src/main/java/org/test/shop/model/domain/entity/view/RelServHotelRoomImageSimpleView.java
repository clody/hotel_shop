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
 * RelServHotelRoomImageSimpleView generated by hbm2java, updated by voovee
 */
@JsonIgnoreProperties({
			 
			  "firmid"
			, "firm"
			, "serieskey" 
})
@Entity
@Table(name="rel_serv_hotel_room_image_simple_view")
public class RelServHotelRoomImageSimpleView extends SView  {

	private static final long serialVersionUID = 1856223474811261L;

	private Integer id;
	private Integer servHotelRoomId;
	private String image;

	public RelServHotelRoomImageSimpleView() {
	}

	public RelServHotelRoomImageSimpleView(Integer id,
			Integer servHotelRoomId, String image) {
		this.id = id;
		this.servHotelRoomId = servHotelRoomId;
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

	@Column(name="serv_hotel_room_id")
	public Integer getServHotelRoomId() {
		return this.servHotelRoomId;
	}

	public void setServHotelRoomId(Integer servHotelRoomId) {
		this.servHotelRoomId = servHotelRoomId;
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
		if (!(other instanceof RelServHotelRoomImageSimpleView))
			return false;
		RelServHotelRoomImageSimpleView castOther = (RelServHotelRoomImageSimpleView) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getServHotelRoomId() == castOther
						.getServHotelRoomId()) || (this.getServHotelRoomId() != null
						&& castOther.getServHotelRoomId() != null && this
						.getServHotelRoomId().equals(
								castOther.getServHotelRoomId())))
				&& ((this.getImage() == castOther.getImage()) || (this
						.getImage() != null && castOther.getImage() != null && this
						.getImage().equals(castOther.getImage())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37
				* result
				+ (getServHotelRoomId() == null ? 0 : this.getServHotelRoomId()
						.hashCode());
		result = 37 * result
				+ (getImage() == null ? 0 : this.getImage().hashCode());
		return result;
	}

	
// ------------------ Logic part ------------------
	
	public RelServHotelRoomImageSimpleView specialInit() {
	
		
		return this;
	}
	public RelServHotelRoomImageSimpleView init() {
		initList();
		initDicts();
		
		return this;
	}
	
	public RelServHotelRoomImageSimpleView customInitList(List<String> list) {
		
		return this;
	}
	
	public RelServHotelRoomImageSimpleView initList() {

		return this;
	}
	
	public RelServHotelRoomImageSimpleView initDicts() {
		return this;
	}
	
	
}