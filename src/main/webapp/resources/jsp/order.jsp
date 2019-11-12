<%--
  Created by IntelliJ IDEA.
  User: 17173
  Date: 2019/11/12
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单详情</title>
    <link rel="stylesheet" href="webjars/layui/2.5.5/css/layui.css">
</head>
<body>
    <table class="layui-hide" id="test"></table>
</body>
</html>
<script src="webjars/layui/2.5.5/layui.js"></script>

<script type="text/html" id="checkboxTpl">
    <!-- 这里的 checked 的状态只是演示 -->
    <input type="checkbox" name="registration" value="{{d.id}}" title="报单">
</script>
<script src="webjars/jquery/3.4.1/jquery.min.js"></script>
