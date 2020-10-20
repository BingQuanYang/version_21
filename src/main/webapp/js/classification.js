/**
 * kun
 * @type {string}
 */

const BASE_URL = "http://localhost:8080/api"
let INDEX_URL = BASE_URL + "/HomeController"
const IMAGE = "../images/"

$(function () {
    $.get(INDEX_URL, function (result) {
        if (result.status === 200) {
            showClassification(result.data.classes);
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