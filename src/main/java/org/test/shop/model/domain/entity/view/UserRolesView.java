/* #LAST_VIEW_OBJECT */
/* #UPDATED */
package org.test.shop.model.domain.entity.view;

// Generated 30.08.2015 21:00:08 by Hibernate Tools 4.3.1

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

import org.test.shop.model.domain.SView;


/**
 * UserRolesView generated by hbm2java, updated by voovee
 */
@JsonIdentityInfo(generator = JSOGGenerator.class)
@JsonIgnoreProperties({
			 
			  "firmid"
			, "firm"
			, "serieskey"
			, "createon"
			, "modifyon"
			, "popularity"
			, "usersid" 
})
@Entity
@Table(name="user_roles_view")
public class UserRolesView extends SView  {

	private static final long serialVersionUID = 3628382769829283L;

	private Integer id;
	private String role;
	private String users;
	private Integer usersid;
	private String usersusercolor;

	public UserRolesView() {
	}

	public UserRolesView(Integer id, String role, String users,
			Integer usersid, String usersusercolor) {
		this.id = id;
		this.role = role;
		this.users = users;
		this.usersid = usersid;
		this.usersusercolor = usersusercolor;
	}

	@Id
	@Column(name="id")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="role")
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Column(name="users")
	public String getUsers() {
		return this.users;
	}

	public void setUsers(String users) {
		this.users = users;
	}

	@Column(name="usersid")
	public Integer getUsersid() {
		return this.usersid;
	}

	public void setUsersid(Integer usersid) {
		this.usersid = usersid;
	}

	@Column(name="usersusercolor")
	public String getUsersusercolor() {
		return this.usersusercolor;
	}

	public void setUsersusercolor(String usersusercolor) {
		this.usersusercolor = usersusercolor;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserRolesView))
			return false;
		UserRolesView castOther = (UserRolesView) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getRole() == castOther.getRole()) || (this.getRole() != null
						&& castOther.getRole() != null && this.getRole()
						.equals(castOther.getRole())))
				&& ((this.getUsers() == castOther.getUsers()) || (this
						.getUsers() != null && castOther.getUsers() != null && this
						.getUsers().equals(castOther.getUsers())))
				&& ((this.getUsersid() == castOther.getUsersid()) || (this
						.getUsersid() != null && castOther.getUsersid() != null && this
						.getUsersid().equals(castOther.getUsersid())))
				&& ((this.getUsersusercolor() == castOther.getUsersusercolor()) || (this
						.getUsersusercolor() != null
						&& castOther.getUsersusercolor() != null && this
						.getUsersusercolor().equals(
								castOther.getUsersusercolor())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getRole() == null ? 0 : this.getRole().hashCode());
		result = 37 * result
				+ (getUsers() == null ? 0 : this.getUsers().hashCode());
		result = 37 * result
				+ (getUsersid() == null ? 0 : this.getUsersid().hashCode());
		result = 37
				* result
				+ (getUsersusercolor() == null ? 0 : this.getUsersusercolor()
						.hashCode());
		return result;
	}
// #SETTER_AND_GETTER
	
// ------------------ Logic part ------------------
	
	public UserRolesView specialInit() {
	
		
		return this;
	}
	public UserRolesView init() {
		initList();
		initDicts();
		
		return this;
	}
	
	public UserRolesView customInitList(List<String> list) {
		
		return this;
	}
	
	public UserRolesView initList() {

		return this;
	}
	
	public UserRolesView initDicts() {
		return this;
	}
	
	
}