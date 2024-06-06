<?php

$name = $_POST['name'];
$email = $_POST['email'];
$qrCode = $_POST['qrCode'];


$servername = "localhost";
$username = "root";
$password = "";
$dbname = "practice_db";

$conn = new mysqli($servername, $username, $password, $dbname);


if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}


if (!empty($qrCode)) {
    list($qrName, $qrPassword) = explode(':', $qrCode);


    $sql = "SELECT * FROM users WHERE name = '$qrName' AND password = '$qrPassword'";
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        echo "Login successful via QR code";
    } else {
        echo "Invalid QR code";
    }
} else {
    
    $sql = "INSERT INTO users (name, email) VALUES ('$name', '$email')";

    if ($conn->query($sql) === TRUE) {
        echo "New record created successfully";
    } else {
        echo "Error: " . $sql . "<br>" . $conn->error;
    }
}

$conn->close();
?>