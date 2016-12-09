angular
    .module('myApp', ['ngResource'])
    .service('UsersService', function ($log, $http, $resource) {
        return {
            getAll: function () {
                return $http.get("http://localhost:8080/admin/home/getAllUsers");
            }
        }
    })
    .controller('UsersController', function ($scope, $log, UsersService) {
        UsersService.getAll().then(function(response) {
            $log.log(response)
            $scope.users=response.data;
        });
    });
