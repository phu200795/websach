<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
                <div style="clear: both; width: 80%; margin:10px auto;"><a href="them-du-lieu.html" style="float: left;">Thêm mới</a></div>
<div style="clear: both;"></div>
<table>
     <thead>
            <tr>
                 <th>ID</th>
                 <th style="width: 200px;">Tên sản phẩm</th>
                 <th style="width: 200px;">Sô lượng</th>
                 <th style="width: 200px;">Giá bán</th>
                 <th style="width: 200px;">Danh Mục</th>
                 <th></th>
          </tr>
     </thead>
     <tbody>
        
          <c:forEach var="item" items="${listSanPham}">
          <tr>
               <td>${item.maSanPham}</td>
               <td>${item.tenSanPham} </td>
               <td>${item.soluongSanPham}</td>
               <td>${item.giaBan}</td>
               <td>${item.danhmucSanPham}</td>
               <td><a href="${pageContext.request.contextPath}/home/sua-du-lieu/${item.maSanPham}.html">Sửa</a> | <a href="${pageContext.request.contextPath}/home/xoa-du-lieu/${item.maSanPham}.html">Xóa</a></td>
          </tr>
          </c:forEach>
     </tbody>
</table>
    </body>
</html>
