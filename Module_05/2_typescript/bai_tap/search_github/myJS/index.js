function showResult() {
    // https://api.github.com/search/repositories?q=angular
    let url = document.getElementById("keyword").value;
    console.log(url);
    let promise = new Promise(function (resolve, reject) {
        let xhttp = new XMLHttpRequest();
        xhttp.open("GET", url);
        xhttp.onload = function () {
            if (xhttp.status === 200) {
                resolve(JSON.parse(xhttp.responseText));
            }
            else {
                reject(Error(xhttp.statusText));
            }
        };
        xhttp.onerror = function () {
            reject(Error('Error fetching data.')); // error occurred, reject the  Promise
        };
        xhttp.send();
    });
    promise.then(function (data) {
        let b = data;
        let output = "Total: " + b.items.length + "\n\n";
        b.items.forEach(index => {
            output += "id: " + index.id + "\nnode_id:" + index.node_id + "\nname: " + index.name + "\nfull_name: "
                + index.full_name + "\nprivate: " + index.private + "\nurl: " + index.url + "\nhtml_url: " + index.html_url + "\n\n";
        });
        document.getElementById("show").innerHTML = output;
    }, function (data) {
        document.getElementById("show").innerHTML = data + "";
    });
}
