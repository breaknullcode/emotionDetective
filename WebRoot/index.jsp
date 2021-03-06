<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">


<title>CSS3漂亮表格</title>
<style type="text/css">
#Demo, body {
	background-color: #000;
}
#Main {
	width: 600px;
	text-align: center;
	margin: 0 auto;
}
table {
	width: 600px;
	border-collapse: collapse;
	text-align: left;
	margin: 10px 5px 5px 10px;
	cursor: default;
	border: 1px solid #ccc;
	margin-top: 20px;
	box-shadow: 0px 0px 10px rgba(0,255,255,0.75);
	border: 1px solid rgba(127,255,255,0.75);
	-webkit-box-shadow: 0px 0px 8px rgba(0,255,255,0.75);
	-moz-box-shadow: 0px 0px 8px rgba(0,255,255,0.75);
	box-shadow: 0px 0px 8px rgba(0,255,255,0.75);
}
.tbTitle>th {
	font-weight: 300;
	text-align: center;
	padding: 10px 0 10px 0;
	font: 15px "微软雅黑", Arial, Helvetica, sans-serif;
	background-color: rgba(0,93,93,0.8);
	color: #efefef;
	text-shadow: 0px 0px 20px rgba(127,255,255,1);
}
th, td {
	border: 1px solid rgba(127,255,255,0.55);
}
.tbContext:hover {
	background-color: rgba(0,99,99,0.9) !important;
}
td, td>a {
	font: 13px "微软雅黑", Arial, Helvetica, sans-serif;
	text-align: center;
	padding: 6px 0 6px 0;
	color: rgba(127,255,255,0.75);
	text-shadow: 0px 0px 20px rgba(0,255,255,0.75);/*-webkit-filter: drop-shadow(0px 0px 20px rgba(0,255,255,0.95));
	-moz-filter: drop-shadow(0px 0px 20px rgba(0,255,255,0.95));
	-o-filter: drop-shadow(0px 0px 20px rgba(0,255,255,0.95));
	-ms-filter: drop-shadow(0px 0px 20px rgba(0,255,255,0.95));
	filter: drop-shadow(0px 0px 20px rgba(0,255,255,0.95));*/
}
.tbContext:nth-child(2n+1) {
	background-color: rgba(0,127,127,0.1);
}
</style>
</head>

<body>
<div id="Demo">
  <div id="Main">
    <table>
      <tr class="tbTitle">
        <th>排名</th>
        <th>名称</th>
        <th>称号</th>
        <th>次数</th>
        <th>列5</th>
        <th>列6</th>
      </tr>
      <tr class="tbContext">
        <td>数据1</td>
        <td>数据2</td>
        <td>数据3</td>
        <td>数据4</td>
        <td>数据5</td>
        <td>数据6</td>
      </tr>
      <tr class="tbContext">
        <td>数据1</td>
        <td>数据2</td>
        <td>数据3</td>
        <td>数据4</td>
        <td>数据5</td>
        <td>数据6</td>
      </tr>
      <tr class="tbContext">
        <td>数据1</td>
        <td>数据2</td>
        <td>数据3</td>
        <td>数据4</td>
        <td>数据5</td>
        <td>数据6</td>
      </tr>
      <tr class="tbContext">
        <td>数据1</td>
        <td>数据2</td>
        <td>数据3</td>
        <td>数据4</td>
        <td>数据5</td>
        <td>数据6</td>
      </tr>
      <tr class="tbContext">
        <td>数据1</td>
        <td>数据2</td>
        <td>数据3</td>
        <td>数据4</td>
        <td>数据5</td>
        <td>数据6</td>
      </tr>
      <tr class="tbContext">
        <td>数据1</td>
        <td>数据2</td>
        <td>数据3</td>
        <td>数据4</td>
        <td>数据5</td>
        <td>数据6</td>
      </tr>
      <tr class="tbContext">
        <td>数据1</td>
        <td>数据2</td>
        <td>数据3</td>
        <td>数据4</td>
        <td>数据5</td>
        <td>数据6</td>
      </tr>
      <tr class="tbContext">
        <td>数据1</td>
        <td>数据2</td>
        <td>数据3</td>
        <td>数据4</td>
        <td>数据5</td>
        <td>数据6</td>
      </tr>
      <tr class="tbContext">
        <td>数据1</td>
        <td>数据2</td>
        <td>数据3</td>
        <td>数据4</td>
        <td>数据5</td>
        <td>数据6</td>
      </tr>
    </table>
  </div>
</div>
</body>
<script type="text/javascript" src="http://www.pengyaou.com/jquery-1.4.min.js"></script>

<script type="text/javascript">
var snowHandler={
	mSizeMode:0,
	mSpeed:500,
	initialize:function(){
		var snowCanvas=$("<canvas></canvas>");
	}
}
</script>
</html>
