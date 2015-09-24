<span
	ng-mouseleave="reset()"
	ng-keydown="onKeydown($event)"
	tabindex="0"
	role="slider"
	aria-valuemin="0"
	aria-valuemax="{{range.length}}"
	aria-valuenow="{{value}}">
    <i  ng-repeat="r in range track by $index"
		ng-mouseenter="enter($index + 1)"
		ng-click="rate($index + 1)"
		class="glyphicon"
		ng-class="$index < value && (r.stateOn || 'glyphicon-star') || (r.stateOff || 'glyphicon-star-empty')">
        <span class="sr-only">({{ $index < value ? '*' : ' ' }})</span>
    </i>
</span>