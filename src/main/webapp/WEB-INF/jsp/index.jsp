<html>
		 		<head>
		 			<style>
		 			.center {
		 			  		text-align: center;
		 			  	}
		 			  	
		 			</style>
		 		</head>
		 		<body style="background-color:lightblue">
		 			<div class="center">
		 				<h1>User Login Page</h1>
		 				
		 				<h2 class="hello-title">Welcome</h2>
		 			
		 				<a href="/users">View all users</a>
		 			<br><br>
				     <form method="post" action="login">
							<br><h3>Login below:</h3>
							<input type="text" id="name" name="name" placeholder="Name" required>
							<input type="text" id="email" name="email" placeholder="Email" required>
							<input type="text" id="password" name="password" placeholder="Password" required>
							<input type="submit" value="Enter" >
						</form>
		 			</div>
		 		</body>
		 		</html>