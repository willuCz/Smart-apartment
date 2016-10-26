$(document).ready(function () {
    $("footer ul li").each(function () {
        $(this).mouseenter(function () {
            $(this).find("a img").addClass("imgBig");
            $(this).prev().find("a img").addClass("imgBigS");
            $(this).next().find("a img").addClass("imgBigS");
        })
        $(this).mouseleave(function () {
            $(this).find("a img").removeClass("imgBig");
            $(this).prev().find("a img").removeClass("imgBigS");
            $(this).next().find("a img").removeClass("imgBigS");
        })
    })
});