<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1" />
    <title>Insert title here</title>
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
        width:500px;
        height:383px;
        border:1px solid black;
    }
    .submitButton{
        padding-top:16px;
        float:right;
        padding-right:16px;
    }
    .hiddenDiv{
        display:none;
    }
</style>
<body>
<div class="outsideDIV">
    <p class="title">用户注册（基本信息）</p>
    <form id="loginForm" name="form1" method="post">
        <table>
            <tr>
                <td class="leftTd">用户名</td>
                <td><input type="text" /></td>
            </tr>
            <tr>
                <td class="leftTd">验证码</td>
                <td><input type="text" /></td>
            </tr>
            <tr>
                <td class="leftTd">性别</td>
                <td><input type="radio" name="sex" checked>男  <input type="radio" name="sex">女</td>
            </tr>
            <tr>
                <td class="leftTd">论坛密码</td>
                <td><input type="text" /></td>
            </tr>
            <tr>
                <td class="leftTd">验证码</td>
                <td><input type="text" /></td>
            </tr>
            <tr>
                <td class="leftTd">请在输入一遍确认</td>
                <td><input type="text" /></td>
            </tr>
            <tr>
                <td class="leftTd">E-Mail</td>
                <td><input type="text" /></td>
            </tr>
            <tr>
                <td class="leftTd">请回答注册问题</td>
                <td><input type="text" /></td>
            </tr>
            <tr>
                <td class="leftTd">验证码</td>
                <td>2=2=？</td>
            </tr>
            <tr>
                <td class="leftTd">你的回答是：</td>
                <td><input type="text" /></td>
            </tr>
            <tr>
                <td class="leftTd">为避免机器注册请提交<br>您的时区和时间</td>
                <td>
                    <select id="city" class="select">
                        <option value="0">请设置您所在时区</option>
                    </select>
                    <br>
                    <select id="city" class="select">
                        <option value="0">您所在地的时间是几点</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td class="leftTd">高级选项</td>
                <td><input id="checkboxIsChecked" type="checkbox"> 显示高级用户设置选项</td>
            </tr>
            <tr class="hiddenDiv">
                <td class="leftTd">学历</td>
                <td><input type="text"></td>
            </tr>
        </table>
        <div class="submitButton"><input type="checkbox" checked> 同意并接受注册协议 <input type="button" value="提交"> <input type="button" value="重置"></div>
    </form>
</div>
</body>
</html>