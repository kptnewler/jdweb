<%--
  Created by IntelliJ IDEA.
  User: 17173
  Date: 2019/11/14
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="utf-8" %>
<html>
<head>
    <title>添加订单</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/layui/2.5.5/css/layui.css">
</head>
<body>
    <form>
        <div class="layui-form-item">
            <label class="layui-form-label">订单号</label>
            <div class="layui-input-block">
                <input type="text" name="id" lay-verify="required" placeholder="请输入订单号" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">货运单号</label>
            <div class="layui-input-block">
                <input type="text" name="carriageId" lay-verify="required" placeholder="请输入货运单号" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">提交时间</label>
            <div class="layui-input-block">
                <input type="text" name="date" lay-verify="required" placeholder="请输入提交时间" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">总价格</label>
            <div class="layui-input-block">
                <input type="number" name="price" lay-verify="required" placeholder="请输入总价格" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">收货号码</label>
            <div class="layui-input-block">
                <input type="tel" name="receiverPhone" lay-verify="phone" placeholder="请输入收货号码" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">收货地址</label>
            <div class="layui-input-block">
                <input type="text" name="receiverAddress" lay-verify="required" placeholder="请输入收货地址" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">goodsNum</label>
            <div class="layui-input-block">
                <input type="number" name="goodsNum" lay-verify="required" placeholder="请输入商品数量" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">goodsNum</label>
            <div class="layui-input-block">
                <input type="text" name="goodsID" lay-verify="required" placeholder="请输入商品编号" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-input-block">
                <button type="submit" class="layui-btn" lay-submit="order_summit" lay-filter="demo1">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
</body>

</html>
<script src="${pageContext.request.contextPath}/webjars/layui/2.5.5/layui.js"></script>
<script src="${pageContext.request.contextPath}/webjars/jquery/3.4.1/jquery.min.js"></script>
<script>
    layui.use('form', function(){
        var form = layui.form;

        //监听提交
        form.on('submit(order_summit)', function(data){
            layer.msg(JSON.stringify(data.field));
            $.post("")
            return false;
        });
    });
</script>