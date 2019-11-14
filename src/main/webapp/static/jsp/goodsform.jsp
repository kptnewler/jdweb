<%--
  Created by IntelliJ IDEA.
  User: 17173
  Date: 2019/11/14
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="utf-8" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>添加商品</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/layui/2.5.5/css/layui.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/order.css">
</head>
<body>

    <form>
        <div class="layui-form-item">
            <label class="layui-form-label">名称</label>
            <div class="layui-input-block">
                <input type="text" name="name" lay-verify="required" placeholder="请输入商品名" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">价格</label>
            <div class="layui-input-block">
                <input type="number" name="price" lay-verify="required|number" placeholder="请输入商品价格" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">链接</label>
            <div class="layui-input-block">
                <input type="text" name="goodsUrl" lay-verify="url" placeholder="请输入商品链接" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-input-block">
                <button type="submit" class="layui-btn" lay-submit="" lay-filter="goods_summit">立即提交</button>
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
        form.on('submit(goods_summit)', function(data){
            $.post("/goods/summit", $("form").serialize(), function(data){
                if (data.success === true) {
                    alert("提交成功")
                } else {
                    alert("提交失败")
                }
            }, 'json');
            return false;
        });
    });
</script>