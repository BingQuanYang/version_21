$(function () {
    var time = {
        init: function () {
            var h = '0' + 1;
            var m = 59;
            var s = 59;
            $(".hh").text(h)
            $(".mm").text(m)
            $(".ss").text(s)
            //进行倒计时显示
            var time = setInterval(function () {
                --s;
                if (s < 0) {
                    --m;
                    s = 59;
                }
                if (m < 0) {
                    --h;
                    m = 59
                }
                if (h < 0) {
                    s = 0;
                    m = 0;
                }

                // 判断当时分秒小于10时补0
                function checkTime(i) {
                    if (i < 10) {
                        i = '0' + i
                    }
                    return i;
                }

                s = checkTime(s);
                m = checkTime(m);
                $(".hh").text(h)
                $(".mm").text(m)
                $(".ss").text(s)
            }, 1000);
        }
    }
    time.init();
})