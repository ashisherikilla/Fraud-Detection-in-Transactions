# 💳 Fraud Detection System in Java

## 📌 Overview
A simple simulation to detect suspicious transactions by checking if a user makes **multiple transactions within a short time (60 seconds)**. It mimics real-time fraud detection used in FinTech applications.

## 🚀 Features
- Tracks user transactions using timestamps
- Applies sliding window logic to remove old data
- Flags and prints potential fraud alerts

## 🧠 DSA Concepts Used
- `HashMap`: Maps users to their transaction history
- `ArrayList`: Stores timestamps for each user
- `Sliding Window`: Discards old timestamps to focus on recent ones

## 🛠️ Tech Stack
- Java
- Core DSA (No frameworks)

## 🚀 How to Compile and Run

This project uses **Java (JDK 8+)** and connects to **MySQL** using **JDBC**.  
Make sure you have:
- Java installed (`java -version`)
- MySQL installed and running
- JDBC connector (`mysql-connector-j-9.3.0.jar`) downloaded

## 📂 Folder Structure
FraudDetectionSystem/
├── Main.java
└── README.md
