/**
 * kun
 * @type {string}
 */

const BASE_URL = "http://localhost:8080/api"
let INDEX_URL = BASE_URL + "/HomeController"
const IMAGE = "../images/"
const IMAGE = "../images2/"

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
                            $('<div class="am-u-sm-7 am-u-md-5 am-u-lg-2 text-two big">')
                                .append(
                                    $('<div class="outer-con ">')
                                        .append(
                                            $('<div class="title ">').text("321")
                                        )
                                        .append(
                                            $('<div class="sub-title ">').text("123")
                                        )
                                )
                                .append(
                                    $("<a>")
                                        .attr("href","#")
                                        .append(
                                            $("<img>")
                                                .attr("src","../images/act1.png")
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
                                                    $('<div class="title ">').text("123")
                                                )
                                                .append(
                                                    $('<div class="sub-title ">').text("321")
                                                )
                                        )
                                        .append(
                                            $('<a>').attr("href","#")
                                                .append(
                                                    $("<img>").attr("src","../images/1.jpg ")
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
                                                    $('<div class="title ">').text("123")
                                                )
                                                .append(
                                                    $('<div class="sub-title ">').text("321")
                                                )
                                        )
                                        .append(
                                            $('<a>').attr("href","#")
                                                .append(
                                                    $("<img>").attr("src","../images/1.jpg ")
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
                                                    $('<div class="title ">').text("123")
                                                )
                                                .append(
                                                    $('<div class="sub-title ">').text("321")
                                                )
                                        )
                                        .append(
                                            $('<a>').attr("href","#")
                                                .append(
                                                    $("<img>").attr("src","../images/1.jpg ")
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
                                                    $('<div class="title ">').text("123")
                                                )
                                                .append(
                                                    $('<div class="sub-title ">').text("321")
                                                )
                                        )
                                        .append(
                                            $('<a>').attr("href","#")
                                                .append(
                                                    $("<img>").attr("src","../images/1.jpg ")
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
                                                    $('<div class="title ">').text("123")
                                                )
                                                .append(
                                                    $('<div class="sub-title ">').text("321")
                                                )
                                        )
                                        .append(
                                            $('<a>').attr("href","#")
                                                .append(
                                                    $("<img>").attr("src","../images/1.jpg ")
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
                        $("<a href='../home/introduction.html?commodity_id="+seckill.pId+"'>").append(
                            $('<img src="../images/'+seckill.image+'"/>')
                        )
                    )
                ).append(
                    $('<div class="s-info">').append(
                        $("<a href='../home/introduction.html?commodity_id="+seckill.pId+"'>").append(
                            $('<p class="s-title">').text(seckill.shopDiscount)
                        )
                    ).append(
                        $('<div class="s-price">').append(
                            "￥"
                        ).append(
                            $('<b>').text(seckill.originalPrice)
                        ).append(
                            $('<a class="s-buy" href="../home/introduction.html?commodity_id='+seckill.pId+'">秒杀</a>')
                        )
                    )
                )
            )
        }
    }



})