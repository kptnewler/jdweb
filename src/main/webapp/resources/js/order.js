layui.use('table', function(){
    var table = layui.table;
    //第一个实例
    table.render({
        elem: '#demo'
        ,height: 312
        ,url: '/demo/table/user/' //数据接口
        ,page: true //开启分页
        ,cols: [[ //表头
            {field: 'id', title: '订单号', width:80, sort: true, fixed: 'left', totalRowText: '合计'}
            ,{field: 'uid', title: '用户', width: 80, sort: true}
            ,{field: 'carriageId', title: '货运单号', width:80, sort: true}
            ,{field: 'price', title: '价格', width:80}
            ,{field: 'payWay', title: '支付方式', width:80}
            ,{field: 'status', title: '订单状态', width: 80, sort: true}
            ,{field: 'goodsInfo', title: '商品信息', width: 80, sort: true}
            ,{field: 'receiverInfo', title: '收货信息', width: 177}
            ,{field: 'num', title: '商品数量', width: 177}
            ,{field: 'registration', title: '是否报单', width: 80, templet:'#checkboxTpl'}
            ,{field: 'settlementPrice', title: '结算价', width: 135, sort: true}
        ]]
    });

});

