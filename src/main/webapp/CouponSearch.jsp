<!Doctype html>
<html>
<head>
<link rel="icon" href="images/pinfavicon.ico" />
 <link rel="import" href="import.html">
</head>
<body class="padding">
<header>
<div class="icon">
<img src="images/icon.png" alt="pin image">
</div>
<h1 class="header">Pin Me!</h1>
        <div class="user">
            <button class="account"><i class="fa fa-user"></i></button>
            <div class="user-content">
                <ul>
                   <li><a href="home.html">Home</a></li>
                    <li><a href="History.html">History</a></li>
                    <li><a href="postAd.html">Post Event</a></li>
                    <li><a href="CouponSearch.html">Find Event</a></li>
                    <li><a href="PostedCoupons.html"> My Events</a> </li>
                    <li><a href="Logout"> Logout</a> </li>
                </ul>
            </div>
        </div>
    </header>
        <section class="divider">
    </section>
    <section class="searching">
<label><input type="text" class="searchbar" id="searchelement" name="searchelement" placeholder="category name" onblur="getEventList()"></label>
<button onclick="getEventList()"><i class="fa fa-search" onclick="getEventList()"></i></button>
        <section class="coupon" id="home">
        <ul id="couponlist">
        </ul>
    </section>
    </section>
    <script type="text/javascript" src="js/homepage.js"></script>
</body>
</html>
