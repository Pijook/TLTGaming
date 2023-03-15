const siteVersion = async() => {
    const response = await fetch("http://localhost:8082/backend/version/get");
    return await response.json();
}

function httpGetAsync(theUrl, callback)
{
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.onreadystatechange = function() {
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200)
            callback(xmlHttp.responseText);
    }
    xmlHttp.open("GET", theUrl, true); // true for asynchronous
    xmlHttp.send(null);
}

siteVersion().then(r => {
    document.getElementById("site-version").innerText = r;
});

httpGetAsync("http://localhost:8082/backend/version/get", (r) )