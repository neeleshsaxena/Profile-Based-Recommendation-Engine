

$(function() {
	
		var marketId = []; //returned from the API
		var allLatlng = []; //returned from the API
		var allMarkers = []; //returned from the API
		var marketName = []; //returned from the API
		var infowindow = null;
		var pos;
		var userCords;
		var tempMarkerHolder = [];
		
		//Start geolocation
		
		if (navigator.geolocation) {    
		
			function error(err) {
				console.warn('ERROR(' + err.code + '): ' + err.message);
			}
			
			function success(pos){
				userCords = pos.coords;
				
				//return userCords;
			}
		
			// Get the user's current position
			navigator.geolocation.getCurrentPosition(success, error);
			//console.log(pos.latitude + " " + pos.longitude);
			} else {
				alert('Geolocation is not supported in your browser');
			}
		
		//End Geo location
	
		//map options
		var mapOptions = {
			zoom: 5,
			center: new google.maps.LatLng(37.09024, -100.712891),
			panControl: false,
			panControlOptions: {
				position: google.maps.ControlPosition.BOTTOM_LEFT
			},
			zoomControl: true,
			zoomControlOptions: {
				style: google.maps.ZoomControlStyle.LARGE,
				position: google.maps.ControlPosition.RIGHT_CENTER
			},
			scaleControl: false

		};
		
		
		// call the notification only once.
		done();
		
		function done(){
			
				
				
				$.notify({
					title: '<strong>Welcome to Airbnb Recommendations!</strong>',
					message: ''
				},{
					type: 'success'
				});
				
				
				
			};
	//end of notification
			
			
			
			
	//Adding infowindow option
	infowindow = new google.maps.InfoWindow({
		content: "holding..."
	});
	
	
	//Fire up Google maps and place inside the map-canvas div
	map = new google.maps.Map(document.getElementById('map-canvas'), mapOptions);
	

	//grab form data
    $('#chooseZip').submit(function() { // bind function to submit event of form
		
		//define and set variables
		var userZip = $("#textZip").val();
		//console.log("This-> " + userCords.latitude);
		
		var accessURL;
		
		/*if(userZip){
			accessURL = "http://search.ams.usda.gov/farmersmarkets/v1/data.svc/zipSearch?zip=" + userZip;
		} else {
			accessURL = "http://search.ams.usda.gov/farmersmarkets/v1/data.svc/locSearch?lat=" + userCords.latitude + "&lng=" + userCords.longitude;
		}
			*/

			//Use the zip code and return all market ids in area.
			
		var counter = 0;

		 $.ajax({
	         type:"GET",
	         url:"readLocations",
	         success:function(data){     //data here should be listings objects

					for (var key in data) {    

						listing = data[key];
										
										//console.log(listing);
										
										//The API returns a link to Google maps containing lat and long. This pulls it apart.
										//var googleLink = results['GoogleLink'];
										//var latLong = decodeURIComponent(googleLink.substring(googleLink.indexOf("=")+1, googleLink.lastIndexOf("(")));
										
										//var split = latLong.split(',');
										
										//fetch the lat and long from each listing
										//covert values to floats, to play nice with .LatLng() below.
										//var des = listing['description'];
										//des = des.replace(/[^a-zA-Z0-9]/g,'');
										
										var latitude = parseFloat(listing['latitude']);
										var longitude = parseFloat(listing['longitude']);
										
										//set the markers.	  
										myLatlng = new google.maps.LatLng(latitude,longitude);
								  
										allMarkers = new google.maps.Marker({
											position: myLatlng,
											map: map,
											animation: google.maps.Animation.DROP,
											title: listing['description'],
											html: 
													'<div class="markerPop">' +
													'<h1 style="color:black;"> DESCRIPTION: ' + listing['description'] + '</strong></h1>&nbsp;' + //substring removes distance from title
													'<h3 style="color:black;"> LOCATION: ' + listing['smartLocation'] + '</h3>&nbsp;' +
													'<p style="color:black;"> PRICE:$  ' + listing['price'] + '</p>&nbsp;' +
													'<p style="color:black;"> Property Type: ' + listing['propertyType'] + '</p>&nbsp;' +
													'&nbsp;<img src =' + listing['url'] +  '>&nbsp;' +
													'</div>'
										});

										//put all lat long in array
										allLatlng.push(myLatlng);
										
										google.maps.event.addListener(allMarkers, 'click', function () {
											//alert("ghussa");
											if(this.getAnimation()!==null){
												this.setAnimation(null);
											}else{
												this.setAnimation(google.maps.Animation.BOUNCE);
											}
											infowindow.setContent(this.html);
											infowindow.open(map, this);
											
										});
										
										//Put the marketrs in an array
										tempMarkerHolder.push(allMarkers);
										
										counter++;
										//console.log(counter);
									};
										
										/*google.maps.event.addListener(tempMarkerHolder, 'click', function () {
											alert("ghussa");
											infowindow.setContent(this.html);
											infowindow.open(map, this);
										});*/
										
										
										//console.log(allLatlng);
										//  Make an array of the LatLng's of the markers you want to show
										//  Create a new viewpoint bound
										var bounds = new google.maps.LatLngBounds ();
										//  Go through each...
										for (var i = 0, LtLgLen = allLatlng.length; i < LtLgLen; i++) {
										  //  And increase the bounds to take this point
										  bounds.extend (allLatlng[i]);
										}
										//  Fit these bounds to the map
										map.fitBounds (bounds);
										
												
									}
								});
        return false; // important: prevent the form from submitting
    });
});
