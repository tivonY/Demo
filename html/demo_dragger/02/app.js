var app = angular.module('plunker', ['tableColumnDragDropModule']);

app.controller('MainCtrl', function($scope) {
  $scope.name = 'World';
  
  $scope.data=[];
  $scope.data.push(['column1','column2','column3','column4','column5']);
  $scope.data.push(['column1','column2','column3','column4','column5']);
  $scope.data.push(['column1','column2','column3','column4','column5']);
  $scope.data.push(['column1','column2','column3','column4','column5']);
}
);
