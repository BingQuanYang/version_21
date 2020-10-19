/**
 * kun
 * @type {string}
 */

const BASE_URL = "http://localhost:8080/api"
let INDEX_URL = BASE_URL + "/home2"
const IMAGE = "../images/cake.png"

$(function () {
    $.get(INDEX_URL, function (result) {
        if (result.status === 200) {
            showClassification(result.data.classes)
        } else {
            alert("系统繁忙!请稍后再试!!!")
        }
    });
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
                                                        .attr("src", IMAGE)
                                                )

                                        )
                                    /*.append($('<a class="ml-22">').text(c.classification) )*/
                                )
                            /*.append($("<div class=\"menu-item menu-in top\">")
                                .append(
                                    $("<div class=\"area-in\">")
                                        .append(
                                            $("<div class=\"area-bg\">")
                                                .append(
                                                    $("<div class=\"menu-srot\">")
                                                        .append(
                                                            $("<div class=\"sort-side\">")
                                                                .append(
                                                                    $("<dl class=\"dl-sort\">")
                                                                )
                                                        )
                                                )
                                        )
                                )
                            )*/
                        )

            )
        }
    }
})