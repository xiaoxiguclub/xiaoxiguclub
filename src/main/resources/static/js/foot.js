function showWeiboWin() {
    window.open('https://weibo.com/2835230221','newwindow');
}

function showEmailWin() {
    new $.zui.Messager('<span style="font-size:18px;">请往这里邮：lianggepeinixuejava@gmail.com</span>', {
        icon: 'envelope',
        time: 10000,
        placement: 'center' // 定义显示位置
    }).show();
}

function showWxWin() {
    // $('#id_modal_content').html('<div style="padding:20px; text-align:center;"><p class="lead" style="margin:30px;">请扫这里</p><img src="/images/qrcode_xiaoxiguclub_wx.jpg"><img src="/images/contact_wx_app.jpg">');
    $('#id_modal_content').html('<table style="text-align: center;padding:20px;margin: auto"><tr><td colspan="2">请扫这里</td></tr><tr><td><img src="images/qrcode_xiaoxiguclub_wx.jpg"></td><td><img src="images/contact_wx_app.jpg"></td></tr><tr><td>微信公众号</td><td>微信小程序</td></tr></table>');
    $('#myModal').modal();
}

function goToTop() {
    var timer = setInterval(function () {
        window.scrollBy(0, -100);
        if (document.body.scrollTop == 0) {
            clearInterval(timer);
        }
        ;
    }, 8);
}

function initCurMenu() {
    var _location = window.location.href;
    if (_location.indexOf("/activities") != -1) {
        $(".menu-activity").addClass("current");
        return;
    }
    if (_location.indexOf("/stars") != -1) {
        $(".menu-star").addClass("current");
        return;
    }
    if (_location.indexOf("/photos") != -1) {
        $(".menu-photo").addClass("current");
        return;
    }
    if (_location.indexOf("/works") != -1) {
        $(".menu-work").addClass("current");
        return;
    }
    if (_location.indexOf("/videos") != -1) {
        $(".menu-video").addClass("current");
        return;
    }
    $(".menu-home").addClass("current");
}

initCurMenu();