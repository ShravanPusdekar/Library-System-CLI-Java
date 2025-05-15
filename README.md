![image](https://github.com/user-attachments/assets/c26a0fb6-1451-492e-85b8-8210d2f0f3bc)# 📚 Java Library Management System

A **console-based Java application** that simulates a basic Library Management System. Designed with object-oriented principles, this project handles book inventory operations such as adding, viewing, issuing, returning, and searching for books using an interactive menu-driven interface.

---

## 🚀 Features

- 🔍 Add, view, and manage a dynamic collection of books
- 📖 Issue and return books with status tracking
- 🔎 Search for books by their unique ID
- ❌ Handles invalid operations with informative messages
- 🧪 Easily extendable for user management or file storage

---

## 🛠️ Tech Stack

| Technology | Usage                     |
|------------|---------------------------|
| Java       | Core logic and structure  |
| OOP        | Classes, objects, methods |
| ArrayList  | Dynamic book storage      |
| Scanner    | User input handling       |

---

## 📂 Project Structure
LibraryManagementSystem/
├── Book.java # Book class with ID, name, author, issue status
├── Library.java # Manages books (add, view, issue, return, search)
├── User.java # (Optional) For future user-specific features
└── libraryManagementSystem.java # Main program with menu and control flow

---

## 📸 Screenshots

> - Menu-![image](https://github.com/user-attachments/assets/ebc16676-078f-49f4-a61f-a8a3900318f8)
> - Book addition-![image](https://github.com/user-attachments/assets/aa90572b-95a2-428e-a095-402ee3a52348)
> - Book issue/return-![image](https://github.com/user-attachments/assets/111c563b-5870-457b-98e8-d3026eabfead)
> - Search operation![image](https://github.com/user-attachments/assets/c5104079-85f7-4a3a-b571-70c0814c596d)


---

## 🧠 Key Learning Outcomes

- ✅ Hands-on with Java classes, methods, and encapsulation
- ✅ Worked with `ArrayList` and control structures
- ✅ Built a mini CLI app following clean, modular code practices
- ✅ Understood user interaction in Java console apps

---

## 🧩 Future Enhancements

- Add search by **book name or author**
- Maintain issued books per **user**
- Implement **data persistence** (e.g., using files or databases)
- Build a **GUI version** using Swing or JavaFX
- Role-based system: Admin vs. User access

---

## 📦 Installation & Running

### Prerequisites
- JDK installed
- IDE (e.g., IntelliJ, Eclipse) or terminal

### Run with Terminal
```bash
javac libraryManagementSystem.java
java libraryManagementSystem

