<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, com.example.tp_file_attente_db.model.Client" %>
<html lang='fr'>
<head>
<meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
 <title>Liste des clients</title>
<script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 min-h-screen p-8">

<div class="max-w-7xl mx-auto">
 <!-- En-tête -->
 <div class="flex justify-between items-center mb-8">
  <marquee>"Sois patient!! la vie c'est molo molo!!!"</marquee>
  <a href="/clients/ajouter" class="bg-green-600 text-white px-4 py-2 rounded hover:bg-green-700">Ajouter a la fileattente</a>
</div>
<%
List<Client> clients =(List<Client>) request.getAttribute("clients");
 if (clients != null && !clients.isEmpty()) {
%>
<div class="bg-white shadow-md rounded-lg overflow-hidden">
  <table class="min-w-full leading-normal">
   <thead>
   <tr class="bg-gray-200 text-gray-600 uppercase text-sm leading-normal">
    <th class="py-3 px-6 text-left">nom</th>
   </tr>
   </thead>
   <tbody class="text-gray-600 text-sm">
      <%
       for (Client client : clients) {
      %>
   <tr class="border-b border-gray-200 hover:bg-gray-100">
          <td class="py-3 px-6 text-left"><%=client.getNom()%></td>
    </tr>
      <%
       }
      %>
  </tbody>
 </table>
</div>
<%
} else {
%>
<div class="bg-yellow-100 border-l-4 border-yellow-500 text-yellow-700 p-4" role="alert">
 <p class="font-bold">pas de file attente</p>
 <p>Aucun véhicule n'est actuellement enregistré dans le système.</p>
</div>
<%
 }
%>
</div>

</body>
</html>