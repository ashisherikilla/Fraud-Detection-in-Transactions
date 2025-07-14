# 💳 Fraud Detection in Transactions — Java (SQL + DSA Based)

A powerful and beginner-friendly AI-free backend system built with **Java**, showcasing **DSA, SQL, and real-time logic** to detect fraudulent transactions.

This project mimics what startups and MNCs might implement to identify multiple rapid transactions from the same user — a possible fraud signal.

🚀 **Two versions included:**
- 🔹 **SQL Version:** Stores transactions in MySQL, detects fraud in real-time
- 🔹 **DSA-Only Version:** Uses HashMap + ArrayList + time logic without any database

---

## 📁 Folder Structure

FraudDetectionSystem/
├── SQL_Version/
│ └── Main.java
├── DSA_Version/
│ └── Main.java
├── mysql-connector-j-9.3.0.jar
├── README.md

---

## 🔧 How to Compile & Run

### 🟦 Version 1: SQL + JDBC Based

#### 🛠️ Requirements:
- Java JDK 8+
- MySQL installed and running
- `mysql-connector-java-8.0.xx.jar` downloaded and placed in the project folder

#### ⚙️ Compile:

**Windows CMD:**
```bash
javac -cp .;mysql-connector-java-8.0.xx.jar SQL_Version/Main.java
```

# 🧰 Tech Stack Overview
This project is built using Java and integrates MySQL for backend storage, focusing on efficient data handling and security.

# 🚀 Tech Stack Used

- **Language:** Java 8+
- **Data Structures & Algorithms:** HashMap, ArrayList, Sliding Window
- **Time Logic:** `System.currentTimeMillis()`
- **Database:** MySQL 5.7 / 8.0 (SQL version only)
- **Connectivity:** JDBC with `mysql-connector-java-8.0.xx.jar`
- **Query Language:** SQL (`CREATE`, `INSERT`, `SELECT`)
- **Terminal:** CMD / PowerShell / Bash
- **Input Handling:** Java `Scanner` class
- **Security:** Prepared Statements (to prevent SQL Injection)
- **Programming Paradigm:** Procedural + Data Structure-Oriented

---

> Designed for efficiency, simplicity, and secure backend communication.
