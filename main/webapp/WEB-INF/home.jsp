<%--
  Created by IntelliJ IDEA.
  User: zar
  Date: 2017/11/2
  Time: 上午9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery-3.2.1.js"></script>
    <script type="text/javascript">
        function allStudent() {
            $.ajax({
                url: "/allStudent",
                success: function (result) {
                    console.log(result)
                }
            })
        }
        allStudent();
    </script>
</head>
<body>
<h1>主页</h1>
</body>
</html>
