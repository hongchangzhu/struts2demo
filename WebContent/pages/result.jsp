<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=path%>/js/jquery-1.8.0.min.js"></script>
</head>
<body>
	世界，你好.
	<br>
</body>

<script type="text/javascript">
	$(document).ready(function() {
		$.ajax({
			type : "post",
			url : "userJson.action?name=tom",
			dataType : "json",
			success : function(data) {
				alert(data.data.name);
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				alert(errorThrown);
			}
		});
	});

	var json = {
		"action" : "query",
		"data" : [
				{
					"appActionMode" : 0,
					"appClientId" : 0,
					"appClientSchema" : null,
					"appClientVersion" : null,
					"appDesc" : null,
					"appId" : 900001,
					"appLogo" : "http:\/\/192.168.22.142\/mcloud\/download.action?filename=900001.png&type=1&t=",
					"appName" : "签到",
					"appType" : 1,
					"deleted" : true,
					"detailURL" : null,
					"downloadURL" : null,
					"packageName" : null,
					"pid" : null,
					"time" : 0,
					"versionUpdateTime" : null,
					"webUrl" : null
				},
				{
					"appActionMode" : 0,
					"appClientId" : 0,
					"appClientSchema" : null,
					"appClientVersion" : null,
					"appDesc" : null,
					"appId" : 900002,
					"appLogo" : "http:\/\/192.168.22.142\/mcloud\/download.action?filename=900002.png&type=1&t=",
					"appName" : "任务",
					"appType" : 1,
					"deleted" : true,
					"detailURL" : null,
					"downloadURL" : null,
					"packageName" : null,
					"pid" : null,
					"time" : 0,
					"versionUpdateTime" : null,
					"webUrl" : null
				},
				{
					"appActionMode" : 0,
					"appClientId" : 0,
					"appClientSchema" : null,
					"appClientVersion" : null,
					"appDesc" : null,
					"appId" : 900003,
					"appLogo" : "http:\/\/192.168.22.142\/mcloud\/download.action?filename=900003.png&type=1&t=",
					"appName" : "我的文件",
					"appType" : 1,
					"deleted" : true,
					"detailURL" : null,
					"downloadURL" : null,
					"packageName" : null,
					"pid" : null,
					"time" : 0,
					"versionUpdateTime" : null,
					"webUrl" : null
				},
				{
					"appActionMode" : 0,
					"appClientId" : 0,
					"appClientSchema" : null,
					"appClientVersion" : null,
					"appDesc" : null,
					"appId" : 900004,
					"appLogo" : "http:\/\/192.168.22.142\/mcloud\/download.action?filename=900004.png&type=1&t=",
					"appName" : "部落",
					"appType" : 1,
					"deleted" : true,
					"detailURL" : null,
					"downloadURL" : null,
					"packageName" : null,
					"pid" : null,
					"time" : 0,
					"versionUpdateTime" : null,
					"webUrl" : null
				},
				{
					"appActionMode" : 2,
					"appClientId" : 1000100,
					"appClientSchema" : "http:\/\/kdtest.kdweibo.cn\/clout\/",
					"appClientVersion" : null,
					"appDesc" : "一呼百应，会议、活动即呼即应！\n您的呼声从发起、应答到通知形成完美的闭环体验，使你的人品持续充电中!",
					"appId" : 10001,
					"appLogo" : "http:\/\/192.168.22.142\/mcloud\/download.action?filename=10001.png&type=1&t=",
					"appName" : "一呼百应",
					"appType" : 4,
					"deleted" : false,
					"detailURL" : null,
					"downloadURL" : "http:\/\/kdtest.kdweibo.cn\/clout\/",
					"packageName" : null,
					"pid" : null,
					"time" : 0,
					"versionUpdateTime" : null,
					"webUrl" : "http:\/\/kdtest.kdweibo.cn\/clout\/"
				},
				{
					"appActionMode" : 2,
					"appClientId" : 1010100,
					"appClientSchema" : "http:\/\/imtest.kdweibo.cn\/pubacc\/public\/newbie\/club.html",
					"appClientVersion" : null,
					"appDesc" : "",
					"appId" : 10101,
					"appLogo" : "http:\/\/192.168.22.142\/mcloud\/download.action?filename=10101.png&type=1&t=",
					"appName" : "金蝶论坛",
					"appType" : 4,
					"deleted" : false,
					"detailURL" : null,
					"downloadURL" : "http:\/\/imtest.kdweibo.cn\/pubacc\/public\/newbie\/club.html",
					"packageName" : null,
					"pid" : null,
					"time" : 0,
					"versionUpdateTime" : null,
					"webUrl" : "http:\/\/imtest.kdweibo.cn\/pubacc\/public\/newbie\/club.html"
				},
				{
					"appActionMode" : 2,
					"appClientId" : 0,
					"appClientSchema" : null,
					"appClientVersion" : null,
					"appDesc" : "测试",
					"appId" : 0,
					"appLogo" : "http:\/\/192.168.204.190\/pubacc\/public\/data\/icon\/UfmKjJMN.png",
					"appName" : "一呼百应测试",
					"appType" : 5,
					"deleted" : true,
					"detailURL" : null,
					"downloadURL" : null,
					"packageName" : null,
					"pid" : "XT-a1fbb469-9d00-4fd2-955e-8b00a5dc47b7",
					"time" : 1426227622084,
					"versionUpdateTime" : null,
					"webUrl" : null
				}, {
					"appActionMode" : 2,
					"appClientId" : 0,
					"appClientSchema" : null,
					"appClientVersion" : null,
					"appDesc" : "",
					"appId" : 0,
					"appLogo" : "",
					"appName" : "请假",
					"appType" : 5,
					"deleted" : true,
					"detailURL" : null,
					"downloadURL" : null,
					"packageName" : null,
					"pid" : "XT-52148865-f0a2-4432-86d4-18406fdd3ed7",
					"time" : 1426849924624,
					"versionUpdateTime" : null,
					"webUrl" : null
				} ],
		"error" : null,
		"errorCode" : 0,
		"success" : true
	};
</script>
</html>