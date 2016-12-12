'use strict';

/* Directives */

var AdminAppDirectives = angular.module('AdminAngularSpringApp.directives', []);

AdminAppDirectives.directive('adminAppVersion', ['version', function (version) {
    return function (scope, elm, attrs) {
        elm.text(version);
    };
}]);
