let dase="http://localhost:8080/api/introduction";
$(function () {
    let commodity=getQueryString("commodity_id");
    let params={
        commodity_id:commodity
    };


    $.get(dase,params,function (result) {
        console.log(result);
        if(result.status===200){
            //显示商品的所有信息
            showinformation(result.data.infor);
            //显示商品介绍图片
            showimg(result.data.infor);
            //显示所有的商品的详细介绍

            showDetailsAll(result.data.details);
            //显示所有的图片
            showImgAll(result.data.img);
            //显示商品
            showSee(result.data.recommends);
        }else {
            alert("系统繁忙!请稍后再试!!!");
        }
    });

    function showinformation(data) {
        $("#detail").append(
            $("<div>")
                .addClass("tb-detail-hd")
                .append(
                    $("<h1>").text(data.shopDiscount)
                ),
            $("<div>").addClass("tb-detail-list")
                .text("价格")
                .append(
                    $('<div class="tb-detail-price">').append(
                        $("<li>").addClass("price iteminfo_price")
                            .append(
                                $("<dt>").text("促销价"),
                                $("<dd>").append(
                                    $("<em>").text("￥"),
                                    $("<b>")
                                        .addClass("sys_item_price")
                                        .text(data.promotiomPrice)
                                )
                            ),
                        $("<li>")
                            .addClass("price iteminfo_mktprice")
                            .append(
                                $("<dt>").text("原价"),
                                $("<dd>").append(
                                    $("<em>").text("￥"),
                                    $("<b>")
                                        .addClass("sys_item_mktprice")
                                        .text(data.originalPrice)
                                )
                            ),
                        $("<div>").addClass("clear")
                    ),
                    $("<dl>")
                        .addClass("iteminfo_parameter freight")
                        .append(
                            $("<dt>").text("配送至"),
                            $("<div>").addClass("iteminfo_freprice")
                                .append(
                                    $("<div>").addClass("am-form-content address")
                                        .append(
                                            $("<select data-am-selected>").append(
                                                $("<option value='a'>").text("浙江省"),
                                                $("<option value='b'>").text("湖北省")
                                            ),
                                            $("<select data-am-selected>").append(
                                                $("<option value='a'>").text("温州市"),
                                                $("<option value='b'>").text("武汉市")
                                            ),
                                            $("<select data-am-selected>").append(
                                                $("<option value='a'>").text("瑞安区"),
                                                $("<option value='b'>").text("洪山区")
                                            )
                                        ),
                                    $("<div>").addClass("pay-logis")
                                        .text("快递")
                                        .append(
                                            $("<b>").text(data.freight+"元")
                                        )
                                )

                        ), $("<div>").addClass("clear"),
                    $("<ul>").addClass("tm-ind-panel")
                        .append(
                            $("<li>").addClass("tm-ind-item tm-ind-sellCount canClick")
                                .append(
                                    $("<div>").addClass("tm-indcon")
                                        .append(
                                            $("<span>").addClass("tm-label")
                                                .text("月销量"),
                                            $("<span>").addClass("tm-count")
                                                .text(data.monthlySales)
                                        )
                                ),
                            $("<li>").addClass("tm-ind-item tm-ind-sellCount canClick")
                                .append(
                                    $("<div>").addClass("tm-indcon")
                                        .append(
                                            $("<span>").addClass("tm-label")
                                                .text("累计销量"),
                                            $("<span>").addClass("tm-count")
                                                .text(data.cumulativeSales)
                                        )
                                ),
                            $("<li>").addClass("tm-ind-item tm-ind-sellCount canClick")
                                .append(
                                    $("<div>").addClass("tm-indcon")
                                        .append(
                                            $("<span>").addClass("tm-label")
                                                .text("累计评价"),
                                            $("<span>").addClass("tm-count")
                                                .text(data.cumulativeEvaluation)
                                        )
                                )
                        ),
                    $("<div>").addClass("clear"),
                    $("<dl>").addClass("iteminfo_parameter sys_item_specpara")
                        .append(
                            $("<dt>").addClass("theme-login")
                                .append(
                                    $("<div>").addClass("cart-title")
                                        .text("可选规格")
                                        .append(
                                            $("<span>").addClass("am-icon-angle-right")
                                        )
                                ),
                            $("<dd>").append(
                                $("<div>").addClass("theme-popover-mask"),
                                $("<div>").addClass("theme-popover")
                                    .append(
                                        $("<div>").addClass("theme-span"),
                                        $("<div>").addClass("theme-poptit")
                                            .append(
                                                $('<a href="javascript:;" title="关闭" >').addClass("close")
                                                    .text("x")
                                            ),
                                        $("<div>").addClass("theme-popbod dform")
                                            .append(
                                                $('<form name="loginform" action="" method="post">').addClass("theme-signin")
                                                    .append(
                                                        $("<div>").addClass("theme-signin-left")
                                                            .append(
                                                                $("<div>").addClass("theme-options")
                                                                    .append(
                                                                        $("<div>").addClass("cart-title")
                                                                            .text("口味"),
                                                                        $("<ul>").append(
                                                                            $("<li>").addClass("sku-line selected")
                                                                                .text("原味")
                                                                                .append(
                                                                                    $("<i>")
                                                                                ),
                                                                            $("<li>").addClass("sku-line")
                                                                                .text("奶油")
                                                                                .append(
                                                                                    $("<i>")
                                                                                ),
                                                                            $("<li>").addClass("sku-line")
                                                                                .text("炭烧")
                                                                                .append(
                                                                                    $("<i>")
                                                                                ),
                                                                            $("<li>").addClass("sku-line")
                                                                                .text("咸香")
                                                                                .append(
                                                                                    $("<i>")
                                                                                )
                                                                        )
                                                                    ),
                                                                $("<div>").addClass("theme-options")
                                                                    .append(
                                                                        $("<div>").addClass("cart-title")
                                                                            .text("包装"),
                                                                        $("<ul>").append(
                                                                            $("<li>").addClass("sku-line selected")
                                                                                .text("手袋单人份")
                                                                                .append(
                                                                                    $("<i>")
                                                                                ),
                                                                            $("<li>").addClass("sku-line")
                                                                                .text("礼盒双人份")
                                                                                .append(
                                                                                    $("<i>")
                                                                                ),
                                                                            $("<li>").addClass("sku-line")
                                                                                .text("全家福礼包")
                                                                                .append(
                                                                                    $("<i>")
                                                                                ),
                                                                        )
                                                                    ),
                                                                $("<div>").addClass("theme-options")
                                                                    .append(
                                                                        $("<div>").addClass("cart-title number")
                                                                            .text("数量"),
                                                                        $("<dd>").append(
                                                                            $('<input id="min"  name="" type="button" value="-">').addClass("am-btn am-btn-default"),
                                                                            $('<input id="text_box" name="" type="text" value="1" style="width:30px;" >'),
                                                                            $('<input id="add" class="am-btn am-btn-default" name="" type="button" value="+">'),
                                                                            $('<span id="Stock">').addClass("tb-hidden")
                                                                                .text("库存")
                                                                                .append(
                                                                                    $("<span>").addClass("stock")
                                                                                        .text(data.stock+"件")
                                                                                )
                                                                        )

                                                                    ),
                                                                $("<div>").addClass("clear"),
                                                                $("<div>").addClass("btn-op")
                                                                    .append(
                                                                        $("<div>").addClass("btn am-btn am-btn-warning")
                                                                            .text("确认"),
                                                                        $("<div>").addClass("btn close am-btn am-btn-warning")
                                                                            .text("取消")
                                                                    ),
                                                                $("<div>").addClass("theme-signin-right")
                                                                    .append(
                                                                        $("<div>").addClass("img-info")
                                                                            .append(
                                                                                $('<img src="../images/songzi.jpg" />')
                                                                            ),
                                                                        $("<div>").addClass("text-info")
                                                                            .append(
                                                                                $("<span>").addClass("J_Price price-now")
                                                                                    .text("￥"+data.promotiomPrice),
                                                                                $("<span>").addClass("tb-hidden")
                                                                                    .text("库存")
                                                                                    .append(
                                                                                        $("<span>").addClass("stock")
                                                                                            .text(data.stock+"件")
                                                                                    )
                                                                            )
                                                                    )

                                                            )
                                                    )

                                            )
                                    )

                            )
                        ),$("<div>").addClass("clear"),
                    $("<div>").addClass("shopPromotion gold")
                        .append(
                            $("<div>").addClass("hot")
                                .append(
                                    $("<dt>").addClass("tb-metatit")
                                        .text("店铺优惠"),
                                    $("<div>").addClass("gold-list")
                                        .append(
                                            $("<p>").text("购物满2件打8折，满3件7折")
                                                .append(
                                                    $("<span>").text("点击领券")
                                                        .append(
                                                            $("<i>").addClass("am-icon-sort-down")
                                                        )
                                                )
                                        )
                                ),
                            $("<div>").addClass("clear"),
                            $("<div>").addClass("coupon")
                                .append(
                                    $("<dt>").addClass("tb-metatit")
                                        .text("优惠券"),
                                    $("<div>").addClass("gold-list")
                                        .append(
                                            $("<ul>").append(
                                                $("<li>").text("125减5"),
                                                $("<li>").text("198减10"),
                                                $("<li>").text("298减20")
                                            )
                                        )
                                )
                        )
                )

        )

    }

    function showDetailsAll(data) {

        $("#details").append(
            $('<div class="J_Brand">').append(
                $('<div class="attr-list-hd tm-clear">').append(
                    $('<h4>').text("产品参数：")
                ),
                $('<div class="clear">'),
                $('<ul id="J_AttrUL">').append(
                    $('<li title="">').text("产品类型: "+data.productType),
                    $('<li title="">').text("原料产地: "+data.producingArea),
                    $('<li title="">').text("产地: "+data.area),
                    $('<li title="">').text("配料表: "+data.burdenSheet),
                    $('<li title="">').text("产品规格: "+data.productSpecifications),
                    $('<li title="">').text("保质期: "+data.shelfLife),
                    $('<li title="">').text("产品标准号: "+data.psCode),
                    $('<li title="">').text("生产许可证编号： "+data.plNumber),
                    $('<li title="">').text("储存方法： "+data.storages),
                    $('<li title="">').text("食用方法： "+data.eatMethod),
                ),
                $('<div class="clear">')
            ),
            $('<div class="details" >').append(
                $('<div class="attr-list-hd after-market-hd">').append(
                    $("<h4>").text("商品细节")
                ),
            )

        )

    }

    function showImgAll(data) {
        for (const da of data) {
            $('#details').append(
                $('<div class="twlistNews">').append(
                    $("<img>").attr("src",da.image)
                )
            )
        }
    }

    function showimg(data) {
        $('#imgs').append(
            $('<a>').attr("href","../images/"+data.image)
                .append(
                    $('<img alt="细节展示放大镜特效" rel="../images/01.jpg" class="jqzoom">').attr("src","../images/"+data.image)
                )

        )
    }
    /*获取URL中的id*/
    function getQueryString(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
        var r = window.location.search.substr(1).match(reg);
        if (r != null) {
            return unescape(r[2]);
        }
        return null;
    }


    function showSee(data) {
        for (const da of data) {
            $("#intr").append(
                $('<div class="p-img">').append(
                    $('<a  href="#">').append(
                        $('<img class="" >').attr("src","../images/"+da.image)
                    )
                ),
                $('<div class="p-name">').append(
                    $('<a href="#">').text(da.shopDiscount)
                ),$('<div class="p-price">').append(
                    $('<strong>').text("￥"+da.promotiomPrice)
                )
            )


        }

    }

});
