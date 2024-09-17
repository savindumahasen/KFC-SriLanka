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
        margin-top:10px;
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

    .menu-section {
      padding: 50px 0;
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
    }
    .btn-custom:hover {
      background-color: #b71c1c;
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
            <li class="nav-item2">
                <a class="nav-link" href="Customer-Registration.jsp">Registration</a>
            </li>
              <li class="nav-item2">
                <a class="nav-link" href="CustomerLogin.jsp">Login</a>
            </li>
              <li class="nav-item4">
                <a class="nav-link" href="Beverages.jsp">Beverages</a>
            </li>
            <li class="nav-item4">
                <a class="nav-link" href="#">View All Products</a>
            </li>
        </ul>
    </nav>

  <!-- Menu Section -->
  <section class="menu-section">
    <div class="container">
      <div class="row">
        <!-- Menu Item 1 -->
        <div class="col-md-4 mb-4">
          <div class="card">
            <img src="Images/crispy.jpeg" class="card-img-top" alt="Chicken">
            <div class="card-body text-center">
              <h5 class="card-title">Hot and Crispy Chicken</h5>
              <p class="card-text">Quarter/2Pc (HC)</p>
              <p class="card-text"><strong>Rs.1170</strong></p>
              <button class="btn btn-custom">Order</button>
            </div>
          </div>
        </div>

        <!-- Menu Item 2 -->
        <div class="col-md-4 mb-4">
          <div class="card">
            <img src="Images/Half4Pc.jpeg" class="card-img-top" alt="Chicken">
            <div class="card-body text-center">
              <h5 class="card-title">Hot and Crispy Chicken</h5>
              <p class="card-text">Half/4Pc (Half).</p>
              <p class="card-text"><strong>Rs.2190</strong></p>
              <button class="btn btn-custom">Order</button>
            </div>
          </div>
        </div>

        <!-- Menu Item 3 -->
        <div class="col-md-4 mb-4">
          <div class="card">
            <img src="Images/Bucket6Pc.jpeg" class="card-img-top" alt="Chicken">
            <div class="card-body text-center">
              <h5 class="card-title">Hot and Crispy Chicken</h5>
              <p class="card-text">Bucket/6PC (H&C).</p>
              <p class="card-text"><strong>Rs.3190</strong></p>
              <button class="btn btn-custom">Order</button>
            </div>
          </div>
        </div>

        <!-- Add more menu items as needed -->
         <div class="col-md-4 mb-4">
          <div class="card">
            <img src="Images/KFC Zinger Burger.jpeg" class="card-img-top" alt="Chicken">
            <div class="card-body text-center">
              <h5 class="card-title">Burgers</h5>
              <p class="card-text">KFC Zinger Burger.</p>
              <p class="card-text"><strong>Rs.1260</strong></p>
              <button class="btn btn-custom">Order</button>
            </div>
          </div>
        </div>
         <div class="col-md-4 mb-4">
          <div class="card">
            <img src="Images/KFC Zinger Burger with Cheese.jpeg" class="card-img-top" alt="Chicken">
            <div class="card-body text-center">
              <h5 class="card-title">Burgers</h5> 
              <p class="card-text">KFC Zinger Burger with Cheese</p>
              <p class="card-text"><strong>Rs.1410</strong></p>
              <button class="btn btn-custom">Order</button>
            </div>
          </div>
        </div>
          <div class="col-md-4 mb-4">
          <div class="card">
            <img src="Images/Veggie.jpeg" class="card-img-top" alt="Chicken">
            <div class="card-body text-center">
              <h5 class="card-title">Burgers</h5> 
              <p class="card-text">Veggie Burger</p>
              <p class="card-text"><strong>Rs. 980</strong></p>
              <button class="btn btn-custom">Order</button>
            </div>
          </div>
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
