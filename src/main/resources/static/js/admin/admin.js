var adminApp = angular.module("adminApp", ['ngResource']);
/*'adminApp.UsersController', 'adminApp.UsersService',*/

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
});