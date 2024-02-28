var map = L.map('map').setView([51.505, -0.09], 13);

L.tileLayer('http://{s}.tile.osm.org/{z}/{x}/{y}.png', {
	maxZoom: 18
}).addTo(map);

/*
var cities = [
  {name: "London", coords: [51.505, -0.09]},
// 여기에 원하는 다른 도시들의 정보를 추가할 수 있습니다.
];
cities.forEach(function(city) {
  var marker = L.marker(city.coords).addTo(map);
marker.bindPopup(city.name);
marker.on('click', function(e) {
// 사용자가 마커를 클릭했을 때 수행할 작업을 여기에 작성합니다.
alert(city.name + '를 선택하셨습니다.');
  });
});

*/