$(document).ready(function () {

    var btn_side_menu = false;

    $("#menu-btn").click(function () {
        if (btn_side_menu === false) {
            document.getElementById("sidenav").style.width = "250px";
            btn_side_menu = true;
        } else {
            btn_side_menu = false;
            document.getElementById("sidenav").style.width = "0";
        }
    });

    $("#close-menu-btn").click(function () {
        if (btn_side_menu === true) {
            btn_side_menu = false;
            document.getElementById("sidenav").style.width = "0";
        }
    });
    $(".main").click(function () {
        if (btn_side_menu === true) {
            btn_side_menu = false;
            document.getElementById("sidenav").style.width = "0";
        }
    });
});