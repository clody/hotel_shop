package org.test.shop.model.dao.view;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.test.shop.config.settings.NamedFilter;
import org.test.shop.controller.data.types.ScrollableSettings;
import org.test.shop.model.domain.SObject;
import org.test.shop.model.domain.entity.view.ServHotelSimpleView;
import org.test.shop.util.DaoUtil;
import org.test.shop.util.data.types.DateCompare;
import org.test.shop.util.data.types.FindByDateExample;
import org.test.shop.util.data.types.FindByExample;
import org.test.shop.util.data.types.TotalQuery;

@Repository
public class ServHotelSimpleViewDao {

	@PersistenceContext
	private EntityManager em;
	private String selectClause = "SELECT ser0 FROM ServHotelSimpleView ser0";
	private String updatePopularityClause = "UPDATE %s SET popularity = :popularity WHERE id = :id";
	private String shortName = "ser0";
	private String className = "ServHotelSimpleView";
	private String tableName = "serv_hotel_simple_view";

	public ServHotelSimpleView create(ServHotelSimpleView servhotelsimpleview) {
		em.persist(servhotelsimpleview);
		return servhotelsimpleview;
	}

	public ServHotelSimpleView update(ServHotelSimpleView servhotelsimpleview) {
		return em.merge(servhotelsimpleview);
	}
	
