/*$(function () {
    $.ajax({
        url: "/onps/user/login.do",
        type: "post",
        async: false,
        data: {
            "userName":"leo",
            "password":"123"
        },
        success: function (data) {
            console.log(data);
            if (data.status == 'S00001') {
                $("#centerText").html("登录成功");
                window.location.href = data.message;
            } else {
                $("#centerText").html(data.message);
            }

        },
        error: function (data) {
            alert("请求失败!");
        }
    });
});*/
$(function () {
    $('#submit').click(function () {
        $.ajax({
            url: "/login.do",
            type: "post",
            async: false,
            data: {
                "userName":$("#userName").val(),
                "password":$("#password").val()
            },
            success: function (data) {
                console.log(data);
                if (data.status == 'S00001') {
                    $("#centerText").html("登录成功");
                } else {
                    $("#centerText").html(data.entity);
                }

            },
            error: function (data) {
                alert("请求失败!");
            }
        });
    });
});