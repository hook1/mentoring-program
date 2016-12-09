var adminApp = angular.module("adminApp", ['ngResource']);
/*'adminApp.UsersController', 'adminApp.UsersService',*/

adminApp.service('UsersService', function ($log, $http, $resource) {
    return {
        getAll: function () {
            return $http.get("/admin/home/getAllUsers");
        }
    }
});
adminApp.controller('UsersController', function ($scope, $log, UsersService) {
    UsersService.getAll().then(function (response) {
        $log.log(response)
        $scope.users = response.data;
    });
});


/*
 var adminApp = angular.module("adminApp", []);
 adminApp.controller("userCtrl", ['$scope', '$http',
 function ($scope, $http) {
 $http({
 method: 'GET',
 url: '/getAllUsers'
 }).success(function (data, status, headers, config) {
 $scope.profiles = data;
 }).error(function (data, status, headers, config) {
 alert("falure");
 })
 }])
 */
