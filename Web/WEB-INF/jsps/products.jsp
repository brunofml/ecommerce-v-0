<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!--[if IE 9]>
<html class="lt-ie10" lang="en"> <![endif]-->
<html class="no-js" lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Ecommerce-Products</title>

<!-- If you are using the CSS version, only link these 2 files, you may add app.css to use for your overrides if you like -->
<link href="<c:url value="resources/static/css/normalize.css" />"
	rel="stylesheet" type="text/css">
<link href="<c:url value="resources/static/css/foundation.css" />"
	rel="stylesheet" type="text/css">

<!-- This is how you would link your custom stylesheet -->
<link href="<c:url value="resources/static/css/app.css" />"
	rel="stylesheet" type="text/css">

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<c:url value="resources/static/js/vendor/modernizr.js" />"></script>
<script src="<c:url value="resources/static/js/vendor/jquery.js" />"></script>
<script src="<c:url value="resources/static/js/app.js" />"></script>

</head>

<body>
	<nav class="top-bar" data-topbar>
		<ul class="title-area">
			<li class="name">
				<h1>
					<a id="logo" href="#"> <img
						src="<c:url value="resources/static/img/oss-logo-spring.png" />" />
					</a>
				</h1>
			</li>
			<li class="toggle-topbar menu-icon"><a href="#"><span>menu</span></a></li>
		</ul>

		<section class="top-bar-section">

			<ul class="right">
				<li class="divider"></li>
				<li><a href="#">Home</a></li>
				<li class="divider"></li>
				<li><a href="#">A Minha Conta</a></li>
				<li class="divider"></li>
				<li class="has-dropdown"><a href="#">Música, Filmes e
						Livros</a>
					<ul class="dropdown">
						<li><label>Section Name</label></li>
						<li class="has-dropdown"><a href="#" class="">Has
								Dropdown, Level 1</a>
							<ul class="dropdown">
								<li><a href="#">Dropdown Options</a></li>
								<li><a href="#">Dropdown Options</a></li>
								<li><a href="#">Level 2</a></li>
								<li><a href="#">Subdropdown Option</a></li>
								<li><a href="#">Subdropdown Option</a></li>
								<li><a href="#">Subdropdown Option</a></li>
							</ul></li>
						<li><a href="#">Dropdown Option</a></li>
						<li><a href="#">Dropdown Option</a></li>
						<li class="divider"></li>
						<li><label>Section Name</label></li>
						<li><a href="#">Dropdown Option</a></li>
						<li><a href="#">Dropdown Option</a></li>
						<li><a href="#">Dropdown Option</a></li>
						<li class="divider"></li>
						<li><a href="#">See all →</a></li>
					</ul></li>
				<li class="divider"></li>
				<li class="has-dropdown"><a href="#">Imagem e Som</a>
					<ul class="dropdown">
						<li><label>Section Name</label></li>
						<li class="has-dropdown"><a href="#" class="">Has
								Dropdown, Level 1</a>
							<ul class="dropdown">
								<li><a href="#">Dropdown Options</a></li>
								<li><a href="#">Dropdown Options</a></li>
								<li><a href="#">Level 2</a></li>
								<li><a href="#">Subdropdown Option</a></li>
								<li><a href="#">Subdropdown Option</a></li>
								<li><a href="#">Subdropdown Option</a></li>
							</ul></li>
						<li><a href="#">Dropdown Option</a></li>
						<li><a href="#">Dropdown Option</a></li>
						<li class="divider"></li>
						<li><label>Section Name</label></li>
						<li><a href="#">Dropdown Option</a></li>
						<li><a href="#">Dropdown Option</a></li>
						<li><a href="#">Dropdown Option</a></li>
						<li class="divider"></li>
						<li><a href="#">See all →</a></li>
					</ul></li>
				<li class="divider"></li>
				<li class="has-dropdown"><a href="#">Informática</a>
					<ul class="dropdown">
						<li><a href="#">Dropdown Option</a></li>
						<li><a href="#">Dropdown Option</a></li>
						<li><a href="#">Dropdown Option</a></li>
						<li class="divider"></li>
						<li><a href="#">See all →</a></li>
					</ul></li>
				<li class="divider"></li>
				<li><a href="#">Log In</a></li>
			</ul>
		</section>
	</nav>

	<div class=" header bg-blue hide-for-small">
		<div class="row">
			<div class="large-6 columns">
				<ul class="breadcrumbs">
					<li><a href="#">Home</a></li>
					<li><a href="#">Features</a></li>
					<!--<li class="unavailable"><a href="#">Gene Splicing</a></li>-->
					<li class="current"><a href="#">Cloning</a></li>
				</ul>
			</div>

			<div class="large-3 columns"></div>

			<div class="large-3 columns">
				<div class="row collapse">
					<div class="small-10 columns">
						<input type="text" placeholder="Pesquisar">
					</div>
					<div class="small-2 columns">
						<a href="#" class="button postfix">Go</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="row">


		<div class="large-3 small-12 columns">

			<div class="hide-for-small panel">
				<div id="userLogged">
					<div class="large-2 small-6 columns">
						<img id="userLogo"
							src="http://placehold.it/300x300&text=Site Owner">
					</div>

					<div class="large-10 small-6 columns">
						<strong>Logged In by User</strong>
					</div>
				</div>
			</div>


			<ul class="side-nav">
				<li><a href="#">Section 1</a></li>
				<li><a href="#">Section 2</a></li>
				<li><a href="#">Section 3</a></li>
				<li><a href="#">Section 4</a></li>
				<li><a href="#">Section 5</a></li>
				<li><a href="#">Section 6</a></li>
			</ul>

			<!--<p><img src="http://placehold.it/320x240&text=Ad"/></p>-->

			<a href="#">
				<div class="panel callout radius">
					<h6>99  items in your cart</h6>
				</div>
			</a>

		</div>


		<div class="large-9 columns">
			<div class="row">

				<c:forEach var="product" items="${products}">
					<div class="large-3 small-6 columns">
						<div class="thumb">
							<img src="http://placehold.it/500x500&text=Thumbnail">

							<div class="panel">
								<h5>
									<c:out value="${product.name}"></c:out>
								</h5>
								<h6 class="subheader">$000.00</h6>
							</div>
						</div>
					</div>
				</c:forEach>

			</div>


			<div class="row">
				<div class="large-12 columns">
					<div class="panel">
						<div class="row">

							<div class="large-2 small-6 columns">
								<img src="http://placehold.it/300x300&text=Site Owner">
							</div>

							<div class="large-10 small-6 columns">
								<strong>This Site Is Managed By
									<hr />
								</strong> Risus ligula, aliquam nec fermentum vitae, sollicitudin eget
								urna. Donec dignissim nibh fermentum odio ornare sagittis
							</div>

						</div>
					</div>
				</div>


			</div>
		</div>
	</div>

	<footer class="row">
		<div class="large-12 columns">
			<hr>
			<div class="row">

				<div class="large-6 columns">
					<p>© Copyright no one at all. Go to town.</p>
				</div>

				<div class="large-6 small-12 columns">
					<ul class="inline-list right">
						<li><a href="#">Link 1</a></li>
						<li><a href="#">Link 2</a></li>
						<li><a href="#">Link 3</a></li>
						<li><a href="#">Link 4</a></li>
					</ul>
				</div>

			</div>
		</div>
	</footer>

	<script src="<c:url value="resources/static/js/vendor/jquery.js" />"></script>
	<script src="<c:url value="resources/static/js/foundation.min.js" />"></script>
	<script>
		$(document).foundation();
	</script>

</body>