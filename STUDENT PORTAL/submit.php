<?php
// Retrieve form data
$name = $_POST['name'];
$email = $_POST['email'];
$qrCode = $_POST['qrCode'];

// Database connection
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "practice_db";

$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Handle QR code submission
if (!empty($qrCode)) {
    // Decode the QR code data (assuming it contains the student name and password separated by a colon)
    list($qrName, $qrPassword) = explode(':', $qrCode);

    // Check if the student name and password are valid
    $sql = "SELECT * FROM users WHERE name = '$qrName' AND password = '$qrPassword'";
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        echo "Login successful via QR code";
        // Redirect to the student portal or perform additional actions
    } else {
        echo "Invalid QR code";
    }
} else {
    // Insert data into database for regular form submission
    $sql = "INSERT INTO users (name, email) VALUES ('$name', '$email')";

    if ($conn->query($sql) === TRUE) {
        echo "New record created successfully";
    } else {
        echo "Error: " . $sql . "<br>" . $conn->error;
    }
}

$conn->close();
?>