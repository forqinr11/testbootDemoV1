$(function(){

});
    function login(){
        var s="sss";
        var password=s+$("#password").val()+s;
        $("#password").val(password);
        $("#login_form").submit();
    }
