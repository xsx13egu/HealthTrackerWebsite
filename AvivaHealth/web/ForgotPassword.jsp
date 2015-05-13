<%-- 
    Document   : ForgotPassword
    Created on : 12-May-2015, 15:51:45
    Author     : xsx13egu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html >
    <head>
        <meta charset="UTF-8">
        <title>Reset Password</title>
                <link href="main.css" rel="stylesheet" type="text/css" media="only screen" />

    </head>
    <body>
        <div id="surface">
            <header id="header-container">
                <a class="header-logo-container" href="index.html" title="Back to main page">
                    <span class="header-logo-default"></span>
                </a>
            </header>
            <div id="wrapper">
                <div class="wrapper clearfix">

                    <div class="resetPassword-container">
                        <div id="resetPassword-form">                           
                            <h3>Reset Password</h3>
                <form action="javascript:void(0);" method="get">
                    <input type="email" required value="Email" onBlur="if (this.value == '')
                                this.value = 'Email'" onFocus="if (this.value == 'Email')
                                            this.value = ''"> <!-- JS because of IE support; better: placeholder="Email" -->
                 <input type="email" required value="Confirm Email" onBlur="if (this.value == '')
                                this.value = 'Confirm Email'" onFocus="if (this.value == 'Confirm Email')
                                            this.value = ''"> <!-- JS because of IE support; better: placeholder="Email" -->
                    <input type="submit" value="Reset Password">
                </form>
                        </div>
                    </div> <!-- end resetpassword-form -->

                </div>
            </div>
        </div>
    </body>
</html>
