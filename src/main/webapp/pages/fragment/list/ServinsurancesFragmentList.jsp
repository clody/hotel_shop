<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true"%>    
<div class="padding-top-10">
	<div class="row">
			<div class="col-md-12">
			  <div class="table-responsive">
				<table class="table table-hover table-striped table-bordered">
					<thead>
						<tr>
						<th ng-if="::checkVisibility('label')">
							<div ng-click="sort('label')" >
								<a class="sortable-column-name"><span><spring:message code="label.label" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.label, 'fa-caret-up': !details.label }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('price')">
							<div ng-click="sort('price')" >
								<a class="sortable-column-name"><span><spring:message code="label.price" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.price, 'fa-caret-up': !details.price }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('dateto')">
							<div ng-click="sort('dateto')" >
								<a class="sortable-column-name"><span><spring:message code="label.dateto" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.dateto, 'fa-caret-up': !details.dateto }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('datefrom')">
							<div ng-click="sort('datefrom')" >
								<a class="sortable-column-name"><span><spring:message code="label.datefrom" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.datefrom, 'fa-caret-up': !details.datefrom }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('tmaccountbyaccountid')">
							<div ng-click="sort('tmaccountbyaccountid')" >
								<a class="sortable-column-name"><span><spring:message code="label.tmAccountByAccountId" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.tmAccountByAccountId, 'fa-caret-up': !details.tmAccountByAccountId }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('tmaccountbyinsaccountid')">
							<div ng-click="sort('tmaccountbyinsaccountid')" >
								<a class="sortable-column-name"><span><spring:message code="label.tmAccountByInsAccountId" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.tmAccountByInsAccountId, 'fa-caret-up': !details.tmAccountByInsAccountId }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('locationcountries')">
							<div ng-click="sort('locationcountries')" >
								<a class="sortable-column-name"><span><spring:message code="label.locationCountries" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.locationCountries, 'fa-caret-up': !details.locationCountries }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('currcurrency')">
							<div ng-click="sort('currcurrency')" >
								<a class="sortable-column-name"><span><spring:message code="label.currCurrency" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.currCurrency, 'fa-caret-up': !details.currCurrency }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('dictglobal')">
							<div ng-click="sort('dictglobal')" >
								<a class="sortable-column-name"><span><spring:message code="label.dictGlobal" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.dictGlobal, 'fa-caret-up': !details.dictGlobal }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('insurancename')">
							<div ng-click="sort('insurancename')" >
								<a class="sortable-column-name"><span><spring:message code="label.insuranceName" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.insuranceName, 'fa-caret-up': !details.insuranceName }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('descr')">
							<div ng-click="sort('descr')" >
								<a class="sortable-column-name"><span><spring:message code="label.descr" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.descr, 'fa-caret-up': !details.descr }"></i>
							</div>
						</th>

						</tr>
					</thead>
					<tbody>
						<tr ng-repeat="item in selectedItem.servInsuranceses track by $index">
						<td ng-if="::checkVisibility('label')"><label>{{ ::item.label }}</label></td>
						<td ng-if="::checkVisibility('price')"><label>{{ ::item.price }}</label></td>
						<td ng-if="::checkVisibility('dateto')"><label>{{ ::item.dateto }}</label></td>
						<td ng-if="::checkVisibility('datefrom')"><label>{{ ::item.datefrom }}</label></td>
						<td ng-if="::checkVisibility('tmaccountbyaccountid')"><label>{{ ::item.tmaccountbyaccount }}</label></td>
						<td ng-if="::checkVisibility('tmaccountbyinsaccountid')"><label>{{ ::item.tmaccountbyinsaccount }}</label></td>
						<td ng-if="::checkVisibility('locationcountries')"><label>{{ ::item.locationcountries }}</label></td>
						<td ng-if="::checkVisibility('currcurrency')"><label>{{ ::item.currcurrency }}</label></td>
						<td ng-if="::checkVisibility('dictglobal')"><label>{{ ::item.dictglobal }}</label></td>
						<td ng-if="::checkVisibility('insurancename')"><label>{{ ::item.insurancename }}</label></td>
						<td ng-if="::checkVisibility('descr')"><label>{{ ::item.descr }}</label></td>
						</tr>
					</tbody>
				</table>
				<div>
					<spring:message code="default.total" />: {{ filteredServInsurances.length }}/{{ selectedItem.servInsuranceses.length }}
				</div>
			  </div>
		</div>
	</div>
</div>