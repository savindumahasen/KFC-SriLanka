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
        padding: 10px;
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
        margin-top:5px;
    }
    .logo img {
        width: 120px; /* Adjust size of the logo */
    }
    .container {
        max-width: 1200px;
        margin-top:-20px;
        margin: auto;
        padding-top: 20px;
    }
    .form-container {
      background-color: #fff;
      border-radius: 10px;
      padding: 30px;
      max-width: 500px;
      margin-top:-50px;
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
    a{
       text-decoration:none;
       color:black;
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
            <a href="Home.jsp"><img src="Images/homelogo.png" style= "width:50px; height="50px;"></a>
        </div>
        <ul class="nav">
            <li class="nav-item2">
                <a class="nav-link" href="Customer-Registration.jsp">Customer Registration</a>
            </li>
              <li class="nav-item2">
                <a class="nav-link" href="CustomerLogin.jsp">Customer Login</a>
            </li>
               <li class="nav-item3">
                <a class="nav-link" href="Main.jsp">Menu</a>
            </li> 
             <li class="nav-item3">
                <a class="nav-link" href="Beverages.jsp">Beverages</a>
            </li> 
        </ul>
    </nav>
<!-- <img src="Images/KFC image.png"  width="30px" height="30px" style="margin-left:550px;">-->
   <div class="form-container">
    <div class="form-title"><img src="Images/KFC image.png"  width="35px" height="35px" style="margin-left:10px;"><br/>Order Your Meals and Beverages</div>
    
    <p style="color:black">${feedbackmessage}</p>
    <form action="orderscontroller" method="post">
     
      <div class="mb-3">
        <label for="accountid" class="form-label">Please Enter You Account Number</label>
        <input type="password" class="form-control" id="accountid" name="accountnumber" placeholder="Enter AccountNumber" required>
        <br/>
        <label for="confirmaccountid" class="form-label">Please Enter You Account Number again</label>
        <input type="password" class="form-control" id="confirmaccountid" name="confirmaccountnumber" placeholder="Enter AccountNumber again" required>
         
        <input type="hidden" name="action_type" value="order_now">
      </div>
      <button onClick = "sendEmail()" type="submit" class="btn-submit">Order Now !!</button>
    </form>
  </div>
</div>
<script src="https://smtpjs.com/v3/smtp.js"></script>
<script>
function sendEmail(){	     
Email.send({
    Host : "smtp.elasticemail.com",
    Username : "savinduruhunuhewa@gmail.com",
    Password : "0ADF9E9923B7A8B188349946D8E5DE95C4F8",
    To : 'thumulasuraweera@gmail.com',
    From : "savinduruhunuhewa@gmail.com",
    Subject : "KFC Order",
    Body : "Order is sucessfully confirmed!"
}).then(
  message => alert(message)
);
}

</script>

</body>
</html>
