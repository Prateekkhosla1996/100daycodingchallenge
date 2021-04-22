<?php
$username = "root";
$password = "";
$port = 3308;
$server = 'localhost';
$crud = 'crud';
$con = mysqli_connect($server, $username, $password, $crud, $port);


if ($con) {
    echo "connection sucessful";
} else {
    die("connection failed") . mysqli_connect_error();
}
