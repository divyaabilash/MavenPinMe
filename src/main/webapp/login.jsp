<!Doctype html>
<html>
<head>
  <%@ include file="import.jsp" %>
<title>Pin Me</title>
</head>
<body class="padding">
	<header>
		<div class="icon">
			<img src="images/icon.png" alt="pin image">
		</div>
		<h1 class="header">Pin Me!</h1>
		<div class="buttons">
		<a href="signup.jsp">
			
				<button class="button">Sign Up</button>
		</a></div>
		
	</header>
	<section class="divider"></section>
	<section class="login">

		<div class="col-md-4 col-md-offset-4">
			<form action="LoginServlet" method="Post"
				onsubmit="return validateForm()">
				<div class="form-group">
					<label for="exampleInputEmail1">Email address</label> <input
						type="email" class="form-control" id="userEmail" name="userEmail"
						placeholder="Email or Username">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Password</label> <input
						type="password" class="form-control" id="Password" name="Password"
						placeholder="XXXX">
				</div>

				<button type="submit" class="button">Login</button>
			</form>
		</div>


	</section>
	
	<footer>
		@CopyRights:Pin Me <br> developed by Prathyusha
		Rani,Prathyusha,Shiva & Divya
	</footer>

</body>
</html>