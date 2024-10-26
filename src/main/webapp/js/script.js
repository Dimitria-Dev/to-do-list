
const add = document.getElementById("add")
add.addEventListener("click", addTask)

function addTask(){
    alert("Task added Successfully!")
}

const remove = document.getElementById("rbutton")
remove.addEventListener("click", removeTask)

function removeTask(){
    alert("Task removed!")
}