	public void popularityByKey(Object key) {
		ServHotelSimpleView servhotelsimpleview = findById(key, false);
		
		if(servhotelsimpleview != null){
			if (SObject.class.isAssignableFrom(ServHotelSimpleView.class)) {
				if (servhotelsimpleview.getPopularity() == null) {
					servhotelsimpleview.setPopularity(-1);
				}
				servhotelsimpleview.setPopularity(servhotelsimpleview.getPopularity() + 1);
				try {
					em.createNativeQuery(String.format(updatePopularityClause, tableName), ServHotelSimpleView.class)
							.setParameter("popularity", servhotelsimpleview.getPopularity())
							.setParameter("id", key)
							.executeUpdate();
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		}
	}
	
	public void popularity(ServHotelSimpleView item) {
		ServHotelSimpleView servhotelsimpleview = null;
		if(item != null){
			servhotelsimpleview = findById(item.getId(), false);
		}
		
		if(servhotelsimpleview != null){
			if (SObject.class.isAssignableFrom(ServHotelSimpleView.class)) {
				if (servhotelsimpleview.getPopularity() == null) {
					servhotelsimpleview.setPopularity(-1);
				}
				servhotelsimpleview.setPopularity(servhotelsimpleview.getPopularity() + 1);
				
				try {
					em.createNativeQuery(String.format(updatePopularityClause, tableName), ServHotelSimpleView.class)
							.setParameter("popularity", servhotelsimpleview.getPopularity())
							.setParameter("id", item.getId())
							.executeUpdate();
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		}
	}
	
	public Integer todayNumber(ScrollableSettings settings) throws Exception {
		String today = new SimpleDateFormat("YYYY-MM-dd").format(new Date());
		Query query = em.createNativeQuery(
				String.format(
						"SELECT count(*) from %s %s WHERE %s.firmid = %s and CAST(%s.createon as DATE) = CAST('%s' as DATE)"
						, tableName, shortName, shortName, settings.getSasUser().getUser().getFirmid(), shortName, today
				)
		);
		
		return ((BigInteger) query.getSingleResult()).intValue();
	}

	public Integer total(ScrollableSettings settings) throws Exception {
		TotalQuery totalQuery = DaoUtil.total(settings, ServHotelSimpleView.class, em);
		
		return ((BigInteger) totalQuery.getQuery().getSingleResult()).intValue();
	}
	
	public List<ServHotelSimpleView> namedFilter(ScrollableSettings settings) {
		List<ServHotelSimpleView> servhotelsimpleviews = new ArrayList<ServHotelSimpleView>();
		
		try {
			servhotelsimpleviews = DaoUtil.sasQueryByNamedFilter(NamedFilter.Items.byName(settings.getNamedfilter(), ServHotelSimpleView.class), settings,
				ServHotelSimpleView.class, em).getResultList();
		} catch (Exception e){
			e.printStackTrace();
		}
				
		return servhotelsimpleviews;
	}

	@SuppressWarnings("unchecked")
	public List<ServHotelSimpleView> search(ScrollableSettings settings){
		if(settings.getFilter() == null || settings.getFilter().replaceAll("\\s+", "").length() == 0){
			return new ArrayList<ServHotelSimpleView>();
		}
	
		FindByExample findByExample = DaoUtil.search(new ServHotelSimpleView(), settings.getFilter(), ServHotelSimpleView.class, em);
		Query query = null;
		
		if (findByExample.getIsNativeQuery()) {
			String queryString = DaoUtil.sasQueryRaw(findByExample.getSelectClause(), settings, ServHotelSimpleView.class, em);
			query = em.createNativeQuery(queryString.replace("SELECT " + shortName, "SELECT *").replace(className, DaoUtil.readTableName(ServHotelSimpleView.class)), ServHotelSimpleView.class);
			
			if(queryString.contains(":firmid")){
				query.setParameter("firmid", settings.getSasUser().getUser().getFirmid());
			}
			else if(queryString.contains(":firm")){
				query.setParameter("firm", settings.getSasUser().getUser().getFirmid());
			}
			
		}
		else {
			query = DaoUtil.sasQuery(findByExample.getSelectClause(), settings, ServHotelSimpleView.class, em);
		}
		
		query.setParameter("filter", findByExample.getFilter());
		if(findByExample.getSelectClause().contains("filterForInteger")){
			query.setParameter("filterForInteger", findByExample.getFilterForInteger());
		}
		
		return query.setMaxResults(100).getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<ServHotelSimpleView> findByExample(ServHotelSimpleView example, String delimitter, ScrollableSettings settings) {
		FindByExample findByExample = DaoUtil.findByExampleQueryRaw(example,
				ServHotelSimpleView.class, em, " " + delimitter + " ");
		Query query = DaoUtil.sasQuery(findByExample.getSelectClause(),
				settings, ServHotelSimpleView.class, em);
		for (String key : findByExample.getValues().keySet()) {
			query.setParameter(key, findByExample.getValues().get(key));
		}

		return query.setMaxResults(100).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<ServHotelSimpleView> findByExample2(ServHotelSimpleView example, DateCompare type) {
		FindByDateExample findByExample = DaoUtil.findByExample2(example, ServHotelSimpleView.class, em, type).init();
		return findByExample.getQuery().setMaxResults(100).getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<ServHotelSimpleView> findAll(ScrollableSettings settings) {
		List<ServHotelSimpleView> servhotelsimpleviews = DaoUtil.sasQuery(selectClause, settings,
				ServHotelSimpleView.class, em).getResultList();

		if (settings.getList().size() > 0) {
			for (ServHotelSimpleView item : servhotelsimpleviews) {
				item.customInit(item, settings.getList());
			}
		}

		if (settings.getInitLists() || settings.getInitDicts()) {
			for (ServHotelSimpleView item : servhotelsimpleviews) {
				if (settings.getInitDicts()) {
					item.initDicts();
				}
				if (settings.getInitLists()) {
					item.initList();
				}
			}
		}

		return servhotelsimpleviews;
	}

	@SuppressWarnings("unchecked")
	public List<ServHotelSimpleView> findAllScrollable(ScrollableSettings settings) {
		List<ServHotelSimpleView> servhotelsimpleviews = DaoUtil
				.sasQuery(selectClause, settings, ServHotelSimpleView.class, em)
				.setFirstResult(
						(settings.getPageNumber() - 1) * settings.getPageSize())
				.setMaxResults(settings.getPageSize()).getResultList();

		if (settings.getList().size() > 0) {
			for (ServHotelSimpleView item : servhotelsimpleviews) {
				item.customInit(item, settings.getList());
			}
		}

		if (settings.getInitLists() || settings.getInitDicts()) {
			for (ServHotelSimpleView item : servhotelsimpleviews) {
				if (settings.getInitDicts()) {
					item.initDicts();
				}
				if (settings.getInitLists()) {
					item.initList();
				}
			}
		}

		return servhotelsimpleviews;
	}

	public ServHotelSimpleView findById(Object key, Boolean initAll) {
		ServHotelSimpleView item = em.find(ServHotelSimpleView.class, key);
		
		if(item != null){
			if (initAll) {
				item.init();
			}
		}
		
		return item;
	}

	public ServHotelSimpleView findById(ScrollableSettings settings) {
		ServHotelSimpleView item = em.find(ServHotelSimpleView.class, settings.getId());

		if(item != null){
			if (settings.getList().size() > 0) {
				item.customInit(item, settings.getList());
			}
	
			if (settings.getInitDicts()) {
				item.initDicts();
			}
	
			if (settings.getInitLists()) {
				item.initList();
			}
			
			try {
				item.specialInit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return item;
	}

	public Boolean delete(Object id) {
		try {
			em.remove(em.getReference(ServHotelSimpleView.class, id));
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

}
