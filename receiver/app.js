var static = require('node-static');

var file = new static.Server();

require('http').createServer(function(request, response) {
        request.addListener('end', function() {
            console.log("GET " + request.url);
            file.serve(request, response);
        }).resume();
    }).listen(80);
