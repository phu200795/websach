<%-- 
    Document   : TrangChu
    Created on : Dec 15, 2017, 8:54:44 PM
    Author     : phukg
--%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thêm Sản Phẩm</title>
    </head>
    <body>
  <h2>Thêm Sản Phẩm</h2>
<spring:form action="${pageContext.request.contextPath}/home/luu-du-lieu.html" commandName="sanPham" method="post">
     
     
    
     Tên <spring:input path="tenSanPham" size="30"/><br>
     GIÁ <spring:input path="giaBan" size="30"/><br>
     SỐ LƯỢNG <spring:input path="soluongSanPham" size="30"/><br>
     DANH MỤC <select name="danhmucSanPham">
         <option value="NOKIA">NOKIA</option>
         <option value="APPLE">APPLE</option>
         <option value="SAMSUM">SAMSUNG</option>
         <option value="HTC">HTC</option>
               </select>
     <input type="submit" class="btn btn-default" value="Lưu" /><br>
</spring:form>
    </body>
</html>
