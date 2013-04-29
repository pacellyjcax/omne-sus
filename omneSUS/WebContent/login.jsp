
<%@page import="br.com.millercs.language.Language"%>
<%@page import="br.com.millercs.language.PT_BR"%>
<%@page import="br.com.millercs.system.Config"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta>
<title><%=Language.LOGIN_HEADER_TITLE%></title>

<!-- CSS -->
<link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700'
	rel='stylesheet'>
<link rel="stylesheet" href="_assets/css/style.css">

<!-- Mobile Devices Check -->
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body>

	<!-- TOP BAR -->
	<div id="top-bar">

		<div class="page-full-width">

			<a href="#" class="round button dark ic-left-arrow image-left "><%=Language.LOGIN_RETURN_TO_SITE%></a>

		</div>
		<!-- end full-width -->

	</div>
	<!-- end top-bar -->



	<!-- HEADER -->
	<div id="header">

		<div class="page-full-width cf">

			<div id="login-intro" class="fl">

				<h1><%=Language.LOGIN_HEADER_TITLE%></h1>
				<h5><%=Language.LOGIN_HEADER_DESCRIPTION%></h5>

			</div>

			<a href="#" id="company-branding" class="fr"><img
				src=<%=Config.getLogo()%> alt=<%=Config.getShortCompanyName()%> /></a>

		</div>
		<!-- end full-width -->

	</div>
	<!-- end header -->



	<!-- MAIN CONTENT -->
	<div id="content">

		<form action="#" method="POST" id="login-form">

			<fieldset>

				<p>
					<label for="login-username"><%=Language.LOGIN_USERNAME_TITLE%></label>
					<input type="text" id="login-username"
						class="round full-width-input" />
				</p>

				<p>
					<label for="login-password"><%=Language.LOGIN_PASSWORD_TITLE%></label>
					<input type="password" id="login-password"
						class="round full-width-input" />
				</p>

				<p>Esquecimento de Senha.</p>

				<a href="root.jsp"
					class="button round blue image-right ic-right-arrow"><%=Language.LOGIN_BUTTON%></a>

			</fieldset>

			<br />
			<div class="information-box round"><%=Language.LOGIN_HELP_BOX%></div>

		</form>

	</div>
	<!-- end content -->



	<!-- FOOTER -->
	<div id="footer">

		<p>
			<strong>&copy; Copyright 2013 </strong>
		</p>
		<p>
			<a href=<%=Config.getFullCompanySite()%>><%=" " + Config.getFullCompanyName()%></a>.
		</p>
		<p>
			<%=Language.ALL_RIGHTS_RESERVED%>
		</p>


	</div>
	<!-- end footer -->

</body>
</html>