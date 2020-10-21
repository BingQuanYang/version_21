$(function () {

    let   params = {
        uid: 1,
    }
    $.post("/UserController",params,function (result) {
        if (result.status === 200){
            let user = result.data;
            alert(user)
            $("#username").text(user.username)
            $("#id").text(user.id)
            $("#name").text(user.name)
            $("#sex").text(user.sex)
            $("#birthday").text(user.birthday)
            $("#nian").text(user.nian)
            $("#yue").text(user.yue)
            $("#day").text(user.day)
            $("#user-phone").text(user.phone)
            $("#email").text(user.email)
        }

    })
})