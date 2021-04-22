<?php 
    include( 'connection.php');
    $id = $_GET['id'];
    $deleteQuery = "DELETE FROM profile WHERE id=$id ";

    $query =  mysqli_query($con,$deleteQuery);

    header('location:show.php');

?>