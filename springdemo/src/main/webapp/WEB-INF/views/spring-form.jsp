<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The Employee Details</h3>
        <form:form method="POST" action="/spring-demo/form" modelAttribute="command">
             <table>
                <tr>
                    <td><label path="countries">countries</label></td>
                    <td><select id="countries" name="countries" multiple>
                           <option value="US">United Stated</option>
                           <option value="US">United Stated</option>
                           <option value="SG">Singapore</option>
                           <option value="MY">Malaysia</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>