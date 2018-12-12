<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1" />
    <title>督办模块</title>
    <script type="text/javascript" src="${requestContext.contextPath}/static/common/js/jquery.min.js"></script>
    <script type="text/javascript" src="${requestContext.contextPath}/static/js/login.js"></script>

</head>
<style type="text/css">
    .title{
        font-weight:bold;
        margin:0px;
    }
    .leftTd{
        text-align:right;
        padding-right:10px;
    }
    .outsideDIV{
        width:245px;
        height:145px;
        border:1px solid black;
    }
    .submitButton{
        padding-top:16px;
        padding-right:16px;
        text-align:center;
    }
    .hiddenDiv{
        display:none;
    }
</style>
<body>
<div class="outsideDIV">
    <p class="title">用户登录</p>
    <form id="loginForm" name="loginForm" action="login" method="post">

        <table>
            <tr>
                <td class="leftTd">用户名</td>
                <td><input type="text" name="username" id="username"/></td>
            </tr>
            <tr>
                <td class="leftTd">密码</td>
                <td><input type="password" name="password" id="password"/></td>
            </tr>
        </table>
        <div class="submitButton"> <input type="submit" onclick="login()" style="width:80px;" value="登录"></div>
    </form>
</div>
</body>
</html>