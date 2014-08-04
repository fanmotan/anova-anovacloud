<%@ page import="java.util.List" %>
<%@ page import="com.anova.anovacloud.shared.dto.MatterDto" %>
<%
    List<MatterDto> matterList = (List<MatterDto>)request.getAttribute("matters");
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Example Servlet</title>
    </head>
    <body>
        <h3>List of Matters</h3>
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Customer</th>
                    <th>Model</th>
                </tr>
            </thead>
            <tbody>
                <% for (MatterDto matter : matterList) { %>
                    <tr>
                        <td><%= matter.getId() %></td>
                        <td><%= matter.getCustomer().getName() %></td>
                        <td><%= matter.getModel() %></td>
                    </tr>
                <% } %>
            </tbody>
        </table>
    </body>
</html>
