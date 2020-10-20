/*const INTOR_URL="http://localhost:8080/api";*/
const INTOR_URL="http://localhost:.8080/api/";
let detailUrl=INTOR_URL+"/introduction";
$(function () {
    let commodity=getQueryString("commodity_id");
    let params={
        commodity_id:commodity
    };
    $.get(detailUrl,params,function (result) {
        console.log(result.data)
        if(result.status===200){
            //显示商品的所有信息
            showinformation(result.data);
        }else {
            alert("系统繁忙!请稍后再试!!!");
        }
    });

    function  showinformation(data) {
        $("#detail").append(
            $("<div>")
                .addClass("tb-detail-hd")
                .append(
                $("<h1>").text(data.p_id)
            ),
            $("<div>").addClass("tb-detail-list")
                .text("价格")
                .append(
                    $("<li>").addClass("price iteminfo_price")
                        .append(
                            $("<dt>").text("促销价"),
                            $("<dd>").append(
                                $("<em>").text("￥"),
                                $("<b>")
                                    .addClass("sys_item_price")
                                    .text(data.original_price)
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
                                    .text(data.original_price)
                            )
                        ),
                    $("<div>").addCalss("clear")
                ),
            $("<dl>")
                .addClass("iteminfo_parameter freight")
                .append(
                    $("<dt>").text("配送至"),
                    $("<div>").addClass("iteminfo_freprice")
                        .append(
                            $("<div>").addCalss("am-form-content address")
                                .append(
                                    $("<select data-am-selected>").append(
                                        $("<option value='a'>").text(data.address),
                                        $("<option value='b'>").text(data.address)
                                    ),
                                    $("<select data-am-selected>").append(
                                        $("<option value='a'>").text(data.address),
                                        $("<option value='b'>").text(data.address)
                                    ),
                                    $("<select data-am-selected>").append(
                                        $("<option value='a'>").text(data.address),
                                        $("<option value='b'>").text(data.address)
                                    )
                                ),
                            $("<div>").addClass("pay-logis")
                                .text(data.address)
                                .append(
                                    $("<b>").text(data.freight+"元")
                                )
                        )

                ),
            $("<div>").addClass("clear"),
            $("<ul>").addClass("tm-ind-panel")
                .append(
                    $("<li>").addClass("tm-ind-item tm-ind-sellCount canClick")
                        .append(
                            $("<div>").addClass("tm-indcon")
                                .append(
                                    $("<span>").addClass("tm-label")
                                        .text("月销量"),
                                    $("<span>").addClass("tm-count")
                                        .text(data.monthly_sales)
                                )
                        ),
                    $("<li>").addClass("tm-ind-item tm-ind-sellCount canClick")
                        .append(
                            $("<div>").addClass("tm-indcon")
                                .append(
                                    $("<span>").addClass("tm-label")
                                        .text("累计销量"),
                                    $("<span>").addClass("tm-count")
                                        .text(data.cumulative_sales)
                                )
                        ),
                    $("<li>").addClass("tm-ind-item tm-ind-sellCount canClick")
                        .append(
                            $("<div>").addClass("tm-indcon")
                                .append(
                                    $("<span>").addClass("tm-label")
                                        .text("累计评价"),
                                    $("<span>").addClass("tm-count")
                                        .text(data.cumulative_evaluation)
                                )
                        )
                ),
            $("<div>").addClass("clear"),
            $("<div>").addClass("iteminfo_parameter sys_item_specpara")
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
                                                                    $('<input id="Stock">').addClass("tb-hidden")
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
                                                                        $("<img>").attr("src",data.image)
                                                                    ),
                                                                $("<div>").addCalss("text-info")
                                                                    .append(
                                                                        $("<span>").addClass("J_Price price-now")
                                                                            .text("￥"+data.promotiom_price),
                                                                        $("<span>").addClass("tb-hidden")
                                                                            .text("库存")
                                                                            .append(
                                                                                $("<span>").addClass("stock")
                                                                                    .text(data.stock+"件")
                                                                            )
                                                                    )
                                                            ),
                                                        $("<div>").addClass("clear"),
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

                                    )
                            )

                    )
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
});

