layui.use('table', function(){
    var table = layui.table;

    //第一个实例
    table.render({
        elem: '#demo'
        ,height: 312
        ,url: '/demo/table/user/' //数据接口
        ,page: true //开启分页
        ,cols: [[ //表头
            {field: 'id', title: 'ID', width:80, sort: true, fixed: 'left', totalRowText: '合计'}
            ,{field: 'score', title: '用户', width: 80, sort: true}
            ,{field: 'username', title: '订单号', width:80}
            ,{field: 'sex', title: '货运单号', width:80, sort: true}
            ,{field: 'city', title: '价格', width:80}
            ,{field: 'experience', title: '订单状态', width: 80, sort: true}
            ,{field: 'sign', title: '收货信息', width: 177}
            ,{field: 'classify', title: '是否报单', width: 80, templet:'#switchTpl'}
            ,{field: 'wealth', title: '结算价', width: 135, sort: true}
        ]]
        ,page:true
    });

});