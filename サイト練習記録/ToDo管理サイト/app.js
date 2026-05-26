const input=document.querySelector("#taskInput");
const priority=document.querySelector("#priority");
const addBtn=document.querySelector("#addBtn");
const taskList=document.querySelector("#taskList");

let tasks=[];

addBtn.addEventListener("click",addTask);

function addTask(){
    const text=input.value.trim();
    if(text===""){
        alert("入力してください");
        return;
    }

tasks.push({
    text:text,
    priority:priority.value,
    done:false
});

input.value="";
render();
}

function render(){
    taskList.innerHTML="";
    tasks.forEach((task,index)=>{
        const li=document.createElement("li");
        if(task.done){
            li.classList.add("done");
}

const label=document.createElement("span");

label.textContent=task.text+" "+"★".repeat(task.priority);

const buttons=document.createElement("div");
buttons.className="buttons";

const complete=document.createElement("button");
complete.textContent="完了";
complete.addEventListener("click",()=>{
    task.done=!task.done;
    render();
});

const remove=document.createElement("button");
remove.textContent="削除";
remove.addEventListener("click",()=>{
    tasks.splice(index,1);
    render();
});

buttons.append(complete,remove);
li.append(label,buttons);

taskList.append(li);

});

}