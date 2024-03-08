CREATE TABLE Students (
    student_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    age INT,
    email VARCHAR(100)
);
CREATE TABLE Courses (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(100),
    instructor VARCHAR(100),
    department VARCHAR(50),
    credits INT
);
INSERT INTO Students (student_id, first_name, last_name, age, email) VALUES
(1, 'John', 'Doe', 20, 'john.doe@example.com'),
(2, 'Jane', 'Smith', 22, 'jane.smith@example.com'),
(3, 'Michael', 'Johnson', 21, 'michael.johnson@example.com'),
(4, 'Emily', 'Brown', 19, 'emily.brown@example.com'),
(5, 'David', 'Wilson', 23, 'david.wilson@example.com');

INSERT INTO Courses (course_id, course_name, instructor, department, credits) VALUES
(101, 'Introduction to Computer Science', 'Dr. Smith', 'Computer Science', 3),
(102, 'English Composition', 'Prof. Johnson', 'English', 4),
(103, 'Calculus I', 'Dr. Williams', 'Mathematics', 4),
(104, 'History of Art', 'Dr. Davis', 'Art History', 3),
(105, 'Introduction to Psychology', 'Prof. Brown', 'Psychology', 3);


DELETE FROM Students WHERE student_id = 12345;
