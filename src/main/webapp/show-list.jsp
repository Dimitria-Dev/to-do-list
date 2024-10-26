
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>To Do List</title>
    <link rel="stylesheet" href="css/styles.css">
    <script src="js/script.js"></script>
</head>

<body>
<div class="center">
    <h2>Here is your list</h2>

    <ul>
        <c:forEach var="task" items="${tasks}">
            <li class="listItem">
               ${task.list_item}

                <form  action="remove" method="post" style="display: inline">
                    <input type="hidden" name="id" value="${task.id}">
                    <div id="rbutton">
                        <input class="removeButton" type="submit" value="remove">
                    </div>
                </form>
            </li>
        </c:forEach>
    </ul>
    <button> <a href="index.jsp">Add A Task</a> </button>
</div>

</body>
</html>
