
<html>
<head>
    <title>Accueil</title>
</head>
<body>
    <h1>Ajouter un client</h1>

    <form action="${pageContext.request.contextPath}/clients/ajouter" method="post">
        <input type="text" name="nom" placeholder="Nom du client" required />
        <button type="submit">Ajouter</button>
    </form>

    <c:if test="${not empty message}">
        <p>${message}</p>
    </c:if>

    <h2>Liste des clients</h2>
    <ul>
        <c:forEach var="c" items="${clients}">
            <li>${c.nom}</li>
        </c:forEach>
    </ul>
</body>
</html>