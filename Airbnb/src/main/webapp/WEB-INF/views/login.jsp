<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> User Login Screen</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- Custom CSS -->
    <link href="resources/assets/css/ride.css"  rel="stylesheet">
      
    <!-- Fonts -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

	<div class="brand"> Welcome To Airbnb</div>
   <!-- <div class="address-bar">125 Park Drive | Boston, MA 02215 </div> --> 

   

    <div class= "container">
        <div class="row">
            
                <div class ="col-lg-4">
                    
                </div>

                <div  class="col-lg-4">
                    <div class="box" id="log">
					<form:form class="form-login" method="POST" action="index">
						<div class="form-group">
							<label for="user">Username</label> <input type="text"
								class="form-control" name="userID"  id="usertxt"
								placeholder="Enter UserName" required>
								<span class="alert">Username is Empty!</span> </br> <label
								for="password">Password</label> <input type="password"
								class="form-control" name="password" id="password" required
								placeholder="Enter Password"><span class="alert">Password is Empty!</span>
								 </br> </br>
								
							
							<div class="wrap">
							<!-- 	<button class="btn btn-default btn-md " type="submit">Log
									In</button>-->
									<button type="submit" class="btn btn-info btn-mg" value="Submit Button">
									Log
									In</button>
								<!--  <span class="alert" id="invaliduser">Invalid Creds!</span>
								<a data-toggle="modal" href="#checkUser" class="btn btn-default btn-md logout" >Sign Up</a> -->

							</div>


						</div>
					</form:form>

				</div>      
                </div>
                <div class="col-lg-4 loginscreen">
                    
                   

                </div>

            
   
        </div>    
    </div>
    
    
    
    
<script type="text/javascript" src="resources/assets/js/source/backstretch.js"></script>
   <script type="text/javascript">
   $.backstretch("resources/assets/images/airbnb.jpg");
   </script>
</body>
</html>