<!DOCTYPE html>
<html lang="en">

<head>
    <title>crud</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <?php include 'links.php' ?>
</head>

<body>

    <div class="container ">
        <div class="row d-flex justify-content-center">
            <div class="col-6">
                <form action="" method="POST">
                    <div class="form-horizontal">
                        <div class="form-group">
                            <lable class="control-label">name
                                <input type="text" name="user" id="name" value="" class="form-control">
                            </lable>
                        </div>
                        <div class="form-group">
                            <lable class="control-label">degree
                                <input type="text" name="degree" id="degree" value="" class="form-control">
                            </lable>
                        </div>
                        <div class="form-group">
                            <lable class="control-label">mobile
                                <input type="number" name="mobile" id="mobile" value="" class="form-control">
                            </lable>
                        </div>
                        <div class="form-group">
                            <lable class="control-label">email
                                <input type="email" name="email" id="email" value="" class="form-control">
                            </lable>
                        </div>
                        <div class="form-group">
                            <lable class="control-label">refer
                                <input type="text" name="refer" id="refer" value="" class="form-control">
                            </lable>
                        </div>
                        <div class="form-group ">
                            <lable class="control-label">Post
                                <input type="text" name="jobpost" value="" id="jobpost" class="form-control">
                            </lable>
                        </div>
                        <div class="text-center">
                            <input type="submit" name="submit" class="btn btn-primary"></input>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <a href="show.php" class="btn btn-sucess">show</a>
</body>

</html>
<?php
include('connection.php');
if (isset($_POST['submit'])) {
    $name = $_POST['user'];
    $degree = $_POST['degree'];
    $mobile = $_POST['mobile'];
    $email = $_POST['email'];
    $refer = $_POST['refer'];
    $post = $_POST['jobpost'];
    
    $insertQuery = " INSERT INTO profile (username,degree,mobile,email,refer,jobpost) 
    VALUES('$name','$degree','$mobile','$email','$refer','$post')";
    $res =  mysqli_query($con, $insertQuery);
    if ($res) {
        echo "sucessfully uploaded";
    } else {
        echo "unsucessful";
    }
}
?>