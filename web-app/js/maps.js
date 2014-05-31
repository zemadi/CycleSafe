function initialize() {
    
	var mapOptions = {
        center: new google.maps.LatLng(37.3333, -121.9000),
        zoom: 13,
        mapTypeId: google.maps.MapTypeId.satellite
    };
    
    map = new google.maps.Map(document.getElementById("map-canvas"), mapOptions);
    
    putRandomMarkers([
        { x: 24.826936549881115, y: 67.07192016601562 },
        { x: 24.836936549881115, y: 67.06592016601562 },
        { x: 24.828936549881115, y: 67.07892016601562 },
        { x: 24.829936549881115, y: 67.07992016601562 },
        { x: 24.887936549881115, y: 67.01892016601562 },
        { x: 24.885936549881115, y: 67.02892016601562 },
        { x: 24.858936549881115, y: 67.02192016601562 },
        { x: 24.879936549881115, y: 67.02492016601562 },
        { x: 24.890936549881115, y: 67.02792016601562 },
        { x: 24.876936549881115, y: 67.02192016601562 },
        { x: 24.875936549881115, y: 67.02182016601562 }
    ]);

        google.maps.event.addListener(map, 'click', function (event) {

            var button = $('#reportCrime')
            if (button.hasClass('locate')) {
                button.html('Report a Crime');
                button.removeClass('locate');
                button.addClass('report');
                $('#reportMessage').slideUp();
                $('#crime-request-region').slideDown();
              
                $('#reportOkay').unbind().bind('click', function () {
                               	
                	var marker = new google.maps.Marker({
                        position: event.latLng,
                        map: map,
                        title: "Mugging Incident"
                    });
                    $('#crime-request-region').slideUp();
                    return false;
                });
            }
        });
}
google.maps.event.addDomListener(window, 'load', initialize);

function putRandomMarkers(markers) {
    var iconBase = 'images/';
    for (var i = 0; i < markers.length; i++) {
  	type = 'motorcycle';
     if(i%2==0)
      type = 'car';
     if(i%3==0)
      type = 'phones';
     
         marker = new google.maps.Marker({
            position: new google.maps.LatLng(markers[i].x, markers[i].y),
            map: map,
            icon: iconBase + type +'.png',
            title: type + " Incident"
        });
    }
}
$(document).ready(function () {
    $('#reportCrime').click(function (event) {
        debugger;
        var clicked = $(event.currentTarget);
        if (clicked.hasClass('report')) {
            clicked.html('Locating ...');
            clicked.removeClass('report');
            clicked.addClass('locate');
            $('#reportMessage').slideDown();
            
        }
        return false;
        var db = event.latLng;
        alert(db);
       
    });

    $('#cancelReport').click(function (event) {
        var button = $('#reportCrime');
        if (button.hasClass('locate')) {
            button.html('Report a Crime');
            button.removeClass('locate');
            button.addClass('report');
            $('#reportMessage').slideUp();
        }
        return false;
    });
    
   
    
});

