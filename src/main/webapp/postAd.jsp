<!Doctype html>
<html>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
    <script src="js/jquery-1.12.1.min.js"></script>
    <link rel="stylesheet" href="stylesheet.css">
        <link rel="icon" href="images/pinfavicon.ico" />
  <title>Pin Me</title>
</head>
<body class="padding">
<header class="adjust">
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
    <section>
    <form action="home.html">
<fieldset class="postingAd">
<div>
    <label>Event Name:<input type="text" name="event" id="eventname" placeholder="Story Telling"></label>
    </div><div>
    <label>Event Date : <input type="date" name="eventdate" id="eventdate" placeholder="mm-dd-yy"></label>
      </div><div>
    <label>Event Time :<input type="time" name="eventtime" id="eventtime"></label>
      </div><div>
  <fieldset>
  <legend>Location</legend>
  <div>
      <label>Address:<input type="text" name="address" id="address" placeholder="1303 oakcircle st"></label>
        </div><div>
      <label>City:<input type="text" name="city" id="city" placeholder="SFO"></label>
        </div><div>
      <label>ZipCode:<input type="text" name="zipcode" id="zipcode" placeholder="12345"></label>
        </div><div>
      <label>Addition Landmarks:<input type="text" name="landmarks" id="landmarks" placeholder="near school"></label>
      </div>
  </fieldset>
    </div><div>
  <label>Catergory
  <select name="Catergory" class="select">
   <option value="None selected" disabled="disabled" selected="selected">Please select below</option>
    <option value="Food">Food</option>
    <option value="Clothing">Clothing</option>
    <option value="Entertainment">Entertainment</option>
    <option value="recreation">recreation</option>
   </select>
   </label>
     </div><div>
<label>Do you want to Limit your resource?
<select  id="settinglimit" onchange="setLimit()">
<option value="none" id="none" disabled="disabled" selected="selected">None</option>
<option value="yes" id="yes">Yes</option>
<option value="No" id="no">No</option>
</select>
     </div><div id="limit" class="limit">
     <label>Set Maximum Value
     <input type="number" id="limit" name="limit" min="0"></label>
     </div><div>
  <label>Description<br><textarea rows="5" cols="50" placeholder="Additional Description of the event"></textarea></label>
  </div><div>
  <button type="submit" class="button submit">Post</button>
  <button type="reset" value="Reset" class="button reset"> Reset</button>
  </div>
</fieldset>
</form>
    </section>
    <footer>
@CopyRights:Pin Me <br>
 developed by Prathyusha Rani,Prathyusha,Shiva & Divya
</footer>
<script type="text/javascript" src="js/app.js"></script>
</body>
</html>
