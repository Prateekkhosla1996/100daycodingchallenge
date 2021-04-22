<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <?php include 'links.php' ?>
    <title>Document</title>
</head>

<body>
    <div class="main-div">
        <h1 class="text-center">All registered users</h1>
        <div class="table-responsive">
            <table>
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>degree</th>
                    <th>mobile</th>
                    <th>email</th>
                    <th>refer</th>
                    <th>post</th>
                    <th>operations</th>
                </tr>
                <tbody>
                    <?php
                    include 'connection.php';
                    $selectQuery = "SELECT * FROM profile";
                    $query = mysqli_query($con, $selectQuery);

                    $n = mysqli_num_rows($query);

                    while ($res = mysqli_fetch_array($query)) { ?>

                        <tr>
                        <td><?php echo $res['id'] ?></td>
                        <td><?php echo $res['username'] ?></td>
                        <td><?php echo $res['degree'] ?></td>
                        <td><?php echo $res['mobile'] ?></td>
                        <td><?php echo $res['email'] ?></td>
                        <td><?php echo $res['refer'] ?></td>
                        <td><?php echo $res['jobpost'] ?></td>
                        <td><a href="update.php?id=<?php echo $res['id'] ?>">edit </a> 
                        <a href="delete.php?id=<?php echo $res['id'] ?>"> delete</a></td>
                    </tr>
                    <?php } ?>
                    
                </tbody>
            </table>
        </div>
    </div>
</body>

</html>