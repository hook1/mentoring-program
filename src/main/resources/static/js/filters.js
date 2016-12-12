'use strict';

/* Filters */

var AdminAppFilters = angular.module('AdminAngularSpringApp.filters', []);

AdminAppFilters.filter('interpolate', ['version', function (version) {
    return function (text) {
        return String(text).replace(/\%VERSION\%/mg, version);
    }
}]);
