/**
 * 作者：全
 * @type {string}
 */
const EMAIL_REGISTER = "http://localhost:8080/api/EmailRegisterController"
$(function () {
    $("#reader-me").change(function () {
        var checked = document.getElementById("reader-me").checked;
        if(checked == true){
            $("#register1").removeAttr("disabled")
        }else {
            $("#register1").attr("disabled",true)
        }
    })
    $("#reader-me2").change(function () {
        var checked = document.getElementById("reader-me2").checked;
        if(checked == true){
            $("#register2").removeAttr("disabled")
        }else {
            $("#register2").attr("disabled",true)
        }
    })
    $("#register1").click(function () {
        var email = $("#email").val();
        var password = $("#password").val();
        var passwordRepeat = $("#passwordRepeat").val();
        if(email == ""){
            showErrorBox("邮箱不能为空")
            return;
        }
        if(password == ""){
            showErrorBox("设置密码不能为空")
            return;
        }
        if(passwordRepeat == ""){
            showErrorBox("确认密码不能为空")
            return;
        }
        if(password!=passwordRepeat){
            showErrorBox("设置密码和确认密码不一致")
            return;
        }
        var params = {
            email:email,
            password:password
        }
        var reg = new RegExp("^[a-z0-9A-Z]+[- | a-z0-9A-Z . _]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$");
        if(!reg.test(email)) {
            showErrorBox("邮箱格式不正确，请重新输入！");
            return;
        }
        $.post(EMAIL_REGISTER,params,function (result) {
            if(result.status === 200){
                location.href="login.html";
            }else {
                var email = $("#email").val("");
                var password = $("#password").val("");
                var passwordRepeat = $("#passwordRepeat").val("");
                showErrorBox("该邮箱已注册直接登录即可")
            }
        })
    });
})

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