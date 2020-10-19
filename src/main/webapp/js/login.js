/**
 * 作者：全
 * @type {string}
 */
const LOGIN_URL = "http://localhost:8080/app/LoginController"
$(function () {
    //从Cookie中获取数据
    var username = getCookie("username");
    var password = getCookie("password");
    $("#user").val(username);
    $("#password").val(password);

    $("#login").click(function () {
        var username = $("#user").val();
        var password = $("#password").val();
        var remember = document.getElementById("remember-me").checked;
        if(username == ""){
            showErrorBox("用户名不能为空");
            return;
        }
        if(password == ""){
            showErrorBox("密码不能为空");
            return;
        }
        var params = {
            username:username,
            password:password,
            remember:remember
        }
        $.post(LOGIN_URL,params,function (result) {
            if(result.status === 200){
                location.href="home2.html";
            }else {
                showErrorBox("密码有误")
            }
        });
    });
    function showErrorBox(message) {
        Lobibox.notify('error', {
            size: 'mini',
            delay: 2000,
            delayIndicator: false,
            title: false, //不给title
            msg: message,
            sound: false  // 不要音频
        })
    }
})

function getCookie(cname)
{
    var name = cname + "=";
    var ca = document.cookie.split(';');
    for(var i=0; i<ca.length; i++)
    {
        var c = ca[i].trim();
        if (c.indexOf(name)==0) return c.substring(name.length,c.length);
    }
    return "";
}

