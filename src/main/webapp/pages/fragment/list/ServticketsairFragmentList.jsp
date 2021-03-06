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
						<th ng-if="::checkVisibility('datestartdep')">
							<div ng-click="sort('datestartdep')" >
								<a class="sortable-column-name"><span><spring:message code="label.dateStartDep" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.dateStartDep, 'fa-caret-up': !details.dateStartDep }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('dateendarrival')">
							<div ng-click="sort('dateendarrival')" >
								<a class="sortable-column-name"><span><spring:message code="label.dateEndArrival" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.dateEndArrival, 'fa-caret-up': !details.dateEndArrival }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('dateenddep')">
							<div ng-click="sort('dateenddep')" >
								<a class="sortable-column-name"><span><spring:message code="label.dateEndDep" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.dateEndDep, 'fa-caret-up': !details.dateEndDep }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('datestartarrival')">
							<div ng-click="sort('datestartarrival')" >
								<a class="sortable-column-name"><span><spring:message code="label.dateStartArrival" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.dateStartArrival, 'fa-caret-up': !details.dateStartArrival }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('dictglobalbytypeplanearrivalid')">
							<div ng-click="sort('dictglobalbytypeplanearrivalid')" >
								<a class="sortable-column-name"><span><spring:message code="label.dictGlobalByTypePlaneArrivalId" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.dictGlobalByTypePlaneArrivalId, 'fa-caret-up': !details.dictGlobalByTypePlaneArrivalId }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('tmaccountbyaircompanyarrivalid')">
							<div ng-click="sort('tmaccountbyaircompanyarrivalid')" >
								<a class="sortable-column-name"><span><spring:message code="label.tmAccountByAirCompanyArrivalId" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.tmAccountByAirCompanyArrivalId, 'fa-caret-up': !details.tmAccountByAirCompanyArrivalId }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('dictglobalbyairclassid')">
							<div ng-click="sort('dictglobalbyairclassid')" >
								<a class="sortable-column-name"><span><spring:message code="label.dictGlobalByAirclassId" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.dictGlobalByAirclassId, 'fa-caret-up': !details.dictGlobalByAirclassId }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('currcurrency')">
							<div ng-click="sort('currcurrency')" >
								<a class="sortable-column-name"><span><spring:message code="label.currCurrency" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.currCurrency, 'fa-caret-up': !details.currCurrency }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('dictglobalbytypeplanedepid')">
							<div ng-click="sort('dictglobalbytypeplanedepid')" >
								<a class="sortable-column-name"><span><spring:message code="label.dictGlobalByTypePlaneDepId" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.dictGlobalByTypePlaneDepId, 'fa-caret-up': !details.dictGlobalByTypePlaneDepId }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('tmaccountbyaccountid')">
							<div ng-click="sort('tmaccountbyaccountid')" >
								<a class="sortable-column-name"><span><spring:message code="label.tmAccountByAccountId" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.tmAccountByAccountId, 'fa-caret-up': !details.tmAccountByAccountId }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('tmaccountbyaircompanydepid')">
							<div ng-click="sort('tmaccountbyaircompanydepid')" >
								<a class="sortable-column-name"><span><spring:message code="label.tmAccountByAirCompanyDepId" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.tmAccountByAirCompanyDepId, 'fa-caret-up': !details.tmAccountByAirCompanyDepId }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('citybackarrivalid')">
							<div ng-click="sort('citybackarrivalid')" >
								<a class="sortable-column-name"><span><spring:message code="label.cityBackArrivalId" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.cityBackArrivalId, 'fa-caret-up': !details.cityBackArrivalId }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('citytherearrivalid')">
							<div ng-click="sort('citytherearrivalid')" >
								<a class="sortable-column-name"><span><spring:message code="label.cityThereArrivalId" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.cityThereArrivalId, 'fa-caret-up': !details.cityThereArrivalId }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('numflightdep')">
							<div ng-click="sort('numflightdep')" >
								<a class="sortable-column-name"><span><spring:message code="label.numFlightDep" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.numFlightDep, 'fa-caret-up': !details.numFlightDep }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('numflightarrival')">
							<div ng-click="sort('numflightarrival')" >
								<a class="sortable-column-name"><span><spring:message code="label.numFlightArrival" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.numFlightArrival, 'fa-caret-up': !details.numFlightArrival }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('citytheredepid')">
							<div ng-click="sort('citytheredepid')" >
								<a class="sortable-column-name"><span><spring:message code="label.cityThereDepId" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.cityThereDepId, 'fa-caret-up': !details.cityThereDepId }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('citybackdepid')">
							<div ng-click="sort('citybackdepid')" >
								<a class="sortable-column-name"><span><spring:message code="label.cityBackDepId" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.cityBackDepId, 'fa-caret-up': !details.cityBackDepId }"></i>
							</div>
						</th>
						<th ng-if="::checkVisibility('airname')">
							<div ng-click="sort('airname')" >
								<a class="sortable-column-name"><span><spring:message code="label.airName" /></span></a>
								<i class="fa" ng-class="{ 'fa-caret-down': details.airName, 'fa-caret-up': !details.airName }"></i>
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
						<tr ng-repeat="item in selectedItem.servTicketsAirs track by $index">
						<td ng-if="::checkVisibility('label')"><label>{{ ::item.label }}</label></td>
						<td ng-if="::checkVisibility('price')"><label>{{ ::item.price }}</label></td>
						<td ng-if="::checkVisibility('datestartdep')"><label>{{ ::item.datestartdep }}</label></td>
						<td ng-if="::checkVisibility('dateendarrival')"><label>{{ ::item.dateendarrival }}</label></td>
						<td ng-if="::checkVisibility('dateenddep')"><label>{{ ::item.dateenddep }}</label></td>
						<td ng-if="::checkVisibility('datestartarrival')"><label>{{ ::item.datestartarrival }}</label></td>
						<td ng-if="::checkVisibility('dictglobalbytypeplanearrivalid')"><label>{{ ::item.dictglobalbytypeplanearrival }}</label></td>
						<td ng-if="::checkVisibility('tmaccountbyaircompanyarrivalid')"><label>{{ ::item.tmaccountbyaircompanyarrival }}</label></td>
						<td ng-if="::checkVisibility('dictglobalbyairclassid')"><label>{{ ::item.dictglobalbyairclass }}</label></td>
						<td ng-if="::checkVisibility('currcurrency')"><label>{{ ::item.currcurrency }}</label></td>
						<td ng-if="::checkVisibility('dictglobalbytypeplanedepid')"><label>{{ ::item.dictglobalbytypeplanedep }}</label></td>
						<td ng-if="::checkVisibility('tmaccountbyaccountid')"><label>{{ ::item.tmaccountbyaccount }}</label></td>
						<td ng-if="::checkVisibility('tmaccountbyaircompanydepid')"><label>{{ ::item.tmaccountbyaircompanydep }}</label></td>
						<td ng-if="::checkVisibility('citybackarrivalid')"><label>{{ ::item.citybackarrival }}</label></td>
						<td ng-if="::checkVisibility('citytherearrivalid')"><label>{{ ::item.citytherearrival }}</label></td>
						<td ng-if="::checkVisibility('numflightdep')"><label>{{ ::item.numflightdep }}</label></td>
						<td ng-if="::checkVisibility('numflightarrival')"><label>{{ ::item.numflightarrival }}</label></td>
						<td ng-if="::checkVisibility('citytheredepid')"><label>{{ ::item.citytheredep }}</label></td>
						<td ng-if="::checkVisibility('citybackdepid')"><label>{{ ::item.citybackdep }}</label></td>
						<td ng-if="::checkVisibility('airname')"><label>{{ ::item.airname }}</label></td>
						<td ng-if="::checkVisibility('descr')"><label>{{ ::item.descr }}</label></td>
						</tr>
					</tbody>
				</table>
				<div>
					<spring:message code="default.total" />: {{ filteredServTicketsAir.length }}/{{ selectedItem.servTicketsAirs.length }}
				</div>
			  </div>
		</div>
	</div>
</div>