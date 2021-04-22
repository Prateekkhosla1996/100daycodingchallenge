<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>

    <form action="" method="POST">
        <input type="text" name="user" id="">
        <input type="submit" name="submit" value="submit">
    </form>
</body>

</html>
<?php
include 'connection.php';
if (isset($_POST['submit'])) {
    $user = $_POST['user'];
    $query = "INSERT INTO users(fname) VALUES('$user')";
    $res = mysqli_query($con, $queryres);
    if ($res) {
        echo "sucess";
    }
}

?>