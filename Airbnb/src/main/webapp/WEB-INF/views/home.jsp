<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<title>Airbnb Top Recommendations</title>
<meta name="viewport" content="initial-scale=1.0, user-scalable=no">
<meta charset="utf-8">

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Custom CSS -->
<link href="resources/assets/css/style.css" rel="stylesheet">
<link href="resources/assets/css/reset.css" rel="stylesheet">


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBaX_fsGojcXVSmgkvymzwrTyZNlEUHbqk"></script>

<!-- Javascript -->
<script type="text/javascript" src="resources/assets/js/map.js"></script>
<script type="text/javascript" src="resources/assets/js/search.js"></script>
</head>
<body>

	<div id="control">
		<h2>Find Your Top Airbnb Recomendations</h2>
		<hr>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<p>We'll help you locate your closest places. Simply choose an
			option below to begin...</p>
		
		&nbsp;
		&nbsp;
		&nbsp;
		&nbsp;
		&nbsp;
		<div>
		<hr>
		<div class="profile">
			<ul class="userProfile">
         <li class="title">
			Welcome <span>${user.firstName}!</span>
		</li>
		<ul>
			<li>
				Age Group:<span>${user.ageGroup}</span>
			</li>
			<li>
				Profession:<span>${user.profession}</span>
			</li>
			<li>
				Hobbies:<span>${user.hobbies}</span>
			</li>
			<li>
				Gender:<span>${user.gender}</span>
			</li>
		</ul>
	</ul>	
		
		</div>
		<form method="get" id="chooseZip">
			
			<button type="submit" class="learnButton"> Recommend Me !</button>
			
			<div class="clear"></div>
			
			<div class="clear"></div>
		</form>
	</div>
		
	<!--  	<div class="social">

			<div class="twitter">
				<a href="https://twitter.com/share" class="twitter-share-button"
					data-via="pauldessert">Tweet</a>
				<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);}}(document, 'script', 'twitter-wjs');</script>
			</div>

			<div class="facebook">
				<iframe
					src="//www.facebook.com/plugins/like.php?href=http%3A%2F%2Fwww.seedtip.com&amp;width&amp;layout=button_count&amp;action=like&amp;show_faces=true&amp;share=true&amp;height=21&amp;appId=752601418144350"
					scrolling="no" frameborder="0"
					style="border: none; overflow: hidden; height: 21px;"
					allowTransparency="true"></iframe>
			</div>


		</div>-->
		
		<div class="clear"></div>
		<div id="results"></div>
		
	</div>
	
	
	
	<!-- an empty div for the map -->
	<div id="map-canvas"></div>
	
	
	<script type="text/javascript" src="resources/assets/js/source/bootstrap-notify.js"></script>
<script type="text/javascript" src="resources/assets/js/source/bootstrap-notify.min.js"></script>
</body>
</html>
