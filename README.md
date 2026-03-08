# Expense Sharing Application

## Overview

This project simulates a simple **expense sharing system** similar to applications like Splitwise.
It allows multiple users to record expenses and generates a **balance sheet** showing how much each user owes or should get back from others.

The system calculates:

* Total expenses made by each user
* Total amount the user should get back
* Total amount the user owes to others
* Total payment made
* Individual balances between users

---

## Features

* Add expenses for multiple users
* Track payments made by each user
* Calculate balances between users
* Generate a **balance sheet for each user**
* Display how much a user **owes or should receive**

---

## Sample Output

### Balance Sheet of User: U1001

```
TotalYourExpense: 700.0
TotalGetBack: 600.0
TotalYourOwe: 400.0
TotalPaymentMade: 500.0

userID: U2001  YouGetBack: 300.0  YouOwe: 400.0
userID: U3001  YouGetBack: 300.0  YouOwe: 0.0
```

---

### Balance Sheet of User: U2001

```
TotalYourExpense: 400.0
TotalGetBack: 400.0
TotalYourOwe: 300.0
TotalPaymentMade: 500.0

userID: U1001  YouGetBack: 400.0  YouOwe: 300.0
```

---

### Balance Sheet of User: U3001

```
TotalYourExpense: 300.0
TotalGetBack: 0.0
TotalYourOwe: 300.0
TotalPaymentMade: 0.0

userID: U1001  YouGetBack: 0.0  YouOwe: 300.0
```

---

## Explanation of Fields

| Field            | Description                         |
| ---------------- | ----------------------------------- |
| TotalYourExpense | Total expenses recorded by the user |
| TotalGetBack     | Amount others owe to the user       |
| TotalYourOwe     | Amount the user owes to others      |
| TotalPaymentMade | Amount already paid by the user     |
| YouGetBack       | Amount another user owes you        |
| YouOwe           | Amount you owe another user         |

---

## Example Scenario

* **User U1001** paid more than others, so they should receive money back.
* **User U3001** has not made payments but has expenses shared, so they owe money.
* **User U2001** has both payable and receivable balances.

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Collections Framework
* Maven (for dependency management)

---

## Author

Developed as part of **Low Level Design practice** for backend system design.
