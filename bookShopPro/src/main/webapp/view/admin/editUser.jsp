<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/12/2
  Time: 18:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/include/Scripts/layui/css/layui.css"  media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/include/Scripts/css/public.css"  media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
    <style type="text/css">
        .layui-form-label{
            display: inline;!important;
        }
        .layui-input-inline{
            height: 37px;!important;
        }
    </style>
</head>
<body>
<form id="webform" class="layui-form layui-form-pane" method="post">
    <input type="hidden" id="txtId" name="userId" value="${param.id}" />
    <input type="hidden"  name="infoId" value="" />
     <table class="layui-table">
         <tr>
             <td>
                 <label class="layui-form-label">姓名</label>
                 <input type="text" name="userName" class="layui-input-inline" autocomplete="off" required lay-verify="required" placeholder="姓名"/>
             </td>
             <td>
                 <label class="layui-form-label">性别</label>
                 <input type="text" name="sex" class="layui-input-inline" autocomplete="off" required lay-verify="required" placeholder="性别"/>
             </td>
         </tr>
         <tr>
             <td>
                 <label class="layui-form-label">出生日期</label>
                 <input type="text" class="layui-input-inline" id="txtBirthday" name="birthday" autocomplete="off" required lay-verify="required" placeholder="出生日期"/>
             </td>
             <td>
                 <label class="layui-form-label">联系方式</label>
                 <input type="text"  class="layui-input-inline" autocomplete="off" required lay-verify="phone|required" placeholder="联系方式"/>
             </td>
         </tr>
         <tr>
             <td>
                 <label class="layui-form-label">登录名</label>
                 <input type="text" name="loginName" class="layui-input-inline" autocomplete="off" required lay-verify="required" placeholder="登录名"/>
             </td>
             <td>
                 <label class="layui-form-label">密码</label>
                 <input type="text" name="password" class="layui-input-inline" autocomplete="off" required lay-verify="required" placeholder="密码"/>
             </td>
         </tr>
     </table>
    <div class="layui-row" style="text-align: center">
        <button type="button" class="layui-btn" id="btnSave" lay-submit="" lay-filter="btnSave"><i class="layui-icon layui-icon-ok">保存</i> </button>
        <button type="button" class="layui-btn" id="btnClose"><i class="layui-icon layui-icon-close">返回</i> </button>
    </div>
</form>
</body>
<script src="${pageContext.request.contextPath}/include/Scripts/layui/layui.js" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/include/Scripts/Common.js" charset="utf-8"></script>

<script type="text/javascript">
    layui.use(['form','element','layer','laydate'], function(){
        var $=layui.$;
        var form=layui.form;
        var layer=layui.layer;
        var laydate=layui.laydate;
        var index = parent.layer.getFrameIndex(window.name);
        laydate.render({
            elem: '#txtBirthday' //指定元素
        });
        if('${param.id}'!=''){
            loadInfo();
        }
        function loadInfo(){
            ajaxPost('${pageContext.request.contextPath}/user/getBaseInfo2?id=${param.id}',{},function (d) {
                formAssign(d);
            })
        }
        form.on('click(btnSave)',function () {
            formPost('${pageContext.request.contextPath}/user/addUser',function (d) {
                if(d.code){
                    layer.msg("保存成功",500,function () {
                        closeLayerWindow();
                    })
                }else{
                    layer.alert(d.msg);
                }
            })
        })
    })
</script>
</html>
