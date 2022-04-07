function changeTool(toolClicked) {
    document.getElementById('open').className = "";
    document.getElementById('save').className = "";
    document.getElementById('brush').className = "";
    document.getElementById('line').className = "";
    document.getElementById('rectangle').className = "";
    document.getElementById('circle').className = "";
    document.getElementById('ellipse').className = "";
    document.getElementById('polygon').className = "";
    document.getElementById(toolClicked).className = 'selected';
    currentTool = toolClicked;
}
