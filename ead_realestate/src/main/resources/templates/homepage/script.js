var selectField = document.getElementById("selectField");
var selectField1 = document.getElementById("selectField1");
var selectField2 = document.getElementById("selectField2");

var selectText = document.getElementById("selectText");
var selectText1 = document.getElementById("selectText1");
var selectText2 = document.getElementById("selectText2");

var options = document.getElementsByClassName("options");
var options1 = document.getElementsByClassName("options1");
var options2 = document.getElementsByClassName("options2");

var list = document.getElementById("list");
var list1 = document.getElementById("list1");
var list2 = document.getElementById("list2");

var arrowIcon = document.getElementById("arrowIcon");
var arrowIcon1 = document.getElementById("arrowIcon1");
var arrowIcon2 = document.getElementById("arrowIcon2");

selectField.onclick = function(){
    list.classList.toggle("hide");
    arrowIcon.classList.toggle("rotate");
}

selectField1.onclick = function(){
    list1.classList.toggle("hide");
    arrowIcon1.classList.toggle("rotate");
}

selectField2.onclick = function(){
    list2.classList.toggle("hide");
    arrowIcon2.classList.toggle("rotate");
}

for(option of options){
    option.onclick = function(){
        selectText.innerHTML = this.textContent;
        list.classList.toggle("hide");
        arrowIcon.classList.toggle("rotate");
    } 
}

for(option of options1){
    option.onclick = function(){
        selectText1.innerHTML = this.textContent;
        list1.classList.toggle("hide");
        arrowIcon1.classList.toggle("rotate");
    } 
}

for(option of options2){
    option.onclick = function(){
        selectText2.innerHTML = this.textContent;
        list2.classList.toggle("hide");
        arrowIcon2.classList.toggle("rotate");
    } 
}