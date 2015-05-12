<%--
    Document   : register
    Created on : May 11, 2015, 11:51:55 PM
    Author     : Thomas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html >
    <head>
        <meta charset="UTF-8">
        <title>Register</title>
                <link href="main.css" rel="stylesheet" type="text/css" media="only screen" />

    </head>
    <body>
        <div id="surface">
            <header id="header-container">
                <a class="header-logo-container" href="#" title="Back to main page">
                    <span class="header-logo-default"></span>
                </a>
            </header>
            <div id="wrapper">
                <div class="wrapper clearfix">

                    <div class="register-container">
                        <div id="register-form">                           
                            <h3>Create an Account</h3>
                <form action="javascript:void(0);" method="get">
                    <input type="username" required value="Username" onBlur="if (this.value == '')
                                this.value = 'Username'" onFocus="if (this.value == 'Username')
                                            this.value = ''"> <!-- JS because of IE support; better: placeholder="Email" -->
                    <input type="email" required value="Email" onBlur="if (this.value == '')
                                this.value = 'Email'" onFocus="if (this.value == 'Email')
                                            this.value = ''"> <!-- JS because of IE support; better: placeholder="Email" -->
                    <input type="password" required value="Password" onBlur="if (this.value == '')
                                this.value = 'Password'" onFocus="if (this.value == 'Password')
                                            this.value = ''"> <!-- JS because of IE support; better: placeholder="Password" -->
                    <input type="submit" value="Register">
                </form>
                        </div>
                    </div> <!-- end login-form -->

                </div>
            </div>
        </div>
    </body>
</html>
