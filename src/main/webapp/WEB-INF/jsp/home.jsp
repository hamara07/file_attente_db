
<html>
<head>
    <title>Liste des clients</title>
</head>
<body>
    <marquee><h1>"Sois patient!! la vie c'est molo molo!!!"</h1></marquee>
    <h1>Clients</h1>
    <ul>
        <c:forEach var="client" items="${clients}">
            <li>${client.nom}</li>
        </c:forEach>
    </ul>
</body>
</html>