<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<% 
	String path = request.getContextPath(); 
%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
    <link rel="shortcut icon" href="<%=path%>/js/Nice-admin/img/favicon.png">

    <title>Basic Table | Creative - Bootstrap 3 Responsive Admin Template</title>

    <!-- Bootstrap CSS -->    
    <link href="<%=path%>/js/bootstrap/bootstrap-3.3.4-dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="<%=path%>/js/bootstrap/bootstrap-3.3.4-dist/css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="<%=path%>/js/Nice-admin/css/elegant-icons-style.css" rel="stylesheet" />
    <link href="<%=path%>/js/Nice-admin/css/font-awesome.min.css" rel="stylesheet" />
    <!-- Custom styles -->
    <link href="<%=path%>/js/Nice-admin/css/style.css" rel="stylesheet">
    <link href="<%=path%>/js/Nice-admin/css/style-responsive.css" rel="stylesheet" />

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
      <script src="js/lte-ie7.js"></script>
    <![endif]-->
  </head>

  <body>
  <!-- container section start -->
  <section id="container" class="">
      <!--header start-->
      <header class="header dark-bg">
            <div class="toggle-nav">
                <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"></div>
            </div>

            <!--logo start-->
            <a href="index.html" class="logo"><span class="lite">小雨点</span> 科技有限公司</a>
            <!--logo end-->

            <div class="nav search-row" id="top_menu">
                <!--  search form start 
                <ul class="nav top-menu">                    
                    <li>
                        <form class="navbar-form">
                            <input class="form-control" placeholder="Search" type="text">
                        </form>
                    </li>                    
                </ul>-->
                <!--  search form end -->                
            </div>

            <div class="top-nav notification-row">                
                <!-- notificatoin dropdown start-->
                <ul class="nav pull-right top-menu">
                    <!-- alert notification end-->
                    <!-- user login dropdown start-->
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="profile-ava">
                                <img alt="" src="<%=path%>/js/Nice-admin/img/avatar1_small.jpg">
                            </span>
                            <span class="username">赵 翊</span>
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu extended logout">
                            <div class="log-arrow-up"></div>
                            <li class="eborder-top">
                                <a href="#"><i class="icon_profile"></i>个人信息</a>
                            </li>
                            <li>
                                <a href="#"><i class="icon_mail_alt"></i>修改密码</a>
                            </li>
                            <li>
                                <a href="#"><i class="icon_clock_alt"></i>我的账单</a>
                            </li>
                            <li>
                                <a href="#"><i class="icon_chat_alt"></i>优惠券</a>
                            </li>
                            <li>
                                <a href="#"><i class="icon_key_alt"></i>退出登录</a>
                            </li>
                        </ul>
                    </li>
                    <!-- user login dropdown end -->
                </ul>
                <!-- notificatoin dropdown end-->
            </div>
      </header>      
      <!--header end-->

      <!--sidebar start-->
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu">                
                  <li class="">
                      <a class="" href="index.html">
                          <i class="icon_house_alt"></i>
                          <span>首页</span>
                      </a>
                  </li>
				  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon_document_alt"></i>
                          <span>Forms</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="form_component.html">Form Elements</a></li>                          
                          <li><a class="" href="form_validation.html">Form Validation</a></li>
                      </ul>
                  </li>       
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon_desktop"></i>
                          <span>UI Fitures</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="general.html">Components</a></li>
                          <li><a class="" href="buttons.html">Buttons</a></li>
                          <li><a class="" href="grids.html">Grids</a></li>
                      </ul>
                  </li>
                  <li>
                      <a class="" href="widgets.html">
                          <i class="icon_genius"></i>
                          <span>Widgets</span>
                      </a>
                  </li>
                  <li>                     
                      <a class="" href="chart-chartjs.html">
                          <i class="icon_piechart"></i>
                          <span>Charts</span>
                          
                      </a>
                                         
                  </li>
                             
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon_table"></i>
                          <span>Tables</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="active" href="basic_table.html">Basic Table</a></li>
                      </ul>
                  </li>
                  
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon_documents_alt"></i>
                          <span>Pages</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                      <ul class="sub">                          
                          <li><a class="" href="profile.html">Profile</a></li>
                          <li><a class="" href="login.html"><span>Login Page</span></a></li>
                          <li><a class="" href="blank.html">Blank Page</a></li>
                          <li><a class="" href="404.html">404 Error</a></li>
                      </ul>
                  </li>
                  
              </ul>
              <!-- sidebar menu end-->
          </div>
      </aside>

      <!--main content start-->
      <section id="main-content">
          <section class="wrapper">
		  <div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa-table"></i> Table</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="index.html">Home</a></li>
						<li><i class="fa fa-table"></i>Table</li>
						<li><i class="fa fa-th-list"></i>Basic Table</li>
					</ol>
				</div>
			</div>
              <!-- page start-->
              <div class="row">
                  <div class="col-sm-6">
                      <section class="panel">
                          <header class="panel-heading">
                              Basic Table
                          </header>
                          <table class="table">
                              <thead>
                              <tr>
                                  <th>#</th>
                                  <th>First Name</th>
                                  <th>Last Name</th>
                                  <th>Username</th>
                              </tr>
                              </thead>
                              <tbody>
                              <tr>
                                  <td>1</td>
                                  <td>Mark</td>
                                  <td>Otto</td>
                                  <td>@mdo</td>
                              </tr>
                              <tr>
                                  <td>2</td>
                                  <td>Jacob</td>
                                  <td>Thornton</td>
                                  <td>@fat</td>
                              </tr>
                              <tr>
                                  <td>3</td>
                                  <td>Larry</td>
                                  <td>the Bird</td>
                                  <td>@twitter</td>
                              </tr>
                              </tbody>
                          </table>
                      </section>
                  </div>
                  <div class="col-sm-6">
                      <section class="panel">
                          <header class="panel-heading">
                              Striped Table
                          </header>
                          <table class="table table-striped">
                              <thead>
                              <tr>
                                  <th>#</th>
                                  <th>First Name</th>
                                  <th>Last Name</th>
                                  <th>Username</th>
                              </tr>
                              </thead>
                              <tbody>
                              <tr>
                                  <td>1</td>
                                  <td>Mark</td>
                                  <td>Otto</td>
                                  <td>@mdo</td>
                              </tr>
                              <tr>
                                  <td>2</td>
                                  <td>Jacob</td>
                                  <td>Thornton</td>
                                  <td>@fat</td>
                              </tr>
                              <tr>
                                  <td>3</td>
                                  <td>Larry</td>
                                  <td>the Bird</td>
                                  <td>@twitter</td>
                              </tr>
                              </tbody>
                          </table>
                      </section>
                  </div>
              </div>
              <div class="row">
                  <div class="col-sm-6">
                      <section class="panel">
                          <header class="panel-heading no-border">
                              Border Table
                          </header>
                          <table class="table table-bordered">
                              <thead>
                              <tr>
                                  <th>#</th>
                                  <th>First Name</th>
                                  <th>Last Name</th>
                                  <th>Username</th>
                              </tr>
                              </thead>
                              <tbody>
                              <tr>
                                  <td rowspan="2">1</td>
                                  <td>Mark</td>
                                  <td>Otto</td>
                                  <td>@mdo</td>
                              </tr>
                              <tr>
                                  <td>Mark</td>
                                  <td>Otto</td>
                                  <td>@TwBootstrap</td>
                              </tr>
                              <tr>
                                  <td>2</td>
                                  <td>Jacob</td>
                                  <td>Thornton</td>
                                  <td>@fat</td>
                              </tr>
                              <tr>
                                  <td>3</td>
                                  <td colspan="2">Larry the Bird</td>
                                  <td>@twitter</td>
                              </tr>
                              </tbody>
                          </table>
                      </section>
                  </div>
                  <div class="col-sm-6">
                      <section class="panel">
                          <header class="panel-heading">
                              Hover Table
                          </header>
                          <table class="table table-hover">
                              <thead>
                              <tr>
                                  <th>#</th>
                                  <th>First Name</th>
                                  <th>Last Name</th>
                                  <th>Username</th>
                              </tr>
                              </thead>
                              <tbody>
                              <tr>
                                  <td>1</td>
                                  <td>Mark</td>
                                  <td>Otto</td>
                                  <td>@mdo</td>
                              </tr>
                              <tr>
                                  <td>2</td>
                                  <td>Jacob</td>
                                  <td>Thornton</td>
                                  <td>@fat</td>
                              </tr>
                              <tr>
                                  <td>3</td>
                                  <td colspan="2">Larry the Bird</td>
                                  <td>@twitter</td>
                              </tr>
                              <tr>
                                  <td>3</td>
                                  <td>Sumon</td>
                                  <td>Mosa</td>
                                  <td>@twitter</td>
                              </tr>
                              </tbody>
                          </table>
                      </section>
                  </div>
              </div>
              <div class="row">
                <div class="col-sm-6">
                      <section class="panel">
                          <header class="panel-heading">
                              Condensed table
                          </header>
                          <table class="table table-condensed">
                            <thead>
                              <tr>
                                <th>#</th>
                                <th>First Name</th>
                                <th>Last Name</th>
                                <th>Username</th>
                              </tr>
                            </thead>
                            <tbody>
                              <tr>
                                <td>1</td>
                                <td>Mark</td>
                                <td>Otto</td>
                                <td>@mdo</td>
                              </tr>
                              <tr>
                                <td>2</td>
                                <td>Jacob</td>
                                <td>Thornton</td>
                                <td>@fat</td>
                              </tr>
                              <tr>
                                <td>3</td>
                                <td colspan="2">Larry the Bird</td>
                                <td>@twitter</td>
                              </tr>
                              <tr>
                                <td>4</td>
                                <td>Ajay Patel</td>
                                <td>LA</td>
                                <td>@ajaypatel_aj</td>
                              </tr>
                            </tbody>
                          </table>
                      </section>
                  </div>
                  <div class="col-sm-6">
                      <section class="panel">
                          <header class="panel-heading">
                              Contextual classes
                          </header>
                          <table class="table">
                            <thead>
                              <tr>
                                <th>#</th>
                                <th>Column heading</th>
                                <th>Column heading</th>
                                <th>Column heading</th>
                              </tr>
                            </thead>
                            <tbody>
                              <tr class="active">
                                <td>1</td>
                                <td>Column content</td>
                                <td>Column content</td>
                                <td>Column content</td>
                              </tr>                              
                              <tr class="success">
                                <td>2</td>
                                <td>Column content</td>
                                <td>Column content</td>
                                <td>Column content</td>
                              </tr>                              
                              <tr class="warning">
                                <td>3</td>
                                <td>Column content</td>
                                <td>Column content</td>
                                <td>Column content</td>
                              </tr>                              
                              <tr class="danger">
                                <td>4</td>
                                <td>Column content</td>
                                <td>Column content</td>
                                <td>Column content</td>
                              </tr>
                            </tbody>
                          </table>
                      </section>
                  </div>
              </div>
              <div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                              Responsive tables
                          </header>
                          <div class="table-responsive">
                            <table class="table">
                              <thead>
                                <tr>
                                  <th>#</th>
                                  <th>Table heading</th>
                                  <th>Table heading</th>
                                  <th>Table heading</th>
                                  <th>Table heading</th>
                                  <th>Table heading</th>
                                  <th>Table heading</th>
                                </tr>
                              </thead>
                              <tbody>
                                <tr>
                                  <td>1</td>
                                  <td>Table cell</td>
                                  <td>Table cell</td>
                                  <td>Table cell</td>
                                  <td>Table cell</td>
                                  <td>Table cell</td>
                                  <td>Table cell</td>
                                </tr>
                                <tr>
                                  <td>2</td>
                                  <td>Table cell</td>
                                  <td>Table cell</td>
                                  <td>Table cell</td>
                                  <td>Table cell</td>
                                  <td>Table cell</td>
                                  <td>Table cell</td>
                                </tr>
                                <tr>
                                  <td>3</td>
                                  <td>Table cell</td>
                                  <td>Table cell</td>
                                  <td>Table cell</td>
                                  <td>Table cell</td>
                                  <td>Table cell</td>
                                  <td>Table cell</td>
                                </tr>
                              </tbody>
                            </table>
                          </div>

                      </section>
                  </div>
              </div>
              <div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                              Advanced Table
                          </header>
                          
                          <table class="table table-striped table-advance table-hover">
                           <tbody>
                              <tr>
                                 <th><i class="icon_profile"></i> Full Name</th>
                                 <th><i class="icon_calendar"></i> Date</th>
                                 <th><i class="icon_mail_alt"></i> Email</th>
                                 <th><i class="icon_pin_alt"></i> City</th>
                                 <th><i class="icon_mobile"></i> Mobile</th>
                                 <th><i class="icon_cogs"></i> Action</th>
                              </tr>
                              <tr>
                                 <td>Angeline Mcclain</td>
                                 <td>2004-07-06</td>
                                 <td>dale@chief.info</td>
                                 <td>Rosser</td>
                                 <td>176-026-5992</td>
                                 <td>
                                  <div class="btn-group">
                                      <a class="btn btn-primary" href="#"><i class="icon_plus_alt2"></i></a>
                                      <a class="btn btn-success" href="#"><i class="icon_check_alt2"></i></a>
                                      <a class="btn btn-danger" href="#"><i class="icon_close_alt2"></i></a>
                                  </div>
                                  </td>
                              </tr>
                              <tr>
                                 <td>Sung Carlson</td>
                                 <td>2011-01-10</td>
                                 <td>ione.gisela@high.org</td>
                                 <td>Robert Lee</td>
                                 <td>724-639-4784</td>
                                 <td>
                                  <div class="btn-group">
                                      <a class="btn btn-primary" href="#"><i class="icon_plus_alt2"></i></a>
                                      <a class="btn btn-success" href="#"><i class="icon_check_alt2"></i></a>
                                      <a class="btn btn-danger" href="#"><i class="icon_close_alt2"></i></a>
                                  </div>
                                  </td>
                              </tr>
                              <tr>
                                 <td>Bryon Osborne</td>
                                 <td>2006-10-29</td>
                                 <td>sol.raleigh@language.edu</td>
                                 <td>York</td>
                                 <td>180-456-0056</td>
                                 <td>
                                  <div class="btn-group">
                                      <a class="btn btn-primary" href="#"><i class="icon_plus_alt2"></i></a>
                                      <a class="btn btn-success" href="#"><i class="icon_check_alt2"></i></a>
                                      <a class="btn btn-danger" href="#"><i class="icon_close_alt2"></i></a>
                                  </div>
                                  </td>
                              </tr>
                              <tr>
                                 <td>Dalia Marquez</td>
                                 <td>2011-12-15</td>
                                 <td>angeline.frieda@thick.com</td>
                                 <td>Alton</td>
                                 <td>690-601-1922</td>
                                 <td>
                                  <div class="btn-group">
                                      <a class="btn btn-primary" href="#"><i class="icon_plus_alt2"></i></a>
                                      <a class="btn btn-success" href="#"><i class="icon_check_alt2"></i></a>
                                      <a class="btn btn-danger" href="#"><i class="icon_close_alt2"></i></a>
                                  </div>
                                  </td>
                              </tr>
                              <tr>
                                 <td>Selina Fitzgerald</td>
                                 <td>2003-01-06</td>
                                 <td>moshe.mikel@parcelpart.info</td>
                                 <td>Waelder</td>
                                 <td>922-810-0915</td>
                                 <td>
                                  <div class="btn-group">
                                      <a class="btn btn-primary" href="#"><i class="icon_plus_alt2"></i></a>
                                      <a class="btn btn-success" href="#"><i class="icon_check_alt2"></i></a>
                                      <a class="btn btn-danger" href="#"><i class="icon_close_alt2"></i></a>
                                  </div>
                                  </td>
                              </tr>
                              <tr>
                                 <td>Abraham Avery</td>
                                 <td>2006-07-14</td>
                                 <td>harvey.jared@pullpump.org</td>
                                 <td>Harker Heights</td>
                                 <td>511-175-7115</td>
                                 <td>
                                  <div class="btn-group">
                                      <a class="btn btn-primary" href="#"><i class="icon_plus_alt2"></i></a>
                                      <a class="btn btn-success" href="#"><i class="icon_check_alt2"></i></a>
                                      <a class="btn btn-danger" href="#"><i class="icon_close_alt2"></i></a>
                                  </div>
                                  </td>
                              </tr>
                              <tr>
                                 <td>Caren Mcdowell</td>
                                 <td>2002-03-29</td>
                                 <td>valeria@hookhope.org</td>
                                 <td>Blackwell</td>
                                 <td>970-147-5550</td>
                                 <td>
                                  <div class="btn-group">
                                      <a class="btn btn-primary" href="#"><i class="icon_plus_alt2"></i></a>
                                      <a class="btn btn-success" href="#"><i class="icon_check_alt2"></i></a>
                                      <a class="btn btn-danger" href="#"><i class="icon_close_alt2"></i></a>
                                  </div>
                                  </td>
                              </tr>
                              <tr>
                                 <td>Owen Bingham</td>
                                 <td>2013-04-06</td>
                                 <td>thomas.christopher@firstfish.info</td>
                                 <td>Rule</td>
                                 <td>934-118-6046</td>
                                 <td>
                                  <div class="btn-group">
                                      <a class="btn btn-primary" href="#"><i class="icon_plus_alt2"></i></a>
                                      <a class="btn btn-success" href="#"><i class="icon_check_alt2"></i></a>
                                      <a class="btn btn-danger" href="#"><i class="icon_close_alt2"></i></a>
                                  </div>
                                  </td>
                              </tr>
                              <tr>
                                 <td>Ahmed Dean</td>
                                 <td>2008-03-19</td>
                                 <td>lakesha.geri.allene@recordred.com</td>
                                 <td>Darrouzett</td>
                                 <td>338-081-8817</td>
                                 <td>
                                  <div class="btn-group">
                                      <a class="btn btn-primary" href="#"><i class="icon_plus_alt2"></i></a>
                                      <a class="btn btn-success" href="#"><i class="icon_check_alt2"></i></a>
                                      <a class="btn btn-danger" href="#"><i class="icon_close_alt2"></i></a>
                                  </div>
                                  </td>
                              </tr>
                              <tr>
                                 <td>Mario Norris</td>
                                 <td>2010-02-08</td>
                                 <td>mildred@hour.info</td>
                                 <td>Amarillo</td>
                                 <td>945-547-5302</td>
                                 <td>
                                  <div class="btn-group">
                                      <a class="btn btn-primary" href="#"><i class="icon_plus_alt2"></i></a>
                                      <a class="btn btn-success" href="#"><i class="icon_check_alt2"></i></a>
                                      <a class="btn btn-danger" href="#"><i class="icon_close_alt2"></i></a>
                                  </div>
                                  </td>
                              </tr>                              
                           </tbody>
                        </table>
                      </section>
                  </div>
              </div>
              <!-- page end-->
          </section>
      </section>
      <!--main content end-->
  </section>
  <!-- container section end -->
    <!-- javascripts -->
    <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script src="<%=path%>/js/bootstrap/bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
    <!-- nicescroll -->
    <script src="<%=path%>/js/Nice-admin/js/jquery.scrollTo.min.js"></script>
    <script src="<%=path%>/js/Nice-admin/js/jquery.nicescroll.js" type="text/javascript"></script>
    <!--custome script for all page-->
    <script src="<%=path%>/js/Nice-admin/js/scripts.js"></script>


  </body>
</html>
