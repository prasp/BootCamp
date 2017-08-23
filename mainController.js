(function() {
       var app = angular.module("facebook", []);

       var mainCtrl = function($scope, $http) {
              var accessToken = "EAACEdEose0cBAJKh08dJO58VXocLqN7VcumLgXRqzMNRHx5gOe46ZB6ZAL5q5p5oxNimfOuDKETPChsNsC1RkAmgE66eLfZA62bj27ob7yQSTXQVZBLk5Ssi10n3pg6fyq3USm2wrjZBJuH8fHeAWyb6r4gBfRROGys535dY0aCpaVTZBTb6r4o1Iq5PD4ZCuCl3AxOKyozSBe7fjK80eaL2gVfKRg5GNsZD";

              var url = "https://graph.facebook.com/v2.10";
              
              var userid=$scope.userid;
              
              //var promise = $http.get(url+"/me?fields=about,name,id&+access_token="+accessToken);
              
              var onUserComplete=function(response){
                     $scope.user=response.data;
              };
              var onError=function(reason){
                     $scope.error=reason;
              };
              
              $scope.search= function(){
                     $http.get(url+ "/" + $scope.userid + "?fields=about,name&access_token="+accessToken).then(onUserComplete);
              }
              
              //$http.get(url+"/me?fields=about,name&access_token="+accessToken).then(onUserComplete);
              //$http.get(url+"/me?access_token="+accessToken).then(onUserComplete);
              //$http.get(url+"/me?access_token="+accessToken).then(onUserComplete,onError());
              
              /*promise.then(function (response){
                     $scope.user=response.data;
              })*/
              
              //$scope.name="sample name"
       }
       app.controller("mainController",mainCtrl);

}())
