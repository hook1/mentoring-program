/**
 * Created by taras on 10.12.2016.
 */

var AdminAngularSpringApp = {};
var App = angular.module('AdminAngularSpringApp', ['AdminAngularSpringApp.filters',
    'AdminAngularSpringApp.services', 'AdminAngularSpringApp.directives']);

App.config(['$routeProvider', function ($routeProvider) {
    /* $routeProvider.when('../../../static//userEditProfile', {
     templateUrl: '/user/userEditProfile',
     controller: UserProfileEditController
     });

     $routeProvider.when('/userProfile', {
     templateUrl: '/user/userProfile',
     controller: UserProfileController
     });*/

    $routeProvider.when('/groups', {
        templateUrl: 'admin/groups',
        controller: GroupsController
    });
    /*$routeProvider.otherwise({redirectTo: '/'});*/
}]);


/*var adminApp = angular.module("adminApp", ['ngResource']);
 'adminApp.UsersController', 'adminApp.UsersService',

 adminApp.service('UsersService', function ($log, $http, $resource) {
 return {
 getAll: function () {
 return $http.get("/admin/home");
 }
 }
 });
 adminApp.controller('UsersController', function ($scope, $log, UsersService) {
 UsersService.getAll().then(function (response) {
 $log.log(response)
 $scope.users = response.data;
 });
 });*/