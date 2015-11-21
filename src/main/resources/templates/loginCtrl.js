angular.module('myApp', [])

.controller('loginCtrl', function($scope) {
	
	$scope.heading = {name:'Auto Insurance', desc:'Insure your vehicles' }
	$scope.failure = {head:'Failure! ', desc:'Your login attempt was not successful, try again with correct credentials.'}
	$scope.success = {head:'Success! ', desc:'You have been logged out.'}
	
});