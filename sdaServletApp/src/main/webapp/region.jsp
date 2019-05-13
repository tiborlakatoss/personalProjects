<%@ page import="com.sda.service.RegionService"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<%
		System.out.println("Entering region.jsp");
	%>

	<%!RegionService regionService = new RegionService();%>

	<%
		System.out.println("Calling regionService.getAllRegions()");
	%>
	The first region is:
	<%=regionService.getAllRegions().get(0).getRegionName()%>


	<br />
	<br />
	<form method="post" action="region.jsp">
		<input type="text" name="regionName"> <input type="submit"
			value="Save">
	</form>


	<%
		if (request.getParameter("regionName") != null)
			regionService.saveRegion(request.getParameter("regionName"));
	%>

	<%
		System.out.println("Exiting region.jsp");
	%>


	<!--  Aici afisam un tabel cu lista de regiuni -->
	<%
		
	%>
	<table border=1px>
		<tr>
			<td>RegionId</td>
			<td>RegionName</td>
		</tr>
		<c:forEach items="${regionList}" var="listItem">
			<td>${listItem.getRegionId()}</td>
			<td>${listItem.getRegionName()}</td>
		</c:forEach>
	</table>

</body>
</html>
