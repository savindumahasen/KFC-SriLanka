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
<img src="Images/KFC image.png"  width="100px" height="100px" style="margin-left:520px;">
   <div class="form-container">
    <div class="form-title">Admin Login</div>
    
    <form action="adminlogin">
      <div class="mb-3">
        <label for="username" class="form-label">UserName</label>
        <input type="text" class="form-control" id="username" name="username" placeholder="Enter Username" required>
      </div>
      <div class="mb-3">
        <label for="password" class="form-label">Password</label>
        <input type="text" class="form-control" id="password" name="password" placeholder="Enter " required>
      </div>
      <div class="mb-3">
        <input type="hidden" class="form-control" name="action_type" value="add">
      </div>
      <button type="submit" class="btn-submit">Login</button>
    </form>
  </div>
</div>

</body>
</html>
