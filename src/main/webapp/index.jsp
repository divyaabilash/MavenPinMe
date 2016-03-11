<!Doctype html>
<html>

<head>
  <%@ include file="import.jsp" %>
<link rel="icon" href="images/pinfavicon.ico" />
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
			</a> <a href="login.jsp">
				<button class="button">Log In</button>
			</a>
		</div>
	</header>
	<section class="divider"></section>
	<nav class="navigation">
		<ul>
			<li><a href="#">Home</a></li>
			<li><a href="#aboutus">Get Intro to Us</a></li>
			<li><a href="#contact">Contact Us</a></li>
		</ul>
	</nav>
	<section class="coupon coupons" id="home">
		<ul id="couponlist">
		</ul>
	</section>
	<section id="aboutus">
		<em>Pin ME</em> is the destination for you to have find out your local
		events happening around you. <br> Local events could be anything
		from our rage of categories we have that is Food, Clothing,
		Entertainment, Recreation. <br> We created this project,as an
		oppurunity given to develop a open source module for nonprofit
		organization to use as platform for their activities.
	</section>

	<section id="contact">
		<fieldset>
			<h1>Contact Details</h1>
			<div>
				<label>Name:<input type="text" name="name" id="name"></label>
			</div>
			<div>
				<label>Email:<input type="email" name="email" id="email"></label>
			</div>
			<div>
				<label>Message:</label>
			</div>
			<div>
				<textarea id="msg" rows="20" cols="100"></textarea>
			</div>
			<div>
				<a
					href="mailto:someone@example.com?Subject=Hello%20contacting%20Pin%20Me"
					target="_top">
					<button type="submit" class="button set">Send</button>
				</a>
				<button type="reset" value="reset" class="button set">Reset</button>
			</div>
		</fieldset>
	
	</section>

	<footer>
		&copy; CopyRights:Pin Me <br> developed by Prathyusha
		Rani,Prathyusha,Shiva and Divya
	</footer>
	<script type="text/javascript" src="js/homepage.js"></script>
</body>
<script>
	$(document).ready(function() {
		indexloadData();
	});
</script>
</html>
