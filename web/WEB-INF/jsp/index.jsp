<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <table width="100%" border="1" style="border-collapse: collapse">
            <thead>
                <tr style="background-color:activeborder ">
                    <th>ID</th>
                    <th>Tên Sản Phẩm</th>
                    <th>Sô Lượng</th>
                    <th>Giá Bán</th>
                    <th>Danh Mục</th>
                    <th>Chức Năng</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${listSanPham}">
                    <tr>
                        <td align="center">${item.maSanPham}</td>
                        <td align="center">${item.tenSanPham}</td>
                        <td align="center">${item.soluongSanPham}</td>
                        <td align="center">${item.formatPrice()}</td>
                        <td align="center">${item.danhmucSanPham}</td>
                        <td align="center"><a href="${pageContext.request.contextPath}/home/sua-du-lieu/${item.maSanPham}.html">Sửa</a> | <a href="${pageContext.request.contextPath}/home/xoa-du-lieu/${item.maSanPham}.html">Xóa</a></td>
                    </tr>
                </c:forEach>

            </tbody>
        </table>
    </body>
</html>
