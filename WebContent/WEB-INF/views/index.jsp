<%-- 
    Document   : index
    Created on : Oct 17, 2020, 3:13:40 PM
    Author     : HOME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Bùi Ngọc Thành - PS10511</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="description" content="aStar Fashion Template Project">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="styles/bootstrap-4.1.3/bootstrap.css">
        <link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/animate.css">
        <link rel="stylesheet" type="text/css" href="styles/main_styles.css">
        <link rel="stylesheet" type="text/css" href="styles/responsive.css">
                    <link rel="icon" href="images/thanhdeptrai.webp" sizes="192x192"/>

    </head>
    <body>

        <div class="super_container">

            <!-- Header -->

            <header class="header">
                <div class="header_content d-flex flex-row align-items-center justify-content-start">

                    <!-- Hamburger -->
                    <div class="hamburger menu_mm"><i class="fa fa-bars menu_mm" aria-hidden="true"></i></div>

                    <!-- Logo -->
                    <div class="header_logo">
                        <a href="#"><div>a<span>star</span></div></a>
                    </div>

                    <!-- Navigation -->
                    <nav class="header_nav">
                        <ul class="d-flex flex-row align-items-center justify-content-start">
                            <li><a href="index.html">home</a></li>

                            <li><a href="#">lookbook</a></li>
                            <li><a href="#">blog</a></li>
                            <li><a href="#">contact</a></li>
                        </ul>
                    </nav>

                    <!-- Header Extra -->
                    <div class="header_extra ml-auto d-flex flex-row align-items-center justify-content-start">

                        <!-- Language -->
                        <div class="info_languages has_children">
                            <div class="language_flag"><img src="images/flag_1.svg" alt="https://www.flaticon.com/authors/freepik"></div>
                            <div class="dropdown_text">english</div>
                            <div class="dropdown_arrow"><i class="fa fa-angle-down" aria-hidden="true"></i></div>

                            <!-- Language Dropdown Menu -->
                            <ul>
                                <li><a href="#">
                                        <div class="language_flag"><img src="images/flag_2.svg" alt="https://www.flaticon.com/authors/freepik"></div>
                                        <div class="dropdown_text">french</div>
                                    </a></li>
                                <li><a href="#">
                                        <div class="language_flag"><img src="images/flag_3.svg" alt="https://www.flaticon.com/authors/freepik"></div>
                                        <div class="dropdown_text">japanese</div>
                                    </a></li>
                                <li><a href="#">
                                        <div class="language_flag"><img src="images/flag_4.svg" alt="https://www.flaticon.com/authors/freepik"></div>
                                        <div class="dropdown_text">russian</div>
                                    </a></li>
                                <li><a href="#">
                                        <div class="language_flag"><img src="images/flag_5.svg" alt="https://www.flaticon.com/authors/freepik"></div>
                                        <div class="dropdown_text">spanish</div>
                                    </a></li>
                            </ul>

                        </div>
                        <!-- Currency -->
                       <%
                            String vaitroWebsite = "KH";
                            if (session.getAttribute("vaitro").equals(1)) {
                                vaitroWebsite = "QTV";
                            }
                        %>
                        <div class="info_currencies has_children">
                            <div class="dropdown_text"><% out.print(vaitroWebsite); %></div>


                        </div>

                        <!-- Cart -->
                        <div class="cart d-flex flex-row align-items-center justify-content-start">
                            <div class="cart_icon"><a href="cart.html">
                                    <img src="images/bag.png" alt="">
                                    <div class="cart_num" id="countSoLuongMonHang1">${soLuongMonHang}</div>
                                </a></div>
                        </div>

                    </div>

                </div>
            </header>

            <!-- Menu -->

            <div class="menu d-flex flex-column align-items-start justify-content-start menu_mm trans_400">
                <div class="menu_close_container"><div class="menu_close"><div></div><div></div></div></div>
                <div class="menu_top d-flex flex-row align-items-center justify-content-start">

                    <!-- Language -->
                    <div class="info_languages has_children">
                        <div class="language_flag"><img src="images/flag_1.svg" alt="https://www.flaticon.com/authors/freepik"></div>
                        <div class="dropdown_text">english</div>
                        <div class="dropdown_arrow"><i class="fa fa-angle-down" aria-hidden="true"></i></div>

                        <!-- Language Dropdown Menu -->
                        <ul>
                            <li><a href="#">
                                    <div class="language_flag"><img src="images/flag_2.svg" alt="https://www.flaticon.com/authors/freepik"></div>
                                    <div class="dropdown_text">french</div>
                                </a></li>
                            <li><a href="#">
                                    <div class="language_flag"><img src="images/flag_3.svg" alt="https://www.flaticon.com/authors/freepik"></div>
                                    <div class="dropdown_text">japanese</div>
                                </a></li>
                            <li><a href="#">
                                    <div class="language_flag"><img src="images/flag_4.svg" alt="https://www.flaticon.com/authors/freepik"></div>
                                    <div class="dropdown_text">russian</div>
                                </a></li>
                            <li><a href="#">
                                    <div class="language_flag"><img src="images/flag_5.svg" alt="https://www.flaticon.com/authors/freepik"></div>
                                    <div class="dropdown_text">spanish</div>
                                </a></li>
                        </ul>

                    </div>

                    <!-- Currency -->
                    <div class="info_currencies has_children">
                            <div class="dropdown_text"><% out.print(vaitroWebsite); %></div>


                        </div>

                </div>
                
                <nav class="menu_nav">
                    <ul class="menu_mm">
                        <li class="menu_mm"><a href="index.html">home<i class="fa fa-angle-right" aria-hidden="true"></i></a></li>
                                <%
                                    if (session.getAttribute("vaitro").equals(1)) {
                                        out.print("<li class='menu_mm'><a href='admin/index.html'>Quản Lý Tài Khoản<i class='fa fa-users' aria-hidden='true'></i></a></li>");
                                        out.print("<li class='menu_mm'><a href='admin/sanpham.html'>Quản Lý Sản Phẩm<i class='fa fa-cogs' aria-hidden='true'></i></a></li>");
                                        out.print("<li class='menu_mm'><a href='admin/donhang.html'>Quản Lý Đơn Hàng<i class='fa fa-database' aria-hidden='true'></i></a></li>");
                                        out.print("<li class='menu_mm'><a href='admin/danhmuc.html'>Quản Lý Danh Mục<i class='fa fa-clone' aria-hidden='true'></i></a></li>");

                                    }
                                %>
                         <li class="menu_mm"><a href="viewOrder.html">View Order<i class="fa fa-gift" aria-hidden="true"></i></a></li>

                        <li class="menu_mm"><a href="cart.html">View Carts<i class="fa fa-shopping-cart" aria-hidden="true"></i></a></li>
                        <li class="menu_mm"><a href="login/logout.html">Logout<i class="fa fa-sign-out" aria-hidden="true"></i></a></li>

                    </ul>
                </nav>
                <div class="menu_extra">
                    <div class="menu_social">
                        <ul>
                            <li><a href="https://www.facebook.com/Nobita76.Me" target="_blank"><i class="fa fa-pinterest" aria-hidden="true"></i></a></li>
                            <li><a href="https://www.facebook.com/Nobita76.Me" target="_blank"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
                            <li><a href="https://www.facebook.com/Nobita76.Me" target="_blank"><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
                            <li><a href="https://www.facebook.com/Nobita76.Me" target="_blank"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>

            <!-- Sidebar -->

            <div class="sidebar">

                <!-- Info -->
                <div class="info">
                    <div class="info_content d-flex flex-row align-items-center justify-content-start">

                        <!-- Language -->
                        <div class="info_languages has_children">
                            <div class="language_flag"><img src="images/flag_1.svg" alt="https://www.flaticon.com/authors/freepik"></div>
                            <div class="dropdown_text">english</div>
                            <div class="dropdown_arrow"><i class="fa fa-angle-down" aria-hidden="true"></i></div>

                            <!-- Language Dropdown Menu -->
                            <ul>
                                <li><a href="#">
                                        <div class="language_flag"><img src="images/flag_2.svg" alt="https://www.flaticon.com/authors/freepik"></div>
                                        <div class="dropdown_text">french</div>
                                    </a></li>
                                <li><a href="#">
                                        <div class="language_flag"><img src="images/flag_3.svg" alt="https://www.flaticon.com/authors/freepik"></div>
                                        <div class="dropdown_text">japanese</div>
                                    </a></li>
                                <li><a href="#">
                                        <div class="language_flag"><img src="images/flag_4.svg" alt="https://www.flaticon.com/authors/freepik"></div>
                                        <div class="dropdown_text">russian</div>
                                    </a></li>
                                <li><a href="#">
                                        <div class="language_flag"><img src="images/flag_5.svg" alt="https://www.flaticon.com/authors/freepik"></div>
                                        <div class="dropdown_text">spanish</div>
                                    </a></li>
                            </ul>

                        </div>

                        <!-- Currency -->

                       
                        <div class="info_currencies has_children">
                            <div class="dropdown_text"><% out.print(vaitroWebsite); %></div>


                        </div>

                    </div>
                </div>

                <!-- Logo -->
                <div class="sidebar_logo">Hi, 
                    <a href="#"><div><span>${sessionScope.username}</span></div></a>
                </div>

                <!-- Sidebar Navigation -->
                <nav class="sidebar_nav">
                    <ul>
                        <li><a href="index.html">home<i class="fa fa-angle-right" aria-hidden="true"></i></a></li>
                                <%
                                    if (session.getAttribute("vaitro").equals(1)) {
                                        out.print("<li><a href='admin/index.html'>Quản Lý Tài Khoản<i class='fa fa-users' aria-hidden='true'></i></a></li>");
                                        out.print("<li><a href='admin/sanpham.html'>Quản Lý Sản Phẩm<i class='fa fa-cogs' aria-hidden='true'></i></a></li>");
                                        out.print("<li><a href='admin/donhang.html'>Quản Lý Đơn Hàng<i class='fa fa-database' aria-hidden='true'></i></a></li>");
                                        out.print("<li><a href='admin/danhmuc.html'>Quản Lý Danh Mục<i class='fa fa-clone' aria-hidden='true'></i></a></li>");

                                    }
                                %>
                         <li><a href="viewOrder.html">View Order<i class="fa fa-gift" aria-hidden="true"></i></a></li>

                        <li><a href="cart.html">View Carts<i class="fa fa-shopping-cart" aria-hidden="true"></i></a></li>
                        <li><a href="login/logout.html">Logout<i class="fa fa-sign-out" aria-hidden="true"></i></a></li>

                    </ul>
                </nav>

                <!-- Search -->
                <!--<div class="search">
                        <form action="#" class="search_form" id="sidebar_search_form">
                                <input type="text" class="search_input" placeholder="Search" required="required">
                                <button class="search_button"><i class="fa fa-search" aria-hidden="true"></i></button>
                        </form>
                </div>-->

                <!-- Cart -->
                <div class="cart d-flex flex-row align-items-center justify-content-start">
                    <div class="cart_icon"><a href="cart.html">
                            <img src="images/bag.png" alt="">
                            <div class="cart_num" id="countSoLuongMonHang">${soLuongMonHang}</div>
                        </a></div>
                    <div class="cart_text">bag</div>
                    <div class="cart_price" id="countTongTienDongHang">$${tongTienDonHang}</div>
                </div>
            </div>

            <!-- Home -->

            <div class="home">

                <!-- Home Slider -->
                <div class="home_slider_container">
                    <div class="owl-carousel owl-theme home_slider">

                        <!-- Slide -->
                        <div class="owl-item">
                            <div class="background_image" style="background-image:url(images/home_slider_1.jpg)"></div>
                            <div class="home_content_container">
                                <div class="home_content">
                                    <div class="home_discount d-flex flex-row align-items-end justify-content-start">
                                        <div class="home_discount_num">20</div>
                                        <div class="home_discount_text">Discount on the</div>
                                    </div>
                                    <div class="home_title">New Collection</div>
                                    <div class="button button_1 home_button trans_200"><a href="categories.html">Shop NOW!</a></div>
                                </div>
                            </div>
                        </div>

                        <!-- Slide -->
                        <div class="owl-item">
                            <div class="background_image" style="background-image:url(images/home_slider_1.jpg)"></div>
                            <div class="home_content_container">
                                <div class="home_content">
                                    <div class="home_discount d-flex flex-row align-items-end justify-content-start">
                                        <div class="home_discount_num">20</div>
                                        <div class="home_discount_text">Discount on the</div>
                                    </div>
                                    <div class="home_title">New Collection</div>
                                    <div class="button button_1 home_button trans_200"><a href="categories.html">Shop NOW!</a></div>
                                </div>
                            </div>
                        </div>

                        <!-- Slide -->
                        <div class="owl-item">
                            <div class="background_image" style="background-image:url(images/home_slider_1.jpg)"></div>
                            <div class="home_content_container">
                                <div class="home_content">
                                    <div class="home_discount d-flex flex-row align-items-end justify-content-start">
                                        <div class="home_discount_num">20</div>
                                        <div class="home_discount_text">Discount on the</div>
                                    </div>
                                    <div class="home_title">New Collection</div>
                                    <div class="button button_1 home_button trans_200"><a href="categories.html">Shop NOW!</a></div>
                                </div>
                            </div>
                        </div>

                    </div>

                    <!-- Home Slider Navigation -->
                    <div class="home_slider_nav home_slider_prev trans_200"><div class=" d-flex flex-column align-items-center justify-content-center"><img src="images/prev.png" alt=""></div></div>
                    <div class="home_slider_nav home_slider_next trans_200"><div class=" d-flex flex-column align-items-center justify-content-center"><img src="images/next.png" alt=""></div></div>

                </div>
            </div>

            <!-- Boxes -->

            <div class="boxes">
                <div class="section_container">
                    <div class="container">
                        <div class="row">

                            <!-- Box -->
                            <div class="col-lg-4 box_col">
                                <div class="box">
                                    <div class="box_image"><img src="images/box_1.jpg" alt=""></div>
                                    <div class="box_title trans_200"><a href="categories.html">summer collection</a></div>
                                </div>
                            </div>

                            <!-- Box -->
                            <div class="col-lg-4 box_col">
                                <div class="box">
                                    <div class="box_image"><img src="images/box_2.jpg" alt=""></div>
                                    <div class="box_title trans_200"><a href="categories.html">eyewear collection</a></div>
                                </div>
                            </div>

                            <!-- Box -->
                            <div class="col-lg-4 box_col">
                                <div class="box">
                                    <div class="box_image"><img src="images/box_3.jpg" alt=""></div>
                                    <div class="box_title trans_200"><a href="categories.html">basic pieces</a></div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>

            <!-- Categories -->

            <div class="categories">
                <div class="section_container">
                    <div class="container">
                        <div class="row">
                            <div class="col text-center">
                                <div class="categories_list_container">
                                    <ul class="categories_list d-flex flex-row align-items-center justify-content-start">
                                        <li><a href="categories.html">new arrivals</a></li>
                                        <li><a href="categories.html">recommended</a></li>
                                        <li><a href="categories.html">best sellers</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Products -->

            <div class="products">
                <div class="section_container">
                    <div class="container">
                        <div class="row">
                            <div class="col">
                                <div class="products_container grid">




                                    <c:forEach var="u" items="${listSPHome}">
                                        <!-- Product -->
                                        <div class="product grid-item ${u.type}">
                                            <div class="product_inner">
                                                <div class="product_image"><img src="images/${u.hinh}" alt="">
                                                    <div class="product_tag">${u.type}</div>

                                                </div>
                                                <div class="product_content text-center">
                                                    <div class="product_title"><a href="product.html?maSP=${u.maSP}">${u.tenSP}</a></div>
                                                    <div class="product_price">$${u.donGia}<div>
                                                            <div class="product_button ml-auto mr-auto trans_200"><a href="addToCart.html?maSP=${u.maSP}">add to cart</a></div>
                                                        </div>
                                                    </div>	
                                                </div>
                                            </div>
                                        </div>
                                    </c:forEach>


                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Newsletter -->

            <div class="newsletter">
                <div class="parallax_background parallax-window" data-parallax="scroll" data-image-src="images/newsletter.jpg" data-speed="0.8"></div>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 offset-lg-2">
                            <div class="newsletter_content text-center">
                                <div class="newsletter_title_container">
                                    <div class="newsletter_title">subscribe to our newsletter</div>
                                    <div class="newsletter_subtitle">we won't spam, we promise!</div>
                                </div>
                                <div class="newsletter_form_container">
                                    <form action="#" id="newsletter_form" class="newsletter_form">
                                        <input type="email" class="newsletter_input" placeholder="your e-mail here" required="required">
                                        <button class="newsletter_button">submit</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Footer -->

            <footer class="footer">
                <div class="footer_content">
                    <div class="section_container">
                        <div class="container">
                            <div class="row">

                                <!-- About -->
                                <div class="col-xxl-3 col-md-6 footer_col">
                                    <div class="footer_about">
                                        <!-- Logo -->
                                        <div class="footer_logo">
                                            <a href="#"><div>ps<span>10511</span></div></a>
                                        </div>
                                        <div class="footer_about_text">
                                            <p>Hi, my name is Thanh. You can follow on <a href="https://www.facebook.com/Nobita76.Me" target="_blank">FB</a>.</p>
                                        </div>
                                        <div class="cards">
                                            <ul class="d-flex flex-row align-items-center justify-content-start">
                                                <li><a href="#"><img src="images/card_1.jpg" alt=""></a></li>
                                                <li><a href="#"><img src="images/card_2.jpg" alt=""></a></li>
                                                <li><a href="#"><img src="images/card_3.jpg" alt=""></a></li>
                                                <li><a href="#"><img src="images/card_4.jpg" alt=""></a></li>
                                                <li><a href="#"><img src="images/card_5.jpg" alt=""></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>

                                <!-- Questions -->
                                <div class="col-xxl-3 col-md-6 footer_col">
                                    <div class="footer_questions">
                                        <div class="footer_title">questions</div>
                                        <div class="footer_list">
                                            <ul>
                                                <li><a href="https://www.facebook.com/Nobita76.Me" target="_blank">About us</a></li>
                                                <li><a href="https://www.facebook.com/Nobita76.Me" target="_blank">Track Orders</a></li>
                                                <li><a href="https://www.facebook.com/Nobita76.Me" target="_blank">Returns</a></li>
                                                <li><a href="https://www.facebook.com/Nobita76.Me" target="_blank">Jobs</a></li>
                                                <li><a href="https://www.facebook.com/Nobita76.Me" target="_blank">Shipping</a></li>
                                                <li><a href="https://www.facebook.com/Nobita76.Me" target="_blank">Blog</a></li>
                                                <li><a href="https://www.facebook.com/Nobita76.Me" target="_blank">Partners</a></li>
                                                <li><a href="https://www.facebook.com/Nobita76.Me" target="_blank">Bloggers</a></li>
                                                <li><a href="https://www.facebook.com/Nobita76.Me" target="_blank">Support</a></li>
                                                <li><a href="https://www.facebook.com/Nobita76.Me" target="_blank">Terms of Use</a></li>
                                                <li><a href="https://www.facebook.com/Nobita76.Me" target="_blank">Press</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>

                                <!-- Blog -->
                                <div class="col-xxl-3 col-md-6 footer_col">
                                    <div class="footer_blog">
                                        <div class="footer_title">blog</div>
                                        <div class="footer_blog_container">

                                            <!-- Blog Item -->
                                            <div class="footer_blog_item d-flex flex-row align-items-start justify-content-start">
                                                <div class="footer_blog_image"><a href="#"><img src="images/footer_blog_1.jpg" alt=""></a></div>
                                                <div class="footer_blog_content">
                                                    <div class="footer_blog_title"><a href="#">what shoes to wear</a></div>
                                                    <div class="footer_blog_date">june 06, 2018</div>
                                                    <div class="footer_blog_link"><a href="#">Read More</a></div>
                                                </div>
                                            </div>

                                            <!-- Blog Item -->
                                            <div class="footer_blog_item d-flex flex-row align-items-start justify-content-start">
                                                <div class="footer_blog_image"><a href="#"><img src="images/footer_blog_2.jpg" alt=""></a></div>
                                                <div class="footer_blog_content">
                                                    <div class="footer_blog_title"><a href="#">trends this year</a></div>
                                                    <div class="footer_blog_date">june 06, 2018</div>
                                                    <div class="footer_blog_link"><a href="#">Read More</a></div>
                                                </div>
                                            </div>

                                        </div>
                                    </div>
                                </div>

                                <!-- Contact -->
                                <div class="col-xxl-3 col-md-6 footer_col">
                                    <div class="footer_contact">
                                        <div class="footer_title">contact</div>
                                        <div class="footer_contact_list">
                                            <ul>
                                                <li class="d-flex flex-row align-items-start justify-content-start"><span>SV.</span><div>Bùi Ngọc Thành - PS10511</div></li>
                                                <li class="d-flex flex-row align-items-start justify-content-start"><span>GVHD.</span><div>Thầy Cao Hoàng Phúc</div></li>
                                                <li class="d-flex flex-row align-items-start justify-content-start"><span>Mon.</span><div>Java 5</div></li>
                                                <li class="d-flex flex-row align-items-start justify-content-start"><span>E.</span><div>thanhbnps15011@fpt.edu.vn</div></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Social -->
                <div class="footer_social">
                    <div class="section_container">
                        <div class="container">
                            <div class="row">
                                <div class="col">
                                    <div class="footer_social_container d-flex flex-row align-items-center justify-content-between">
                                        <!-- Instagram -->
                                        <a href="https://www.facebook.com/Nobita76.Me" target="_blank">
                                            <div class="footer_social_item d-flex flex-row align-items-center justify-content-start">
                                                <div class="footer_social_icon"><i class="fa fa-instagram" aria-hidden="true"></i></div>
                                                <div class="footer_social_title">instagram</div>
                                            </div>
                                        </a>
                                        <!-- Google + -->
                                        <a href="https://www.facebook.com/Nobita76.Me" target="_blank">
                                            <div class="footer_social_item d-flex flex-row align-items-center justify-content-start">
                                                <div class="footer_social_icon"><i class="fa fa-google-plus" aria-hidden="true"></i></div>
                                                <div class="footer_social_title">google +</div>
                                            </div>
                                        </a>
                                        <!-- Pinterest -->
                                        <a href="https://www.facebook.com/Nobita76.Me" target="_blank">
                                            <div class="footer_social_item d-flex flex-row align-items-center justify-content-start">
                                                <div class="footer_social_icon"><i class="fa fa-pinterest" aria-hidden="true"></i></div>
                                                <div class="footer_social_title">pinterest</div>
                                            </div>
                                        </a>
                                        <!-- Facebook -->
                                        <a href="https://www.facebook.com/Nobita76.Me" target="_blank">
                                            <div class="footer_social_item d-flex flex-row align-items-center justify-content-start">
                                                <div class="footer_social_icon"><i class="fa fa-facebook" aria-hidden="true"></i></div>
                                                <div class="footer_social_title">facebook</div>
                                            </div>
                                        </a>
                                        <!-- Twitter -->
                                        <a href="https://www.facebook.com/Nobita76.Me" target="_blank">
                                            <div class="footer_social_item d-flex flex-row align-items-center justify-content-start">
                                                <div class="footer_social_icon"><i class="fa fa-twitter" aria-hidden="true"></i></div>
                                                <div class="footer_social_title">twitter</div>
                                            </div>
                                        </a>
                                        <!-- YouTube -->
                                        <a href="https://www.facebook.com/Nobita76.Me" target="_blank">
                                            <div class="footer_social_item d-flex flex-row align-items-center justify-content-start">
                                                <div class="footer_social_icon"><i class="fa fa-youtube" aria-hidden="true"></i></div>
                                                <div class="footer_social_title">youtube</div>
                                            </div>
                                        </a>
                                        <!-- Tumblr -->
                                        <a href="https://www.facebook.com/Nobita76.Me" target="_blank">
                                            <div class="footer_social_item d-flex flex-row align-items-center justify-content-start">
                                                <div class="footer_social_icon"><i class="fa fa-tumblr-square" aria-hidden="true"></i></div>
                                                <div class="footer_social_title">tumblr</div>
                                            </div>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>				
                </div>

                <!-- Credits -->
                <div class="credits">
                    <div class="section_container">
                        <div class="container">
                            <div class="row">
                                <div class="col">
                                    <div class="credits_content d-flex flex-row align-items-center justify-content-end">
                                        <div class="credits_text"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                            Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved
                                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </footer>

        </div>

        


        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="styles/bootstrap-4.1.3/popper.js"></script>
        <script src="styles/bootstrap-4.1.3/bootstrap.min.js"></script>
        <script src="plugins/greensock/TweenMax.min.js"></script>
        <script src="plugins/greensock/TimelineMax.min.js"></script>
        <script src="plugins/scrollmagic/ScrollMagic.min.js"></script>
        <script src="plugins/greensock/animation.gsap.min.js"></script>
        <script src="plugins/greensock/ScrollToPlugin.min.js"></script>
        <script src="plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
        <script src="plugins/easing/easing.js"></script>
        <script src="plugins/parallax-js-master/parallax.min.js"></script>
        <script src="plugins/Isotope/isotope.pkgd.min.js"></script>
        <script src="plugins/Isotope/fitcolumns.js"></script>
        <script src="js/custom.js"></script>
        <script>
            $(document).ready(function () {
                loadCount();

            })
            
            function loadCount(){
                $.get("api/getCart.html").done(function (ps10511){
                    ps10511 = JSON.parse(ps10511);
                    $("#countSoLuongMonHang1").html(ps10511.count);
                    $("#countSoLuongMonHang").html(ps10511.count);
                    $("#countTongTienDongHang").html("$"+ps10511.tongTien);
                })
            }


        </script>
    </body>
</html>
