<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	    <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/css/toastr.min.css' />
<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/css/toastr.css' />
<script src="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/js/toastr.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Login Page</title>
<!--Made with love by Mutiullah Samim -->

<!--Bootsrap 4 CDN-->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<!--Fontawesome CDN-->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
	integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!--Custom styles-->
<style type="text/css">
body {
	margin: 0;
	color: #6a6f8c;
	background: #c8c8c8;
	font: 600 16px/18px 'Open Sans', sans-serif
}

.login-box {
	width: 100%;
	margin: auto;
	max-width: 525px;
	min-height: 670px;
	position: relative;
	background:
		url(https://images.unsplash.com/photo-1507208773393-40d9fc670acf?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1268&q=80)
		no-repeat center;
	box-shadow: 0 12px 15px 0 rgba(0, 0, 0, .24), 0 17px 50px 0
		rgba(0, 0, 0, .19)
}

.login-snip {
	width: 100%;
	height: 100%;
	position: absolute;
	padding: 90px 70px 50px 70px;
	background: rgba(0, 77, 77, .9)
}

.login-snip .login, .login-snip .sign-up-form {
	top: 0;
	left: 0;
	right: 0;
	bottom: 0;
	position: absolute;
	transform: rotateY(180deg);
	backface-visibility: hidden;
	transition: all .4s linear
}

.login-snip .sign-in, .login-snip .sign-up, .login-space .group .check {
	display: none
}

.login-snip .tab, .login-space .group .label, .login-space .group .button
	{
	text-transform: uppercase
}

.login-snip .tab {
	font-size: 22px;
	margin-right: 15px;
	padding-bottom: 5px;
	margin: 0 15px 10px 0;
	display: inline-block;
	border-bottom: 2px solid transparent
}

.login-snip .sign-in:checked+.tab, .login-snip .sign-up:checked+.tab {
	color: #fff;
	border-color: #1161ee
}

.login-space {
	min-height: 345px;
	position: relative;
	perspective: 1000px;
	transform-style: preserve-3d
}

.login-space .group {
	margin-bottom: 15px
}

.login-space .group .label, .login-space .group .input, .login-space .group .button
	{
	width: 100%;
	color: #fff;
	display: block
}

.login-space .group .input, .login-space .group .button {
	border: none;
	padding: 15px 20px;
	border-radius: 25px;
	background: rgba(255, 255, 255, .1)
}

.login-space .group input[data-type="password"] {
	text-security: circle;
	-webkit-text-security: circle
}

.login-space .group .label {
	color: #aaa;
	font-size: 12px
}

.login-space .group .button {
	background: #1161ee
}

.login-space .group label .icon {
	width: 15px;
	height: 15px;
	border-radius: 2px;
	position: relative;
	display: inline-block;
	background: rgba(255, 255, 255, .1)
}

.login-space .group label .icon:before, .login-space .group label .icon:after
	{
	content: '';
	width: 10px;
	height: 2px;
	background: #fff;
	position: absolute;
	transition: all .2s ease-in-out 0s
}

.login-space .group label .icon:before {
	left: 3px;
	width: 5px;
	bottom: 6px;
	transform: scale(0) rotate(0)
}

.login-space .group label .icon:after {
	top: 6px;
	right: 0;
	transform: scale(0) rotate(0)
}

.login-space .group .check:checked+label {
	color: #fff
}

.login-space .group .check:checked+label .icon {
	background: #1161ee
}

.login-space .group .check:checked+label .icon:before {
	transform: scale(1) rotate(45deg)
}

.login-space .group .check:checked+label .icon:after {
	transform: scale(1) rotate(-45deg)
}

.login-snip .sign-in:checked+.tab+.sign-up+.tab+.login-space .login {
	transform: rotate(0)
}

.login-snip .sign-up:checked+.tab+.login-space .sign-up-form {
	transform: rotate(0)
}

*, :after, :before {
	box-sizing: border-box
}

.clearfix:after, .clearfix:before {
	content: '';
	display: table
}

.clearfix:after {
	clear: both;
	display: block
}

a {
	color: inherit;
	text-decoration: none
}

.hr {
	height: 2px;
	margin: 60px 0 50px 0;
	background: rgba(255, 255, 255, .2)
}

.foot {
	text-align: center
}

.card {
	width: 500px;
	left: 100px
}

::placeholder {
	color: #b3b3b3
}
</style>
</head>
<body>
	<!--  
<div class="container">
	<div class="d-flex justify-content-center h-100">
		<div class="card">
			<div class="card-header">
				<h3>Sign In</h3>
				<div class="d-flex justify-content-end social_icon">
					<span><i class="fab fa-facebook-square"></i></span>
					<span><i class="fab fa-google-plus-square"></i></span>
					<span><i class="fab fa-twitter-square"></i></span>
				</div>
			</div>
			<div class="card-body">
					<s:form method="post" modelAttribute="Users" action="${pageContext.request.contextPath }/login/login.html">
            </h2>
            
	<s:input path="username" placeholder="username"/>
            
<s:password path="password" placeholder="password"/>            
            
            <input class="btn btn-primary" type="submit" value="Login" name="Action">
            
            </s:form>
                        <div class="message">${messageRegister}</div>
            
			</div>
			<div class="card-footer">
				<div class="d-flex justify-content-center links">
					Don't have an account?<a href="register.html">Sign Up</a>
				</div>
				<div class="d-flex justify-content-center">
					<a href="#">Forgot your password?</a>
				</div>
			</div>
		</div>
	</div>
</div>
-->
	<div class="row">
		<div class="col-md-6 mx-auto p-0">
			<div class="card">
				<div class="login-box">
					<div class="login-snip">
						<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label
							for="tab-1" class="tab">Login</label> <input id="tab-2"
							type="radio" name="tab" class="sign-up"><label
							for="tab-2" class="tab">Sign Up</label>
							
						<div class="login-space">
							<div class="login">
							<s:form method="post" modelAttribute="Users" action="${pageContext.request.contextPath }/login/login.html">
								<div class="group">
									<label for="user" class="label">Username</label> 
									<s:input path="username" placeholder="Enter your username" class="input"/>
									
								</div>
								<div class="group">
									<label for="pass" class="label">Password</label> 
									<s:password path="password" class="input" data-type="password" placeholder="Enter your password" /> 
									
								</div>
								
								<div class="group">
									<input type="submit" class="button" value="Sign In">
								</div>
									<center>
									<font color="red">
									<b>
									<div class="message">${messageRegister}<br>${error}</div>
									</b>
									</font>
									</center>
									
								<div class="hr"></div>
								<div class="foot">
																	<font color="red"><b><div id="yourpassword"></div></b></font>
								
								<label for="forgot">Your Username:</label>
								<input class="form-control" id="usernameForgot" placeholder="Input your username if you forgot password">
								<label for="forgot">Your Email:</label>
								<input class="form-control" id="emailForgot" placeholder="Input your email if you forgot password">
									<br>
									<a type="submit" class="btn btn-warning" onclick="forgotPassword()" ">Forgot Password?</a>
									
								</div>
								</s:form>
							</div>
							<div class="sign-up-form">
								<s:form method="post" modelAttribute="Users" action="${pageContext.request.contextPath }/login/register.html">
							
								<div class="group">
									<label for="user" class="label">Username</label> 
									<s:input path="username" class="input"
										placeholder="Create your Username"/>
									
									
								</div>
								<div class="group">
									<label for="pass" class="label">Password</label> 
									<s:password path="password" class="input" data-type="password"
										placeholder="Create your password" /> 
									
								</div>
								<div class="group">
									<label for="user" class="label">Email</label> 
									<s:input path="email" type="email" class="input"
										placeholder="Input your email"/>
									
									
								</div>
								
								<div class="group">
									<input type="submit" class="button" value="Sign Up">
								</div>
									<center>
									<font color="red">
									<b>
									<div class="message">${messageRegister}</div>
									</b>
									</font>
									</center>
								<div class="hr"></div>
								<div class="foot">
									<label for="tab-1">Already Member?</label>
								</div>
								</s:form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<script>
	
	function forgotPassword(){
		var username = $("#usernameForgot").val();
		var email = $("#emailForgot").val();
		if(email.length < 5){
			toastr.error('Email error');
		}else{
			$.get('http://localhost:8080/ASM_Java5_BanHang/api/forgotPassword.html?username='+username+'&email='+email+'').done(function (msg){
					var data = JSON.parse(msg);
					if(data.status == "false"){
						toastr.error(data.message, "PS10511");
					}else{
						$("#yourpassword").html("Your password: "+data.message);
						toastr.success("Success, your password id "+data.message+"", "PS10511");
					}
			})
		}
	}
	
	</script>
</body>
</html>