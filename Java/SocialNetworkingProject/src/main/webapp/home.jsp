<html>
    <head>
        <title>Home</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />

        <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css" />

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" ></script>
    </head>
    <body>
        <div class="container-fluid bg-primary header_div">
            <div class="container">
                <div class="row">
                    <div class="col-4">
                        <a href="home.jsp" class="navbar-brand text-light">Social Network</a>
                    </div>
                    <div class="col-3">

                    </div>
                    <div class="col-5">
                        <img src="images/profile_pic.png" alt="" class="img-fluid" style="max-width: 50px" />
                        <span class="text-light"> <%= session.getAttribute("session_name") %> </span>
                        &nbsp;&nbsp;
                        <button type="button" class="btn btn-info dropdown-toggle btn-sm" data-bs-toggle="dropdown"> More </button>
                        <ul class="dropdown-menu">
                            <li> <a href="home.jsp" class="dropdown-item bg-secondary text-light"> Home </a> </li>
                            <li> <a href="profile.jsp" class="dropdown-item"> My Profile </a> </li>
                            <li> <a href="editProfile.jsp" class="dropdown-item"> Edit My profile </a> </li>
                            <li> <a href="logout" class="dropdown-item"> Logout </a> </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <div class="container-fluid">
            <div class="container">
                <div class="row" style="padding: 40px">
                    <!-- Sidebar div starts -->
                    <div class="col-3 shadow-sm p-3 mb-5 bg-body rounded">
                        <nav id="sidebarMenu" class="collapse d-lg-block sidebar collapse bg-white" style="position: fixed">
                            <div class="position-sticky">
                                <div class="list-group list-group-flush mx-3 mt-4">
                                    <a href="home.jsp" class="list-group-item list-group-item-action py-2 ripple active">
                                        <i class="bi bi-newspaper"></i> <span>News Feed</span>
                                    </a>
                                    <a href="#" class="list-group-item list-group-item-action py-2 ripple">
                                        <i class="bi bi-wechat"></i> <span>Messanger</span>
                                    </a>
                                    <a href="#" class="list-group-item list-group-item-action py-2 ripple">
                                        <i class="bi bi-people"></i> <span>Friend List</span>
                                    </a>
                                    <a href="#" class="list-group-item list-group-item-action py-2 ripple">
                                        <i class="bi bi-stopwatch"></i> <span>Watch</span>
                                    </a>
                                    <a href="#" class="list-group-item list-group-item-action py-2 ripple">
                                        <i class="bi bi-shop"></i> <span>Marketplace</span>
                                    </a>
                                    <a href="#" class="list-group-item list-group-item-action py-2 ripple">
                                        <i class="bi bi-calendar-event"></i> <span>Events</span>
                                    </a>
                                    <a href="#" class="list-group-item list-group-item-action py-2 ripple">
                                        <i class="bi bi-file-earmark-break"></i> <span>Page</span>
                                    </a>
                                    <a href="#" class="list-group-item list-group-item-action py-2 ripple">
                                        <i class="bi bi-collection"></i> <span>Group</span>
                                    </a>
                                </div>
                            </div>
                        </nav>
                        <!-- Sidebar -->
                    </div> <!-- Sidebar div ends -->
                    
                    <!-- status div starts -->
                    <div class="col-9">
                        <div class="shadow p-4 mb-5 bg-body rounded">
                            <img src="images/profile_pic.png" alt="" style="max-width: 50px" /> <%=session.getAttribute("session_name") %> <span class="small text-secondary" style="float: right"> 1st January, 2023 [10:20pm] </span>
                            <div class="row shadow-sm p-3 mb-5 bg-body rounded">
                                This is my new house, thank you <br/> <br/>
                                <img src="images/house.jpg" alt="" style="max-width: 80%" />
                            </div>
                        </div>
                        
                        <div class="shadow p-4 mb-5 bg-body rounded">
                            <img src="images/profile_pic.png" alt="" style="max-width: 50px" /> Deepak Panwar  <span class="small text-secondary" style="float: right"> 1st January, 2023 [10:20pm] </span>
                            <div class="row shadow-sm p-3 mb-5 bg-body rounded">
                                Everyone needs a little push sometimes. Whether you're starting out on a new career path or need a burst of motivation, these inspiring words will remind you that success is possible. Plus, check out more powerful quotes that will get you in a positive mindset.  <br/> <br/>
                            </div>
                        </div>
                        
                        <div class="shadow p-4 mb-5 bg-body rounded">
                            <img src="images/profile_pic.png" alt="" style="max-width: 50px" /> Deepak Panwar  <span class="small text-secondary" style="float: right"> 1st January, 2023 [10:20pm] </span>
                            <div class="row shadow-sm p-3 mb-5 bg-body rounded">
                                This is my new house, thank you <br/> <br/>
                                <img src="images/house.jpg" alt="" style="max-width: 80%" />
                            </div>
                        </div>
                        
                    </div><!-- status div ends -->
                </div>
            </div>
        </div>
        
        
    </body>
</html>
