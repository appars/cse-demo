# ByteBites — CMRIT Campus Food Delivery

A simple Java console application used for demonstrating:

- Git branching
- Pull Requests
- Code Review
- GitHub Copilot Code Review
- Boundary-value thinking
- Human review vs AI-assisted review

> **Classroom Demo:** The application is intentionally small so that developers can focus on reviewing the code rather than understanding a complex application.

---

## Business Scenario

**ByteBites** is a fictional food-delivery service for students on the CMRIT campus.

A student can order food such as:

- Debug Burger
- Bug-Fix Fries
- Stack Overflow Shake

The application calculates the customer's final bill.

---

# Business Requirements

The following requirements represent the expected behaviour of the application.

## R1 — Student Discount

CMRIT students receive a **10% discount** when the order subtotal is **₹500 or more**.

Examples:

| Subtotal | Student | Discount |
|---:|:---:|---:|
| ₹499 | Yes | No |
| ₹500 | Yes | 10% |
| ₹501 | Yes | 10% |

Non-CMRIT students do not receive the student discount.

---

## R2 — Delivery Charge

Delivery is:

- **FREE** when the order subtotal is ₹500 or more
- **₹40** when the order subtotal is below ₹500

Examples:

| Subtotal | Delivery |
|---:|---:|
| ₹499 | ₹40 |
| ₹500 | FREE |
| ₹501 | FREE |

---

## R3 — GST

GST is **5%**.

GST is calculated on:

```text
Amount after discount + Delivery charge
