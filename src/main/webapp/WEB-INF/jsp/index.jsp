<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Test 2</title>
    <style>
        table {
            width: 100%;
            border: 3px solid black;
            font-family: Times New Roman, serif;

        }

        h2{
            color: black;
            font-size: 50px;
            font-family: cursive;

        }
        th{
            background-color: black;
        }
        td{
            background-color: white;
            font-size: large;
        }

        td, th {
            color:green;
            border: 2px solid black;
            padding: 7px;
            text-align: left;

        }




    </style>

</head>
<body style="background:#ffcccb">

<h2 align="center">Deadly Viruses</h2>




<table>
    <tr>

        <th>Id</th>
        <th>Name</th>
        <th>Description</th>
        <th>Symptoms</th>
        <th>Duration</th>
        <th>Mortality Rate %</th>
        <th>Image</th>
    </tr>
    <jsp:useBean id="viruseslist" scope="request" type="java.util.List"/>
    <c:forEach var = "listitem" items = "${viruseslist}">
        <tr>


            <td>${listitem.id}</td>
            <td>${listitem.name}</td>
            <td>${listitem.description}</td>
            <td>${listitem.symptoms}</td>
            <td>${listitem.duration}</td>
            <td>${listitem.mortalityrate}</td>
            <td><img src=${listitem.image} style="width:100px;height:100px;"></td>

        </tr>
    </c:forEach>
</table>

</body>
</html>
