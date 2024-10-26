<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>To Do List</title>
    <link rel="stylesheet" href="css/styles.css">
    <script src="js/script.js"></script>
</head>


<body>
<div class="center">
    <h2>Add A Task</h2>
    <p>Please enter a task you would like to add to your list below</p>

    <form name="userList" action="add-task" method="post">
        <input type="text" name="task" placeholder="Enter a task">
        <input id="add" type="submit" value="add task" class="addButton">
    </form>

    <button class="viewList"> <a href="/display-list"> View Task List</a> </button>

</div>
</body>
</html>