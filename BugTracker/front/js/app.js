var app = angular.module('myApp', []);

app.controller('BugCtrl', function($scope) {
	$scope.bugs = [{
		          'sommaire':'contenu sommaire bug1',
		          'description':'La description du bug1',
		          'statut':'en revue'
		        },
		        {
		          'sommaire':'contenu sommaire bug2',
		          'description':'La description du bug2',
		          'statut':'créé'
		        }];
});