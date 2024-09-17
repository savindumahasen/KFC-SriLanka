<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>KFC Menu</title>
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <!-- Custom CSS -->
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f8f9fa;
    }
   .navbar {
        background-color: #e4002b; /* KFC red */
        padding: 15px;
        border-radius: 10px;
        margin-top:5px;
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
    .nav-item1, .nav-item2, .nav-item3, .nav-item4 {
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
    
    .video-container{
        margin-left:330px;
        margin-top:10px;
     }

    .menu-section {
      padding: 50px 0;
      h1{
         text-align:center;
         font-weight:bold;
       }
    }
    .menu-title {
      text-align: center;
      color: #d32f2f;
      margin-bottom: 50px;
    }
    .card {
      border: none;
      transition: transform 0.2s;
    }
    .card:hover {
      transform: scale(1.05);
    }
    .card img {
      height: 200px;
      width:200px;
      margin-left:80px;
     /* object-fit: cover;*/
    }
    .card-title {
      color: #d32f2f;
      font-weight: bold;
    }
    .btn-custom {
      background-color: #d32f2f;
      color: white;
      
      a{
        color:white;
        text-decoration:none;
      }
    }
    .btn-custom:hover {
      background-color: #b71c1c;
    }
    .btn{
             margin-left:-18em;
             margin-top:20px;
             
             a{
             text-decoration:none;
             color:white;
             }
    }
    .footer {
      background-color: #333;
      color: white;
      padding: 30px 0;
      text-align: center;
    }
  </style>
</head>
<body>
 <div class ="container">
  <nav class="navbar">
        <div class="logo">
            <a href="Home.jsp"><img src="Images/homelogo.png" style= "width:50px; height="50px;"></a>
        </div>
        <ul class="nav">
            <li class="nav-item1">
                <a class="nav-link" href="Customer-Registration.jsp">Registration</a>
            </li>
              <li class="nav-item2">
                <a class="nav-link" href="CustomerLogin.jsp">Login</a>
            </li>
              <li class="nav-item3">
                <a class="nav-link" href="Beverages.jsp">Beverages</a>
            </li>
            <li class="nav-item4">
                <a class="nav-link" href="#">View All Products</a>
            </li>
        </ul>
    </nav>
    <div class="video-container">
        <iframe width="560" height="315" src="https://www.youtube.com/embed/9xj9OvEmk1c?autoplay=1&mute=1" 
                title="YouTube video player" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" 
                allowfullscreen>
        </iframe>
    </div>

  <!-- Menu Section -->
  <section class="menu-section">
    <h1> Best Chrisphy Chicken SirLanka</h1>
    <div class="container">
      <div class="row">
        <!-- Menu Item 1 -->
        <div class="col-md-4 mb-4">
          <div class="card">
            <img src="Images/crispy.jpeg" class="card-img-top" alt="Chicken">
            <div class="card-body text-center">
            </div>
          </div>
        </div>

        <!-- Menu Item 2 -->
        <div class="col-md-4 mb-4">
          <div class="card">
            <img src="Images/Half4Pc.jpeg" class="card-img-top" alt="Chicken">
            <div class="card-body text-center">
            </div>
          </div>
        </div>

        <!-- Menu Item 3 -->
        <div class="col-md-4 mb-4">
          <div class="card">
            <img src="Images/Bucket6Pc.jpeg" class="card-img-top" alt="Chicken">
            <div class="card-body text-center">
            </div>
          </div>
          <button type="submit" class="btn btn-danger"><a href="Main.jsp">Order Now !!</a></button>
        </div>
       

      </div>
    </div>
  </section>
 </div>

  <!-- Footer -->
  <footer class="footer">
    <p>&copy; 2024 KFC. All rights reserved.</p>
  </footer>

  <!-- Bootstrap JS and dependencies -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>









