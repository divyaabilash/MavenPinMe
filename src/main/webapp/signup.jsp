<!Doctype html>
<html>
<head>

<%@ include file="import.jsp"%>
<title>Pin Me</title>
</head>
<body class="padding">
	<header class="adjust">
		<div class="icon">
			<img src="images/icon.png" alt="pin image">
		</div>
		<h1 class="header">Pin Me!</h1>
		<div class="buttons">
			<a href="index.jsp"><button class="button">Log in</button></a>
		</div>
	</header>
	<section class="divider"></section>

	<form action="SignUp" method="post"
		onsubmit="return validationSignup()">
		<fieldset class="signinup validationSignup">
			<div id="error"></div>
			<div>
				<label>FirstName:<sup>*</sup><input type="text"
					name="firstname" id='firstname' placeholder="John" required></label>
			</div>
			<div>
				<label>LastName:<sup>*</sup><input type="text"
					name="lastname" id="lastname" placeholder="Max" required></label>
			</div>
			<div>
				<label>UserName:<sup>*</sup><input type="text"
					name="username" id="username" placeholder="Maxjohn" required></label>
			</div>
			<div>
				<label>Password:<sup>*</sup><input type="password"
					name="password" id="password" placeholder="xxxx" required></label>
			</div>
			<div>
				<label>Confirm Password:<sup>*</sup><input type="password"
					name="confirmpassword" id="confirmpassword"
					placeholder="Confirm Your Password" required onblur="checkpsd()"></label>
			</div>
			<div>
				<label>Email Id:<sup>*</sup><input type="email" name="email"
					id="email" placeholder="abc@xxx.com" required></label>
			</div>
			<div>
				<button type="submit" class="button">Sign up</button>
			</div>
		</fieldset>

	</form>

	<footer>
		@CopyRights:Pin Me <br> developed by Prathyusha
		Rani,Prathyusha,Shiva & Divya
	</footer>
	<Script src="js/app.js"></Script>
</body>
</html>