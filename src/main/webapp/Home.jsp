<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>KFC_sriLanka Online</title>
  <!-- Latest compiled and minified css -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <!-- Latest Compiled javascript -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
  <style type="text/css">
    body {
        background-color: #f8f9fa; /* Light background for contrast */
    }
    .navbar {
        background-color: #e4002b; /* KFC red */
        padding: 15px;
        border-radius: 10px;
        margin-top:-200px;
    }
    .nav-link {
        color: white !important;
        font-weight: bold;
        padding: 10px 20px;
        border-radius: 5px;
        transition: background-color 0.3s ease;
    }
    .nav-link:hover {
        background-color: white;
        color: #e4002b !important; /* Red on hover */
    }
    .nav-item1, .nav-item2, .nav-item3 {
        display: inline-block;
        margin-right: 20px;
    }
    .logo {
        margin-right: 20px;
    }
    .logo img {
        width: 120px; /* Adjust size of the logo */
    }
    .container {
        max-width: 1200px;
        margin: auto;
        padding-top: 20px;
    }
     body {
            padding: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background-color: #f4f4f4;
        }

        .video-container {
            display: flex;
            justify-content: center;
            align-items: center;
        }

        iframe {
            border: none;
        }
    .form-container {
      background-color: #fff;
      border-radius: 10px;
      padding: 30px;
      max-width: 500px;
      margin: 50px auto;
      box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);
    }
    .form-title {
      text-align: center;
      color: #e4002b; /* KFC red */
      margin-bottom: 30px;
      font-weight: bold;
      font-size: 24px;
    }
    .form-label {
      color: #333;
      font-weight: bold;
      margin-bottom: 10px;
    }
    .form-control {
      border-radius: 5px;
      border: 2px solid #e4002b; /* Red border for input */
      padding: 10px;
      font-size: 16px;
    }
    .form-control:focus {
      box-shadow: 0px 0px 5px rgba(228, 0, 43, 0.7); /* Red glow on focus */
    }
    .btn-submit {
      background-color: #e4002b; /* KFC red */
      color: white;
      border: none;
      border-radius: 5px;
      padding: 10px 20px;
      font-size: 18px;
      cursor: pointer;
      transition: background-color 0.3s ease;
      margin-top: 20px;
      display: block;
      width: 100%;
    }
    .btn-submit:hover {
      background-color: #d40026; /* Darker red on hover */
    }
    /* Alert styling */
    .alert {
      text-align: center;
      font-size: 16px;
      margin-bottom: 20px;
    }
  </style>
</head>
<body>

<div class="container">
    <nav class="navbar">
        <div class="logo">
            <a href="#"><img src="Images/homelogo.png" style= "width:50px; height="50px;"></a>
        </div>
        <ul class="nav">
            <li class="nav-item1">
                <a class="nav-link active" aria-current="page" href="AdminLogin.jsp">Admin</a>
            </li>
            <li class="nav-item2">
                <a class="nav-link" href="Customer-Registration.jsp">Registration</a>
            </li>
              <li class="nav-item2">
                <a class="nav-link" href="CustomerLogin.jsp">Login</a>
            </li>
               <li class="nav-item3">
                <a class="nav-link" href="menu.jsp">Menu</a>
            </li> 
            <li class="nav-item4">
                <a class="nav-link" href="#">View All Products</a>
            </li>
        </ul>
    </nav>
    <br/><br/><br/>
    <div class="video-container">
        <iframe width="560" height="315" src="https://www.youtube.com/embed/9xj9OvEmk1c?autoplay=1&mute=1" 
                title="YouTube video player" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" 
                allowfullscreen>
        </iframe>
    </div>

</div>

</body>
</html>
