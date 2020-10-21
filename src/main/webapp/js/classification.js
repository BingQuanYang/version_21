/**
 * kun
 * @type {string}
 */

const BASE_URL = "http://localhost:8080/api"
let INDEX_URL = BASE_URL + "/HomeController"
const IMAGE = "../images/"
const IMAGE2 ="../images2/"

$(function () {
    $.get(INDEX_URL, function (result) {
        if (result.status === 200) {
            showClassification(result.data.classes);
            showHeadlines(result.data.headlines);
            showCategory(result.data.categories);
            showInformation(result.data.information);
            showSeckill(result.data.seckill);
        } else {
            alert("系统繁忙!请稍后再试!!!")
        }
    });

    /**
     * 作者：kun
     * @param classes
     */
    function showClassification(classes) {
        for (const c of classes) {
            $("#js_climit_li")
                .append(
                    $("<li>")
                        .append(
                            $('<div class="category-info">')
                                .append(
                                    $('<h3 class="category-name b-category-name">')
                                        .append(
                                            $("<i>")
                                                .append(
                                                    $("<img>")
                                                        .attr("src", IMAGE+c.image)
                                                )

                                        )
                                    .append($('<a class="ml-22">').text(c.classification) )
                                )
                        )

            )
        }
    }
    function showHeadlines(headlines) {
        for (const co of headlines){
            $("#jjjjdk45").append(
                $("<li>").append(
                    $("<a target=\"_blank\">")
                        .attr("href","#")
                        .text(co.headlines)
                )
            )
        }
    }
    function showCategory(categories) {
        for (const c of categories){
            $("#zhangkunshan001").append(
                $('<h4 class="floor-title">').text(c.name)
                    .append(
                        $('<em class="am-icon-caret-left">')
                            .append("<h3>").text(c.describe)
                    )
            )
        }
    }
    function showInformation(information) {
            $("#zhangkunshan4568")
                .append(
                    $('<div class="am-u-sm-5 am-u-md-3 text-one list">')
                        .append(
                            $('<div class="word">')
                                .append(
                                    $('<a class="outer">').attr("href","#")
                                        .append(
                                            $("<span class=\"inner\">")
                                                .append(
                                                    $('<b class="text">')
                                                )
                                        )
                                )
                                .append(
                                    $('<a class="outer">').attr("href","#")
                                        .append(
                                            $("<span class=\"inner\">")
                                                .append(
                                                    $('<b class="text">')
                                                )
                                        )
                                )
                                .append(
                                    $('<a class="outer">').attr("href","#")
                                        .append(
                                            $("<span class=\"inner\">")
                                                .append(
                                                    $('<b class="text">')
                                                )
                                        )
                                )
                                .append(
                                    $('<a class="outer">').attr("href","#")
                                        .append(
                                            $("<span class=\"inner\">")
                                                .append(
                                                    $('<b class="text">')
                                                )
                                        )
                                )
                                .append(
                                    $('<a class="outer">').attr("href","#")
                                        .append(
                                            $("<span class=\"inner\">")
                                                .append(
                                                    $('<b class="text">')
                                                )
                                        )
                                )
                                .append(
                                    $('<a class="outer">').attr("href","#")
                                        .append(
                                            $("<span class=\"inner\">")
                                                .append(
                                                    $('<b class="text">')
                                                )
                                        )
                                )
                                .append(
                                    $('<a class="outer">').attr("href","#")
                                        .append(
                                            $("<span class=\"inner\">")
                                                .append(
                                                    $('<b class="text">')
                                                )
                                        )
                                )
                                .append(
                                    $('<a class="outer">').attr("href","#")
                                        .append(
                                            $("<span class=\"inner\">")
                                                .append(
                                                    $('<b class="text">')
                                                )
                                        )
                                )
                                .append(
                                    $('<a class="outer">').attr("href","#")
                                        .append(
                                            $("<span class=\"inner\">")
                                                .append(
                                                    $('<b class="text">')
                                                )
                                        )
                                )
                        )
                        .append(
                            $("<a>").attr("href","introduction.html?commodity_id="+information[0].id)
                                .append(
                                    $('<img>').attr("src",IMAGE2+information[0].image)
                                )
                                .append(
                                    $('<div class="outer-con ">')
                                        .append(
                                            $('<div class="title ">').text(information[0].shopDiscount)
                                        )
                                        .append(
                                            $('<div class="sub-title ">').text(information[0].promotiomPrice)
                                        )
                                )
                        )
                        .append(
                            $('<div class="triangle-topright">')
                        )
                )
                .append(
                    $("<div>")
                        .append(
                            $('<div class="am-u-sm-7 am-u-md-5 am-u-lg-2 text-two big">')
                                .append(
                                    $('<div class="outer-con ">')
                                        .append(
                                            $('<div class="title ">').text(information[1].shopDiscount)
                                        )
                                        .append(
                                            $('<div class="sub-title ">').text(information[1].promotiomPrice)
                                        )
                                )
                                .append(
                                    $("<a>")
                                        .attr("href","introduction.html?commodity_id="+information[1].id)
                                        .append(
                                            $("<img>")
                                                .attr("src",IMAGE2+information[1].image)
                                        )
                                )

                        )
                        .append(
                            $("<li>")
                                .append(
                                    $('<div class="am-u-md-2 am-u-lg-2 text-three">')
                                        .append(
                                            $('<div class="boxLi">')
                                        )
                                        .append(
                                            $('<div class="outer-con ">')
                                                .append(
                                                    $('<div class="title ">').text(information[2].shopDiscount)
                                                )
                                                .append(
                                                    $('<div class="sub-title ">').text(information[2].promotiomPrice)
                                                )
                                        )
                                        .append(
                                            $('<a>').attr("href","introduction.html?commodity_id="+information[2].id)
                                                .append(
                                                    $("<img>").attr("src",IMAGE2+information[2].image)
                                                )
                                        )
                                )
                        )
                        .append(
                            $("<li>")
                                .append(
                                    $('<div class="am-u-md-2 am-u-lg-2 text-three sug">')
                                        .append(
                                            $('<div class="boxLi">')
                                        )
                                        .append(
                                            $('<div class="outer-con ">')
                                                .append(
                                                    $('<div class="title ">').text(information[3].shopDiscount)
                                                )
                                                .append(
                                                    $('<div class="sub-title ">').text(information[3].promotiomPrice)
                                                )
                                        )
                                        .append(
                                            $('<a>').attr("href","introduction.html?commodity_id="+information[3].id)
                                                .append(
                                                    $("<img>").attr("src",IMAGE2+information[3].image)
                                                )
                                        )
                                )
                        )
                        .append(
                            $("<li>")
                                .append(
                                    $('<div class="am-u-sm-4 am-u-md-5 am-u-lg-4 text-five">')
                                        .append(
                                            $('<div class="boxLi">')
                                        )
                                        .append(
                                            $('<div class="outer-con ">')
                                                .append(
                                                    $('<div class="title ">').text(information[4].shopDiscount)
                                                )
                                                .append(
                                                    $('<div class="sub-title ">').text(information[4].promotiomPrice)
                                                )
                                        )
                                        .append(
                                            $('<a>').attr("href","introduction.html?commodity_id="+information[4].id)
                                                .append(
                                                    $("<img>").attr("src",IMAGE2+information[4].image)
                                                )
                                        )
                                )
                        )
                        .append(
                            $("<li>")
                                .append(
                                    $('<div class="am-u-sm-4 am-u-md-2 am-u-lg-2 text-six">')
                                        .append(
                                            $('<div class="boxLi">')
                                        )
                                        .append(
                                            $('<div class="outer-con ">')
                                                .append(
                                                    $('<div class="title ">').text(information[5].shopDiscount)
                                                )
                                                .append(
                                                    $('<div class="sub-title ">').text(information[5].promotiomPrice)
                                                )
                                        )
                                        .append(
                                            $('<a>').attr("href","introduction.html?commodity_id="+information[5].id)
                                                .append(
                                                    $("<img>").attr("src",IMAGE2+information[5].image)
                                                )
                                        )
                                )
                        )
                        .append(
                            $("<li>")
                                .append(
                                    $('<div class="am-u-sm-4 am-u-md-2 am-u-lg-4 text-six">')
                                        .append(
                                            $('<div class="boxLi">')
                                        )
                                        .append(
                                            $('<div class="outer-con ">')
                                                .append(
                                                    $('<div class="title ">').text(information[6].shopDiscount)
                                                )
                                                .append(
                                                    $('<div class="sub-title ">').text(information[6].promotiomPrice)
                                                )
                                        )
                                        .append(
                                            $('<a>').attr("href","introduction.html?commodity_id="+information[6].id)
                                                .append(
                                                    $("<img>").attr("src",IMAGE2+information[6].image)
                                                )
                                        )
                                )
                        )
                )


    }
    /**
     * 作者：全
     * @param seckills
     */
    function showSeckill(seckills){
        for (const seckill of seckills) {
            $("#sale").append(
                $('<div class="am-u-sm-3 sale-item">').append(
                    $('<div class="s-img">').append(
                        $("<a href='../home/introduction.html?commodity_id="+seckill.id+"'>").append(
                            $('<img src="../images/'+seckill.image+'"/>')
                        )
                    )
                ).append(
                    $('<div class="s-info">').append(
                        $("<a href='../home/introduction.html?commodity_id="+seckill.id+"'>").append(
                            $('<p class="s-title">').text(seckill.shopDiscount)
                        )
                    ).append(
                        $('<div class="s-price">').append(
                            "￥"
                        ).append(
                            $('<b>').text(seckill.originalPrice)
                        ).append(
                            $('<a class="s-buy" href="../home/introduction.html?commodity_id='+seckill.id+'">秒杀</a>')
                        )
                    )
                )
            )
        }
    }



})